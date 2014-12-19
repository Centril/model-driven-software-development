import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EList;

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



public class PresentationMain {
	private static final CreditCardDetails TESLA = ccd("1212131941431336", "666", 2, 16, "Nikola", "Tesla", 100000);
	private static final CreditCardDetails STALIN = ccd("1212666666666666", "111", 3, 16, "Joseph", "Stalin", 10000);
	private static final CreditCardDetails DISNEY = ccd("1212191919191919", "333", 4, 16, "Walt", "Disney", 250000);

	
	public static void main(String[] args)  {
		System.out.println("Hello, welcome to group 12's presentation!\n");
		
		System.out.println("\nBuilt a new hotel!");
		IConfiguration iConfig = IConfiguration.instance;
		ISearch iSearch = ISearch.instance;
		IOrdering iOrdering = IOrdering.instance;
		IPersonRegistry iPersonReg = IPersonRegistry.instance;
		IFrontDesk iFrontDesk = IFrontDesk.instance;
		
		System.out.println("\nSetup bank account for some famous people and register them in hotel.");
		setUpAccount(TESLA);
		registerPersonInRegistry(iPersonReg, TESLA, -3581025132L);
		setUpAccount(STALIN);
		registerPersonInRegistry(iPersonReg, STALIN, 25);
		setUpAccount(DISNEY);
		registerPersonInRegistry(iPersonReg, DISNEY, 32);
		
		System.out.println("\nSetup (use case maybe): Creates 4 rooms in the newly built hotel.");
		System.out.println(iConfig.createRoom(1, 400));
		System.out.println(iConfig.createRoom(1, 450));
		//System.out.println(iConfig.createRoom(2, 1000));
		//System.out.println(iConfig.createRoom(3, 1300));
		
		
		// Use case: Search
		System.out.println("\nUse Case: Search\nSearches for available rooms from today to 4 days in the future for 2 persons.");
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.HOUR, 24*4);
		Date fourDaysFromNow = cal.getTime();
		List<ISearchResult> results = iSearch.search(today.getTime(), fourDaysFromNow.getTime(), 2);
		System.out.println("Got back " + results.size() + " search results.");
		for (ISearchResult result : results) {
			System.out.println(result.toString());
		}
		
		
		// Use case: Ordering
		System.out.println("\nUse Case: Ordering");
		if (results.get(0).getBookingSuggestions().size() != 2) {
			throw new AssertionError("This should never happan in presentation exception.");
		}
		
		int stalinId = findPersonIdByName(iPersonReg, STALIN.firstName, STALIN.lastName);
		List<Integer> firstRoomGuests = new ArrayList<>();
		firstRoomGuests.add(stalinId);
		MockBookingRequest firstRoom = new MockBookingRequest(results.get(0).getBookingSuggestions().get(0), firstRoomGuests, stalinId);
		
		int teslaId = findPersonIdByName(iPersonReg, TESLA.firstName, TESLA.lastName);
		List<Integer> secondRoomGuests = new ArrayList<>();
		secondRoomGuests.add(teslaId);
		MockBookingRequest secondRoom = new MockBookingRequest(results.get(0).getBookingSuggestions().get(1), secondRoomGuests, teslaId);
		
		List<BookingRequest> bookingRequests = new ArrayList<>();
		bookingRequests.add(firstRoom);
		bookingRequests.add(secondRoom);
		MockOrderRequest orderRequest = new MockOrderRequest(stalinId, bookingRequests);
		
		if (iOrdering.placeOrder(orderRequest)) {
			System.out.println("placeOrder() succeeded!");
		} else {
			System.out.println("placeOrder() failed!");
		}
		
		
		// Use case: Check in
		System.out.println("\nUse Case: Check in");
		int stalinsBookingId = findBookingIdByContactId(iFrontDesk, stalinId);
		int teslasBookingId = findBookingIdByContactId(iFrontDesk, teslaId);

		if (iFrontDesk.checkIn(stalinsBookingId, 1)) {
			System.out.println("Stalins check in succeded!");
		} else {
			System.out.println("Stalins check in failed!");
		}
		if (iFrontDesk.checkIn(teslasBookingId, 1)) {
			System.out.println("Teslas check in succeeded!");
		} else {
			System.out.println("Teslas check in failed!");
		}
		
		
		// Use case: Check out
		System.out.println("\nUse Case: Check out");
		System.out.println("It's time for checkout, but Stalin is a sneaky guy and attempts to keep his key.");
		if (!iFrontDesk.handInKeys(stalinsBookingId, 0)) {
			System.out.println("Though luck for you Stalin! The system discovered that you still have keys. Now lets wait for the police.");
			if (iFrontDesk.handInKeys(stalinsBookingId, 1)) {
				System.out.println("Okay then, since you handed it in so quickly we'll forget about it this time.");
			} else {
				System.out.println("Police are here");
			}
		} else {
			System.out.println("Sneaky guy Stalin successfully stole key");
		}
		if (iFrontDesk.checkOut(stalinsBookingId)) {
			System.out.println("Stalins check out succeded!");
		} else {
			System.out.println("Stalins check out faield!");
		}
		if (iFrontDesk.handInKeys(teslasBookingId, 1)) {
			System.out.println("Teslas hand in keys succeded");
		}
		if (iFrontDesk.checkOut(teslasBookingId)) {
			System.out.println("Teslas check out succeeded!");
		}
		
		
		// Use case (!?): Get Bill
		System.out.println("\nNow lets hand out the bills!");
		System.out.println("Cost of Tesla's stay: " + iFrontDesk.getBill(teslasBookingId));
		System.out.println("Cost of Stalin's stay: " + iFrontDesk.getBill(stalinsBookingId));
		
		
		// Use case: Handle Payment
		System.out.println("\nUse Case: Pay");
		if (iFrontDesk.pay(stalinsBookingId)) {
			System.out.println("Comrade Stalin successfully paid for his booking!");
		} else {
			System.out.println("Stalin failed to pay for his booking. Police are on their way.");
		}
		if (iFrontDesk.pay(teslasBookingId)) {
			System.out.println("Comrade Stalin successfully paid for Teslas booking!");
		} else {
			System.out.println("Stalin failed to pay for Teslas booking.");
		}
		
		System.out.println("\nComputer over.");
	}
	
	private static int findBookingIdByContactId(IFrontDesk iFrontDesk, int contactId) {
		for (IBooking booking : iFrontDesk.getBookings()) {
			if (booking.getContact() == contactId) {
				return booking.getID();
			}
		}
		return -1;
	}
	
	private static int findPersonIdByName(IPersonRegistry iPersonReg, String firstName, String lastName) {
		EList<IPerson> persons = iPersonReg.getIPeople();
		for (IPerson person : persons) {
			if (person.getFirstName().equalsIgnoreCase(firstName) && person.getLastName().equalsIgnoreCase(lastName)) {
				return person.getId();
			}
		}
		return -1;
	}
	
	private static void registerPersonInRegistry(IPersonRegistry personRegistry, CreditCardDetails ccd, long birthDate) {
		IPerson createdPerson = personRegistry.createPerson(birthDate);
		createdPerson.setFirstName(ccd.firstName);
		createdPerson.setLastName(ccd.lastName);
		createdPerson.setSSN("Nope");
		createdPerson.createCreditCard(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName);
	}
	
	private static void setUpAccount(CreditCardDetails ccd) {
		try {
			CustomerRequires customerRequires = CustomerRequires.instance();
			AdministratorRequires adminRequires = AdministratorRequires.instance();
			if (customerRequires.isCreditCardValid(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName)) {
				adminRequires.removeCreditCard(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName);
			}
			adminRequires.addCreditCard(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName);
			adminRequires.makeDeposit(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName, ccd.initialBalance);
		} catch (SOAPException e) {
		}
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
