package hotel.test;

import static org.junit.Assert.*;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;
import hotel.test.util.CreditCardDetails;
import hotel.test.util.TestConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.IBooking;
import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.IOrder;
import Classes.Hotel.ISearchResult;
import Classes.Hotel.OrderRequest;
import Classes.PersonRegistry.IPerson;

public class OrderingTest extends BaseTest {

	@Before
	public void before() throws SOAPException {
		setupBefore();
		for (CreditCardDetails ccd : TestConstants.ALL) {
			setUpAccount(ccd);
		}
	}

	@Test
	public void testOrdering() {
		
		config.createRoom(2, 400);
		config.createRoom(1, 200);
		
		long currentTime = System.currentTimeMillis();
		ISearchResult firstResult = search.search(currentTime, currentTime+1, 3).get(0);
		
		IPerson personOne = personRegistry.createPerson(0);
		personOne.setFirstName("Nikola");
		personOne.setLastName("Tesla");
		personOne.setSSN("somethingTooOld");
		
		IPerson personTwo = personRegistry.createPerson(1);
		personTwo.setFirstName("Herp");
		personTwo.setLastName("Derp");
		personTwo.setSSN("somethingModern");
		
		IPerson personThree = personRegistry.createPerson(2);
		personThree.setFirstName("Best");
		personThree.setLastName("Person");
		personThree.setSSN("Yay~!");
		
		createCreditCard(personOne, TestConstants.TESLA);
		
		List<Integer> guestsInRoomOne = new ArrayList<>(2);
		guestsInRoomOne.add(personOne.getId());
		guestsInRoomOne.add(personTwo.getId());
		
		List<Integer> guestsInRoomTwo = new ArrayList<>(1);
		guestsInRoomOne.add(personThree.getId());
		
		EList<BookingRequest> bookingRequests = new BasicEList<>();
		
		if (firstResult.getBookingSuggestions().get(0).getRoom().getNumBeds() == 2) {
			bookingRequests.add(new MockBookingRequest(firstResult.getBookingSuggestions().get(0), guestsInRoomOne, personOne.getId()));
			bookingRequests.add(new MockBookingRequest(firstResult.getBookingSuggestions().get(1), guestsInRoomTwo, personThree.getId()));
		}
		else {
			bookingRequests.add(new MockBookingRequest(firstResult.getBookingSuggestions().get(1), guestsInRoomOne, personOne.getId()));
			bookingRequests.add(new MockBookingRequest(firstResult.getBookingSuggestions().get(0), guestsInRoomTwo, personThree.getId()));
		}
		
		OrderRequest orderRequest = new MockOrderRequest(personOne.getId(), bookingRequests);
		
		assertTrue(ordering.placeOrder(orderRequest));
	}
	
	@Test
	public void testSimplestPossibleOrdering() {
		config.createRoom(1, 1);
		
		IPerson person = personRegistry.createPerson(0);
		createCreditCard(person, TestConstants.TESLA);
		int personID = person.getId();

		long now = System.currentTimeMillis();
		List<ISearchResult> searchResults = search.search(now + TestConstants.MILLIS_IN_DAY, now + 2 * TestConstants.MILLIS_IN_DAY, 1);
		// Assumes that search is working

		BookingRequest br = new MockBookingRequest(searchResults.get(0).getBookingSuggestions().get(0), Arrays.asList(personID), personID);
		OrderRequest or = new MockOrderRequest(personID, Arrays.asList(br));

		assertTrue(ordering.placeOrder(or));

		List<IOrder> orders = frontdesk.getOrders();
		assertEquals(1, orders.size());
		IOrder order = orders.get(0);
		assertEquals(personID, order.getCustomer());
		assertEquals(1, order.getIBookings().size());
		IBooking booking = order.getIBookings().get(0);
		assertEquals(personID, booking.getContact());
		assertEquals(1, booking.getGuests().size());
		assertEquals(personID, booking.getGuests().get(0).intValue());
	}

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void testForgetBookingSuggestion() {
		config.createRoom(1, 1.0);

		int id = createPerson(0L, TestConstants.DISNEY);

		long now = System.currentTimeMillis();
		search.search(addDays(now, 1), addDays(now, 5), 1);
		OrderRequest or = new MockOrderRequest(id, Arrays.<BookingRequest>asList());

		ordering.placeOrder(or);
	}

	@Test
	public void testDuplicateOrderRequest() {
		config.createRoom(2, 1.0);
		
		int stalin = createPerson(0L, TestConstants.STALIN);
		int tesla = createPerson(-1L, TestConstants.TESLA);

		long now = System.currentTimeMillis();
		EList<ISearchResult> results = search.search(addDays(now, 1), addDays(now, 2), 2);
		IBookingSuggestion bs = results.get(0).getBookingSuggestions().get(0);
		MockBookingRequest stalinBr = new MockBookingRequest(bs, Arrays.asList(stalin, tesla), stalin);
		MockBookingRequest teslaBr = new MockBookingRequest(bs, Arrays.asList(tesla, stalin), tesla);
		assertTrue(ordering.placeOrder(new MockOrderRequest(stalin, Arrays.<BookingRequest>asList(stalinBr))));
		assertFalse(ordering.placeOrder(new MockOrderRequest(tesla, Arrays.<BookingRequest>asList(teslaBr))));
	}

	@Test
	public void testSimultaneousOrder() {
		config.createRoom(2, 2.0);
		config.createRoom(3, 3.0);
		config.createRoom(4, 4.0);

		int[] group1 = createPersons(1L, 2L, 3L, 4L, 5L);
		int tesla = group1[0];
		createCreditCard(personRegistry.getIPersonByID(tesla), TestConstants.TESLA);
		int[] group2 = createPersons(1L, 2L, 3L, 4L, 5L, 6L, 7L);
		int disney = group2[0];
		createCreditCard(personRegistry.getIPersonByID(disney), TestConstants.DISNEY);

		long now = System.currentTimeMillis();
		MockOrderRequest or1 = createOrderRequest(group1, 0, addDays(now, 1), 1);
		MockOrderRequest or2 = createOrderRequest(group2, 0, addDays(now, 3), 2);
		assertTrue(ordering.placeOrder(or2));
		assertTrue(ordering.placeOrder(or1));
	}

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void testBlacklistedCustomer() {
		config.createRoom(1, 1.1);

		int disney = createPerson(-12L, TestConstants.DISNEY);
		personRegistry.addToBlacklist(disney);

		MockOrderRequest or = createOrderRequest(new int[] {disney}, 0, addDays(System.currentTimeMillis(), 1), 2);
		ordering.placeOrder(or);
	}

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void testBlacklistedGuest() {
		config.createRoom(2, 1.1);

		int disney = createPerson(-12L, TestConstants.DISNEY);
		int stalin = createPerson(-1L, TestConstants.STALIN);
		personRegistry.addToBlacklist(stalin);

		MockOrderRequest or = createOrderRequest(new int[] {disney, stalin}, 0, addDays(System.currentTimeMillis(), 1), 2);
		ordering.placeOrder(or);
	}

	private MockOrderRequest createOrderRequest(int[] guests, int customer, long startDate, int days) {
		ISearchResult searchResult = search.search(startDate, addDays(startDate, days), guests.length).get(0);
		List<BookingRequest> brs = new ArrayList<>(searchResult.getBookingSuggestions().size());
		List<Integer> guestList = new ArrayList<>(guests.length);
		for (int guest : guests) {
			guestList.add(guest);
		}
		for (IBookingSuggestion bs : searchResult.getBookingSuggestions()) {
			int staying = Math.min(bs.getRoom().getNumBeds(), guestList.size());
			brs.add(new MockBookingRequest(bs, guestList.subList(0, staying), guests[customer]));
			guestList = guestList.subList(staying, guestList.size());
		}
		return new MockOrderRequest(guests[customer], brs);
	}

	private int[] createPersons(long... birthDates) {
		int[] ids = new int[birthDates.length];
		for (int i = 0; i < birthDates.length; i++) {
			IPerson person = personRegistry.createPerson(birthDates[i]);
			ids[i] = person.getId();
		}
		return ids;
	}

	

}
