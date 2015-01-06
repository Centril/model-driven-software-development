package hotel.test;

import static hotel.test.util.TestConstants.TESLA;
import static hotel.test.util.TestConstants.VREESWIJK;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.xml.soap.SOAPException;

import org.junit.Before;
import org.junit.Test;

import Classes.PersonRegistry.IPerson;

public class HandlePaymentTest extends BaseTest {
	private IPerson tesla;
	private IPerson vreeswijk;
	
	@Before
	public void before() throws SOAPException {
		setupBefore();
		defaultRooms();
		// Ensure the existence of credit cards with money associated with some folks.
		tesla = setupPerson(TESLA, "somethingTooOld", 0);
		vreeswijk = setupPerson(VREESWIJK, "cornelis_vreeswijk", 0);
	}
	
	private boolean pay( int bookingID ) {
		return frontdesk.pay(bookingID);
	}

	@Test
	public void testPaymentInvalidBooking() {
		// Try to pay for a booking that doesn't exist, expect failure.
		assertFalse( pay( 0 ) );
	}

	@Test
	public void testPaymentNormal() {
		// Setup the booking & pay it with success.
		int bookingID = setupBooking( tesla );
		assertTrue( pay( bookingID ) );
	}

	@Test
	public void testPaymentAlreadyPaid() {
		// Setup the booking & pay it with success.
		int bookingID = setupBooking( tesla );
		assertTrue( pay( bookingID ) );

		// Try to pay again, this time with failure.
		assertFalse( pay( bookingID ) );
	}

	@Test
	public void testPaymentInsufficientFunds() {
		// Setup the booking & pay it with success.
		int bookingID = setupBooking( vreeswijk );
		assertFalse( pay( bookingID ) );
	}

	@Test
	public void testPaymentInvalidCC() throws SOAPException {
		int bookingID = setupBooking( tesla );
		removeCCD( TESLA );
		assertFalse( pay( bookingID ) );
	}
}
