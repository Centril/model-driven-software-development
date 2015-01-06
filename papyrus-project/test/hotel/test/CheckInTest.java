package hotel.test;

import static hotel.test.util.TestConstants.STALIN;
import static hotel.test.util.TestConstants.TESLA;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import javax.xml.soap.SOAPException;

import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.IBooking;
import Classes.PersonRegistry.IPerson;

public class CheckInTest extends BaseTest {
	private IPerson person, person2;
	private int bookingID, earlyBookingID;
	
	@Before
	public void before() throws SOAPException {
		setupBefore();
		defaultRooms();

		person = setupPerson( TESLA, "somethingTooOld", 0 );
		person2 = setupPerson( STALIN, "somethingOld", 0 );

		bookingID = setupBooking(person, 1, today, inTwoDays);

		cal.add(Calendar.HOUR, 24);
		Date inThreeDays = cal.getTime();
		earlyBookingID = setupBooking(person2, 1, inTwoDays, inThreeDays);
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
