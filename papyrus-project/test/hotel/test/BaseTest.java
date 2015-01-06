package hotel.test;

import static org.junit.Assert.assertTrue;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;
import hotel.test.util.CreditCardDetails;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.BasicEList;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.BookingRequest;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IBooking;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;
import Classes.PersonRegistry.PersonRegistryFactory;

public abstract class BaseTest {
	protected ISearch search;
	protected IFrontDesk frontdesk;
	protected IPersonRegistry personRegistry;
	protected IOrdering ordering;
	protected IConfiguration config;
	protected CustomerRequires customerRequires;
	protected AdministratorRequires adminRequires;

	public void setupBefore() throws SOAPException {
		// ISearch.instance, and similar, would be used for real implementation,
		// for testing purposes though, we use the generated factory to get a
		// new instance of the hotel for each test
		customerRequires = CustomerRequires.instance();
		adminRequires = AdministratorRequires.instance();
		
		Hotel_Hotel hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		search = hotel;
		ordering = hotel;
		config = hotel;
		frontdesk = hotel;
		
		// If not for tests, IPersonRegistry.instance would be used
		personRegistry = PersonRegistryFactory.eINSTANCE.createPersonRegistry_PersonRegistry();
		hotel.setPersonRegistry(personRegistry);
	}
	
	protected Calendar cal() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 1);
		return cal;
	}

	protected int setupBooking( IPerson p, int numPersons, Date from, Date to ) {
		ISearchResult searchResult = search.search(from.getTime(), to.getTime(), 1).get(0);
		List<BookingRequest> bookings = new BasicEList<>();
		List<Integer> guests = new ArrayList<>(1);
		guests.add(p.getId());
		bookings.add(new MockBookingRequest(searchResult.getBookingSuggestions().get(0), guests, p.getId()));
		MockOrderRequest order = new MockOrderRequest(p.getId(), bookings);
		return placeOrder(order, p);
	}

	protected IPerson setupPerson( CreditCardDetails ccd, String ssn, int birthDate ) throws SOAPException {
		setUpAccount( ccd );

		IPerson person = personRegistry.createPerson( birthDate );
		person.setFirstName( ccd.firstName );
		person.setLastName( ccd.lastName );
		person.setSSN( ssn );
		person.createCreditCard( ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName);

		return person;
	}
	
	protected void removeCCD( CreditCardDetails ccd ) throws SOAPException {
		assertTrue( adminRequires.removeCreditCard(
				ccd.ccNumber, ccd.ccv,
				ccd.expiryMonth, ccd.expiryYear, ccd.firstName,
				ccd.lastName) );
	}

	protected void setUpAccount(CreditCardDetails ccd) throws SOAPException {
		if (customerRequires.isCreditCardValid(ccd.ccNumber, ccd.ccv,
				ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName)) {
			removeCCD( ccd );
		}

		assertTrue(adminRequires.addCreditCard(ccd.ccNumber, ccd.ccv,
			ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName));

		adminRequires.makeDeposit(ccd.ccNumber, ccd.ccv, ccd.expiryMonth,
			ccd.expiryYear, ccd.firstName, ccd.lastName,
			ccd.initialBalance);
	}

	protected int placeOrder(MockOrderRequest order, IPerson person) {
		ordering.placeOrder(order);
		return findBookingIdByContactId(person.getId());
	}

	protected int findBookingIdByContactId(int contactId) {
		for (IBooking booking : frontdesk.getBookings()) {
			if (booking.getContact() == contactId) {
				return booking.getID();
			}
		}
		return -1;
	}
}
