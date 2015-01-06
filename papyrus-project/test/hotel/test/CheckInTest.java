package hotel.test;

import static hotel.test.util.TestConstants.TESLA;
import static hotel.test.util.TestConstants.STALIN;
import static org.junit.Assert.*;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.IBooking;
import Classes.Hotel.ISearchResult;
import Classes.PersonRegistry.IPerson;

public class CheckInTest extends BaseTest {
	private IPerson person, person2;

	private MockOrderRequest order;

	private int bookingID, lateBookingID, earlyBookingID;

	Calendar cal;
	
	@Before
	public void before() throws SOAPException {
		setupBefore();
		config.createRoom(2, 400);
		config.createRoom(1, 400);

		person = setupPerson( TESLA, "somethingTooOld", 0 );
		person2 = setupPerson( STALIN, "somethingOld", 0 );

		// Offset one hour into future (dirty fix)
		cal = Calendar.getInstance();		
		cal.add(Calendar.HOUR, 1);
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
		
		bookingID = placeOrder(order, person);
	
		searchResult = search.search(inTwoDays.getTime(), inThreeDays.getTime(), 1).get(0);
		
		List<BookingRequest> newBookings = new BasicEList<>();
		List<Integer> newGuests = new ArrayList<>(1);
		newGuests.add(person2.getId());
		newBookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), newGuests, person2.getId()));
		order = new MockOrderRequest(person2.getId(), newBookings);	

		earlyBookingID = placeOrder(order, person2);

		searchResult = search.search(inTwoDays.getTime(), inThreeDays.getTime(), 1).get(0);
		
		bookings = new BasicEList<>();
		guests = new ArrayList<>(1);
		guests.add(person2.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), newGuests, person2.getId()));
		order = new MockOrderRequest(person2.getId(), newBookings);	
	
		//lateBookingID = placeOrder(order, person2);
	}
	
	@Test
	public void testCantFindBooking(){
		IBooking booking = frontdesk.getRelevantCheckInBookings(person.getId()).get(0);
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
		IBooking booking = frontdesk.getRelevantCheckInBookings(person.getId()).get(0);

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
}
