package hotel.test;

import static hotel.test.util.TestConstants.TESLA;
import static hotel.test.util.TestConstants.VREESWIJK;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
import Classes.Hotel.ISearchResult;
import Classes.PersonRegistry.IPerson;

public class HandlePaymentTest extends BaseTest {
	private IPerson tesla;
	private IPerson vreeswijk;
	
	@Before
	public void before() throws SOAPException {
		setupBefore();
		config.createRoom(2, 400);
		config.createRoom(1, 400);

		// Ensure the existence of credit cards with money associated with some folks.
		tesla = setupPerson(TESLA, "somethingTooOld", 0);
		vreeswijk = setupPerson(VREESWIJK, "cornelis_vreeswijk", 0);
	}
	
	private boolean pay( int bookingID ) {
		return frontdesk.pay(bookingID);
	}

	private int setupBooking( IPerson p ) {
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.HOUR, 24*2);
		Date inTwoDays = cal.getTime();

		ISearchResult searchResult = search.search(today.getTime(), inTwoDays.getTime(), 1).get(0);
		
		List<BookingRequest> bookings = new BasicEList<>();
		List<Integer> guests = new ArrayList<>(1);
		guests.add(p.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), guests, p.getId()));
		MockOrderRequest order = new MockOrderRequest(p.getId(), bookings);
		return placeOrder(order, p);
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
