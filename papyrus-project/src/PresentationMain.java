import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.soap.SOAPException;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IConfiguration;
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
		Hotel_Hotel hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		IConfiguration iConfig = hotel;
		ISearch iSearch = hotel;
		IOrdering iOrder = hotel;
		IPersonRegistry iPersonReg = hotel.getPersonRegistry();
		
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
		System.out.println(iConfig.createRoom(2, 1000));
		System.out.println(iConfig.createRoom(3, 1300));
		
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
		
		
		
		System.out.println("\nComputer over.");
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
