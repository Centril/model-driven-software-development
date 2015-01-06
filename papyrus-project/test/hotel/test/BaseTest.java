package hotel.test;

import static org.junit.Assert.assertTrue;
import hotel.test.mock.MockOrderRequest;
import hotel.test.util.CreditCardDetails;

import javax.xml.soap.SOAPException;

import org.junit.Before;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IBooking;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
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

	@Before
	public void before() throws SOAPException {
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

	protected IPerson setupPerson( CreditCardDetails ccd, String ssn, int birthDate ) throws SOAPException {
		setUpAccount( ccd );

		IPerson person = personRegistry.createPerson( birthDate );
		person.setFirstName( ccd.firstName );
		person.setLastName( ccd.lastName );
		person.setSSN( ssn );
		person.createCreditCard( ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName);

		return person;
	}

	protected void setUpAccount(CreditCardDetails ccd) throws SOAPException {
		if (customerRequires.isCreditCardValid(ccd.ccNumber, ccd.ccv,
				ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName)) {
			assertTrue(adminRequires.removeCreditCard(ccd.ccNumber, ccd.ccv,
					ccd.expiryMonth, ccd.expiryYear, ccd.firstName,
					ccd.lastName));
		}
		assertTrue(adminRequires.addCreditCard(ccd.ccNumber, ccd.ccv,
				ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName));
		adminRequires
				.makeDeposit(ccd.ccNumber, ccd.ccv, ccd.expiryMonth,
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
