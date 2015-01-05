package hotel.test;

import static org.junit.Assert.*;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IBooking;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.Hotel.impl.Hotel_HotelImpl;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;

public class CheckInTest {

	private static final CreditCardDetails TESLA = ccd("1212131941431336", "666", 2, 16, "Nikola", "Tesla", 100000);
	private static final CreditCardDetails STALIN = ccd("1212666666666666", "111", 3, 16, "Joseph", "Stalin", 10000);
	
	private IFrontDesk frontdesk;
	private Hotel_Hotel hotel;
	private IPersonRegistry personRegistry;
	private IPerson person, person2;
	private ISearch search;
	private IConfiguration config;
	
	private MockOrderRequest order;
	
	private int bookingID, lateBookingID, earlyBookingID;
	
	Calendar cal;
	
	@Before
	public void before() {
		hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		frontdesk = hotel;
		config = hotel;
		search = hotel;
		personRegistry = hotel.getPersonRegistry();
		person = personRegistry.createPerson(0);
		person2 = personRegistry.createPerson(0);
		
		config.createRoom(2, 400);
		config.createRoom(1, 400);

		person.setFirstName("Nikola");
		person.setLastName("Tesla");
		person.setSSN("somethingTooOld");
		
		person.createCreditCard(TESLA.ccNumber, TESLA.ccv, TESLA.expiryMonth, TESLA.expiryYear, TESLA.firstName, TESLA.lastName);
		
		person.setFirstName("Joseph");
		person.setLastName("Stalin");
		person.setSSN("somethingOlder");
		
		person2.createCreditCard(STALIN.ccNumber, STALIN.ccv, STALIN.expiryMonth, STALIN.expiryYear, STALIN.firstName, STALIN.lastName);
		
		
		cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.HOUR, 24*2);
		Date inTwoDays = cal.getTime();
		cal.add(Calendar.HOUR, 24);
		Date inThreeDays = cal.getTime();
		
		ISearchResult searchResult = search.search(today.getTime(), inTwoDays.getTime(), 1).get(0);
		
		List<BookingRequest> bookings = new BasicEList<>();
		List<Integer> guests = new ArrayList<>(1);
		guests.add(person.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), guests, person.getId()));
		order = new MockOrderRequest(person.getId(), bookings);	
		
		hotel.placeOrder(order);
		bookingID = findBookingIdByContactId(frontdesk, person.getId());
		
		searchResult = search.search(inTwoDays.getTime(), inThreeDays.getTime(), 1).get(0);
		
		List<BookingRequest> newBookings = new BasicEList<>();
		List<Integer> newGuests = new ArrayList<>(1);
		newGuests.add(person2.getId());
		newBookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), newGuests, person2.getId()));
		order = new MockOrderRequest(person2.getId(), newBookings);	
		
		hotel.placeOrder(order);
		earlyBookingID = findBookingIdByContactId(frontdesk, person2.getId());


		searchResult = search.search(inTwoDays.getTime(), inThreeDays.getTime(), 1).get(0);
		
		bookings = new BasicEList<>();
		guests = new ArrayList<>(1);
		guests.add(person2.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), newGuests, person2.getId()));
		order = new MockOrderRequest(person2.getId(), newBookings);	
		
		//hotel.placeOrder(order);
		//lateBookingID = findBookingIdByContactId(frontdesk, person2.getId());
		
		
		
		
	}
	
	@Test
	public void testCantFindBooking(){
		IBooking booking = hotel.getRelevantCheckInBookings(person.getId()).get(0);
		if(booking == null) {
			assertTrue(false);
		} else {
			//Should find a booking with relevant info
			assertTrue(booking.getID() == bookingID && booking.getContact() == person.getId());
		}
	}
	
	@Test 
	public void testCheckInHaveNoBooking() {
		int sampleID = bookingID + 1; //Should only exist one booking, ergo one bookingID
		assertTrue(!frontdesk.checkIn(sampleID, 2));
	}

	@Test
	public void testCheckInAndDoubleCheckIn() {
		boolean first = frontdesk.checkIn(bookingID, 2);
		boolean second = frontdesk.checkIn(bookingID, 2);
		assertTrue(first && !second); //First checkin should succeed and second should fail
	}

	@Test
	public void checkInCancelledBooking(){
		IBooking booking = hotel.getRelevantCheckInBookings(person.getId()).get(0);

		assertFalse(booking.isCancelled());
		assertTrue(frontdesk.cancelBooking(bookingID));
		assertTrue(booking.isCancelled());
		
		// Make sure you can't check in a cancelled booking
		assertFalse(frontdesk.checkIn(bookingID, 1));
	}
	
	@Test
	public void testToEarlyForCheckIn(){
		assertTrue(!frontdesk.checkIn(earlyBookingID, 2));
	}

	@Test
	public void testToLateForCheckIn(){
		//TODO: Fix changing time in system or skip this test
		//assertTrue(!frontdesk.checkIn(lateBookingID, 2));
	}
	
	
	private static CreditCardDetails ccd (String ccNumber, String ccv, int expiryMonth,
			int expiryYear, String firstName, String lastName, double initialBalance) {
		return new CreditCardDetails(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, initialBalance);
	}
	
	private static class CreditCardDetails {
		final String ccNumber;
		final String ccv;
		final int expiryMonth;
		final int expiryYear;
		final String firstName;
		final String lastName;
		final double initialBalance;

		public CreditCardDetails(String ccNumber, String ccv, int expiryMonth,
				int expiryYear, String firstName, String lastName,
				double initialBalance) {
			this.ccNumber = ccNumber;
			this.ccv = ccv;
			this.expiryMonth = expiryMonth;
			this.expiryYear = expiryYear;
			this.firstName = firstName;
			this.lastName = lastName;
			this.initialBalance = initialBalance;
		}
	}
	
	private static int findBookingIdByContactId(IFrontDesk iFrontDesk, int contactId) {
		for (IBooking booking : iFrontDesk.getBookings()) {
			if (booking.getContact() == contactId) {
				return booking.getID();
			}
		}
		return -1;
	}
}
