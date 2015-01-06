package hotel.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;
import hotel.test.util.CreditCardDetails;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.ISearchResult;
import Classes.PersonRegistry.IPerson;

public class CheckOutTest extends BaseTest {
	
	private static final CreditCardDetails TESLA = CreditCardDetails.ccd("1212131941431336", "666", 2, 16, "Nikola", "Tesla", 100000);
	
	private IPerson person;
	private Calendar cal;
	private Date today;
	private Date inTwoDays;
	
	private MockOrderRequest order;
	
	@Before
	public void before() throws SOAPException {
		setupBefore();
		
		config.createRoom(2, 400);
		config.createRoom(1, 400);
		
		person = personRegistry.createPerson(0);
		person.setFirstName("Nikola");
		person.setLastName("Tesla");
		person.setSSN("somethingTooOld");
		
		person.createCreditCard(TESLA.ccNumber, TESLA.ccv, TESLA.expiryMonth, TESLA.expiryYear, TESLA.firstName, TESLA.lastName);
		cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 15);
		today = cal.getTime();
		cal.add(Calendar.HOUR, 24*2);
		inTwoDays = cal.getTime();
		
		ISearchResult searchResult = search.search(today.getTime(), inTwoDays.getTime(), 1).get(0);
		
		List<BookingRequest> bookings = new BasicEList<>();
		List<Integer> guests = new ArrayList<>(1);
		guests.add(person.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), guests, person.getId()));
		order = new MockOrderRequest(person.getId(), bookings);			
	}
	
	@Test 
	public void testCheckOutwithNoBooking() {
		assertTrue(!frontdesk.checkOut(Integer.MAX_VALUE)); //No booking should have been done
	}

	@Test
	public void testCheckOutWithBooking() {
		int bookingID = placeOrder(order, person);
		assertFalse(frontdesk.checkOut(bookingID));
		frontdesk.checkIn(bookingID, 3);
		assertTrue(frontdesk.checkOut(bookingID));
	}
	
	@Test
	public void testHandInKeys() {
		ISearchResult searchResult = search.search(today.getTime(), inTwoDays.getTime(), 1).get(0);
		
		List<BookingRequest> bookings = new BasicEList<>();
		List<Integer> guests = new ArrayList<>(1);
		guests.add(person.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), guests, person.getId()));
		order = new MockOrderRequest(person.getId(), bookings);	
		
		int bookingID = placeOrder(order, person);
		frontdesk.checkIn(bookingID, 3);
		boolean first = frontdesk.handInKeys(bookingID, 2);
		boolean second = frontdesk.handInKeys(bookingID, 1);
		assertTrue(!first && second); //Should fail with wrong number of keys, but work with right number
		frontdesk.checkOut(bookingID); // For good measure
	}

}
