package hotel.test;

import static hotel.test.util.TestConstants.TESLA;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.xml.soap.SOAPException;

import org.junit.Before;
import org.junit.Test;

import Classes.PersonRegistry.IPerson;

public class CheckOutTest extends BaseTest {
	private IPerson person;
	private int bookingID;

	@Before
	public void before() throws SOAPException {
		setupBefore();
		defaultRooms();
		person = setupPerson( TESLA, "somethingTooOld", 0 );
		bookingID = setupBooking(person);
	}
	
	@Test 
	public void testCheckOutwithNoBooking() {
		assertTrue(!frontdesk.checkOut(Integer.MAX_VALUE)); //No booking should have been done
	}

	@Test
	public void testCheckOutWithBooking() {
		assertFalse(frontdesk.checkOut(bookingID));
		frontdesk.checkIn(bookingID, 3);
		assertTrue(frontdesk.checkOut(bookingID));
	}
	
	@Test
	public void testHandInKeys() {
		frontdesk.checkIn(bookingID, 3);
		boolean first = frontdesk.handInKeys(bookingID, 2);
		boolean second = frontdesk.handInKeys(bookingID, 1);
		assertTrue(!first && second); //Should fail with wrong number of keys, but work with right number
		frontdesk.checkOut(bookingID); // For good measure
	}
}
