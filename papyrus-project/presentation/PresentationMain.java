import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EList;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.BookingRequest;
import Classes.Hotel.IBooking;
import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;

public class PresentationMain {
	private static final CreditCardDetails TESLA = ccd("1212131941431336", "666", 2, 16, "Nikola", "Tesla", 100000);
	private static final CreditCardDetails TORVALDS = ccd("12126664214166", "111", 3, 16, "Linus", "Torvalds", 10000);

	public static void main(String[] args)  {
		System.out.println("Hello, welcome to group 12's presentation!\n");
		
		IConfiguration iConfig = IConfiguration.instance;
		ISearch iSearch = ISearch.instance;
		IOrdering iOrdering = IOrdering.instance;
		IPersonRegistry iPersonReg = IPersonRegistry.instance;
		IFrontDesk iFrontDesk = IFrontDesk.instance;

		System.out.println("Setup: Creates 2 rooms in the newly built hotel. (We only create 2 to be sure to get back the correct ones)");
		System.out.println(iConfig.createRoom(1, 400));
		System.out.println(iConfig.createRoom(1, 450));
		
		System.out.println("\nBuilt a new hotel!");
		
		System.out.println("\nSetup bank account for some famous people and register them in hotel.");
		setUpAccount(TESLA);
		registerPersonInRegistry(iPersonReg, TESLA, -3581025132L);
		setUpAccount(TORVALDS);
		registerPersonInRegistry(iPersonReg, TORVALDS, 25);
		

		// Use case: Search
		System.out.println("\nUse Case: Search\nSearches for available rooms from fifteen minutes from now to 4 days in the future for 2 persons.");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 15); // Add 15 minutes from now, to prevent "can't book in the past" exceptions from the tests.
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
			throw new AssertionError("Presentation failed.");
		}
		
		int torvaldsId = findPersonIdByName(iPersonReg, TORVALDS.firstName, TORVALDS.lastName);
		List<Integer> firstRoomGuests = new ArrayList<>();
		firstRoomGuests.add(torvaldsId);
		MockBookingRequest firstRoom = new MockBookingRequest(results.get(0).getBookingSuggestions().get(0), firstRoomGuests, torvaldsId);
		
		int teslaId = findPersonIdByName(iPersonReg, TESLA.firstName, TESLA.lastName);
		List<Integer> secondRoomGuests = new ArrayList<>();
		secondRoomGuests.add(teslaId);
		MockBookingRequest secondRoom = new MockBookingRequest(results.get(0).getBookingSuggestions().get(1), secondRoomGuests, teslaId);
		
		List<BookingRequest> bookingRequests = new ArrayList<>();
		bookingRequests.add(firstRoom);
		bookingRequests.add(secondRoom);
		MockOrderRequest orderRequest = new MockOrderRequest(torvaldsId, bookingRequests);
		
		if (iOrdering.placeOrder(orderRequest)) {
			System.out.println("placeOrder() succeeded!");
		} else {
			System.out.println("placeOrder() failed!");
		}
		
		
		// Use case: Check in
		System.out.println("\nUse Case: Check in");
		int torvaldsBookingId = findBookingIdByContactId(iFrontDesk, torvaldsId);
		int teslasBookingId = findBookingIdByContactId(iFrontDesk, teslaId);

		if (iFrontDesk.checkIn(torvaldsBookingId, 1)) {
			System.out.println("Torvalds check in succeeded!");
		} else {
			System.out.println("Torvalds check in failed!");
		}
		if (iFrontDesk.checkIn(teslasBookingId, 1)) {
			System.out.println("Tesla check in succeeded!");
		} else {
			System.out.println("Tesla check in failed!");
		}
		
		
		// Use case: Check out
		System.out.println("\nUse Case: Check out");
		System.out
				.println("It's time for checkout, but Torvalds forgets to turn in his key.");
		if (!iFrontDesk.handInKeys(torvaldsBookingId, 0)) {
			System.out.println("The system discovered that Torvalds still has keys.");
			if (iFrontDesk.handInKeys(torvaldsBookingId, 1)) {
				System.out.println("Torvalds handed in the remaining key.");
			}
		} else {
			System.out.println("System failed to notice Torvalds missing key.");
		}
		if (iFrontDesk.checkOut(torvaldsBookingId)) {
			System.out.println("Torvalds check out succeeded!");
		} else {
			System.out.println("Torvalds check out failed!");
		}
		if (iFrontDesk.handInKeys(teslasBookingId, 1)) {
			System.out.println("Teslas hand in keys succeeded");
		}
		if (iFrontDesk.checkOut(teslasBookingId)) {
			System.out.println("Teslas check out succeeded!");
		}
		
		
		// Use case (!?): Get Bill
		System.out.println("\nLets hand out the bills!");
		System.out.println("Cost of Tesla's stay: " + iFrontDesk.getBill(teslasBookingId));
		System.out.println("Cost of Torvalds's stay: " + iFrontDesk.getBill(torvaldsBookingId));
		
		
		// Use case: Handle Payment
		System.out.println("\nUse Case: Handle Payment");
		if (iFrontDesk.pay(torvaldsBookingId)) {
			System.out.println("Torvalds successfully paid for his booking!");
		} else {
			System.out.println("Torvalds failed to pay for his booking.");
		}
		if (iFrontDesk.pay(teslasBookingId)) {
			System.out.println("Torvalds successfully paid for Teslas booking!");
		} else {
			System.out.println("Torvalds failed to pay for Teslas booking.");
		}
		
		
		// Simultaneous booking
		System.out.println("\nSo, what happens if two persons try to book the same room at the same time? Let's find out.");
		
		System.out.println("Create a new room to attempt to book.");
		System.out.println(iConfig.createRoom(2, 1000));
		
		EList<ISearchResult> newResults = iSearch.search(today.getTime(), fourDaysFromNow.getTime(), 2);
		IBookingSuggestion sharedBookingSuggestion = newResults.get(0).getBookingSuggestions().get(0);
		MockBookingRequest torvaldssNewBooking = new MockBookingRequest(sharedBookingSuggestion, Arrays.asList(torvaldsId, teslaId), torvaldsId);
		MockBookingRequest teslasNewBooking = new MockBookingRequest(sharedBookingSuggestion, Arrays.asList(teslaId, torvaldsId), teslaId);
		
		if (iOrdering.placeOrder(new MockOrderRequest(torvaldsId, Arrays.<BookingRequest>asList(torvaldssNewBooking)))) {
			System.out.println("Torvalds made a booking.");
		} else {
			System.out.println("Torvalds failed to make a booking.");
		}
		if (iOrdering.placeOrder(new MockOrderRequest(teslaId, Arrays.<BookingRequest>asList(teslasNewBooking)))) {
			System.out.println("Tesla made a booking.");
		} else {
			System.out.println("Tesla failed to make a booking");
		}
		System.out.println("Torvalds succeeded since he placed the order before Tesla.");
		
		System.out.println("\nPresentation done!");
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
