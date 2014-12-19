package hotel.test;

import static org.junit.Assert.assertTrue;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.IPersistenceService;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.Hotel.impl.Hotel_HotelImpl;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;

public class CheckOutTest {
	
	private static final CreditCardDetails TESLA = ccd("1212131941431336", "666", 2, 16, "Nikola", "Tesla", 100000);
	
	private IFrontDesk frontdesk;
	private Hotel_Hotel hotel;
	private IPersonRegistry personRegistry;
	private IPerson person;
	private ISearch search;
	private IConfiguration config;
	private IPersistenceService persistance;
	
	private MockOrderRequest order;
	
	private int bookingID;
	
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
		
		ISearchResult searchResult = search.search(System.currentTimeMillis(), System.currentTimeMillis()+1, 1).get(0);
		
		List<BookingRequest> bookings = new BasicEList<>();
		List<Integer> guests = new ArrayList<>(1);
		guests.add(person.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), guests, person.getId()));
		order = new MockOrderRequest(person.getId(), bookings);		
		

		hotel.placeOrder(order);
		bookingID = hotel.getBookings().get(0).getID();		
	}
	
	@Test 
	public void testCheckOutwithNoBooking() {
		assertTrue(!frontdesk.checkOut(Integer.MAX_VALUE)); //No booking should have this value
	}

	@Test
	public void testCheckOutWithBooking() {
		boolean firstTry = frontdesk.checkOut(bookingID);
		frontdesk.checkIn(bookingID, 3);
		boolean secondTry = frontdesk.checkOut(bookingID);
		assertTrue(!firstTry && secondTry); //First try should fail and second succeed and booking should be checked out	
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
}
