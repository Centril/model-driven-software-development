package hotel.test;

import static org.junit.Assert.*;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.naming.directory.SearchResult;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IBooking;
import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.Hotel.impl.Hotel_HotelImpl;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;

public class CheckInTest {

private static final CreditCardDetails TESLA = ccd("1212131941431336", "666", 2, 16, "Nikola", "Tesla", 100000);
	
	private IFrontDesk frontdesk;
	private Hotel_Hotel hotel;
	private IPersonRegistry personRegistry;
	private IPerson person;
	private ISearch search;
	private IConfiguration config;
	
	private MockOrderRequest order;
	
	private int bookingID;
	
	Calendar cal;
	
	@Before
	public void before() {
		hotel = Hotel_HotelImpl.getInstance();
		frontdesk = hotel;
		personRegistry = IPersonRegistry.instance;
		config = IConfiguration.instance;
		person = personRegistry.createPerson(0);
		search = ISearch.instance;
		
		config.createRoom(2, 400);
		config.createRoom(1, 400);

		person.setFirstName("Nikola");
		person.setLastName("Tesla");
		person.setSSN("somethingTooOld");
		
		person.createCreditCard(TESLA.ccNumber, TESLA.ccv, TESLA.expiryMonth, TESLA.expiryYear, TESLA.firstName, TESLA.lastName);
		
		cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.HOUR, 24*2);
		Date inTwoDays = cal.getTime();
		
		ISearchResult searchResult = search.search(today.getTime(), inTwoDays.getTime(), 1).get(0);
		
		List<BookingRequest> bookings = new BasicEList<>();
		List<Integer> guests = new ArrayList<>(1);
		guests.add(person.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), guests, person.getId()));
		order = new MockOrderRequest(person.getId(), bookings);	
		
		hotel.placeOrder(order);
		bookingID = findBookingIdByContactId(frontdesk, person.getId());
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
		assertTrue(first && !second);
	}
	
	
	@Test
	public void testToEarlyForCheckIn(){
		
	}

	@Test
	public void testToLateForCheckIn(){
		
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
