package hotel.test;

import static org.junit.Assert.*;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.BookingRequest;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.Hotel.OrderRequest;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;
import Classes.PersonRegistry.PersonRegistryFactory;

public class OrderingTest {
	private static final CreditCardDetails TESLA = ccd("1212131941431336", "666", 2, 16, "Nikola", "Tesla", 100000);
	private static final CreditCardDetails STALIN = ccd("1212666666666666", "111", 3, 16, "Joseph", "Stalin", 10000);
	private static final CreditCardDetails DISNEY = ccd("1212191919191919", "333", 4, 16, "Walt", "Disney", 250000);

	private CustomerRequires customerRequires;
	private AdministratorRequires adminRequires;
	private ISearch iSearch;
	private IOrdering iOrdering;
	private IPersonRegistry iPersonReg;
	private IConfiguration iConfiguration;
	
	@Before
	public void before() throws SOAPException {
		// Ensure the existence of credit cards with money associated with some folks.
		customerRequires = CustomerRequires.instance();

		adminRequires = AdministratorRequires.instance();

		for (CreditCardDetails ccd : Arrays.asList(TESLA, STALIN, DISNEY)) {
			setUpAccount(ccd);
		}
		
		Hotel_Hotel hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		iSearch = hotel;
		iOrdering = hotel;
		iConfiguration = hotel;
		iPersonReg = PersonRegistryFactory.eINSTANCE.createPersonRegistry_PersonRegistry();
	}

	private void setUpAccount(CreditCardDetails ccd) throws SOAPException {
		if (customerRequires.isCreditCardValid(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName)) {
			assertTrue(adminRequires.removeCreditCard(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName));
		}
		assertTrue(adminRequires.addCreditCard(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName));
		adminRequires.makeDeposit(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName, ccd.initialBalance);
	}

	@Test
	public void testOrdering() {
		IConfiguration config = IConfiguration.instance;
		ISearch search = ISearch.instance;
		IPersonRegistry personReg = IPersonRegistry.instance;
		IOrdering ordering = IOrdering.instance;
		
		config.createRoom(2, 400);
		config.createRoom(1, 200);
		
		ISearchResult firstResult = search.search(System.currentTimeMillis(), System.currentTimeMillis()+1, 3).get(0);
		
		IPerson personOne = personReg.createPerson(0);
		personOne.setFirstName("Nikola");
		personOne.setLastName("Tesla");
		personOne.setSSN("somethingTooOld");
		
		IPerson personTwo = personReg.createPerson(1);
		personTwo.setFirstName("Herp");
		personTwo.setLastName("Derp");
		personTwo.setSSN("somethingModern");
		
		IPerson personThree = personReg.createPerson(2);
		personThree.setFirstName("Best");
		personThree.setLastName("Person");
		personThree.setSSN("Yay~!");
		
		personOne.createCreditCard(TESLA.ccNumber, TESLA.ccv, TESLA.expiryMonth, TESLA.expiryYear, TESLA.firstName, TESLA.lastName);
		
		List<Integer> guestsInRoomOne = new ArrayList<>(2);
		guestsInRoomOne.add(personOne.getId());
		guestsInRoomOne.add(personTwo.getId());
		
		List<Integer> guestsInRoomTwo = new ArrayList<>(1);
		guestsInRoomOne.add(personThree.getId());
		
		EList<BookingRequest> bookingRequests = new BasicEList<>();
		
		if (firstResult.getBookingSuggestions().get(0).getRoom().getNumBeds() == 2) {
			bookingRequests.add(new MockBookingRequest(firstResult.getBookingSuggestions().get(0), guestsInRoomOne, personOne.getId()));
			bookingRequests.add(new MockBookingRequest(firstResult.getBookingSuggestions().get(1), guestsInRoomTwo, personThree.getId()));
		}
		else {
			bookingRequests.add(new MockBookingRequest(firstResult.getBookingSuggestions().get(1), guestsInRoomOne, personOne.getId()));
			bookingRequests.add(new MockBookingRequest(firstResult.getBookingSuggestions().get(0), guestsInRoomTwo, personThree.getId()));
		}
		
		OrderRequest orderRequest = new MockOrderRequest(personOne.getId(), bookingRequests);
		
		assertTrue(ordering.placeOrder(orderRequest));
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
