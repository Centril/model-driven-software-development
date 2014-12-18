package hotel.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import javax.xml.soap.SOAPException;

import org.junit.Before;
import org.junit.Test;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.PersonRegistry.IPersonRegistry;

public class OrderingTest {
	private static final CreditCardDetails TESLA = ccd("1212 1319 4143 1336", "666", 2, 2077, "Nikola", "Tesla", 100000);
	private static final CreditCardDetails STALIN = ccd("1212 6666 6666 6666", "111", 3, 2856, "Joseph", "Stalin", 10000);
	private static final CreditCardDetails DISNEY = ccd("1212 1919 1919 1919", "333", 4, 2356, "Walt", "Disney", 250000);

	private CustomerRequires customerRequires;
	private AdministratorRequires adminRequires;
	private ISearch iSearch;
	private IOrdering iOrdering;
	private IPersonRegistry iPersonReg;
	
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
		iPersonReg = hotel.getPersonRegistry();
	}

	private void setUpAccount(CreditCardDetails ccd) throws SOAPException {
		if (customerRequires.isCreditCardValid(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName)) {
			adminRequires.removeCreditCard(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName);
		}
		adminRequires.addCreditCard(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName);
		adminRequires.makeDeposit(ccd.ccNumber, ccd.ccv, ccd.expiryMonth, ccd.expiryYear, ccd.firstName, ccd.lastName, ccd.initialBalance);
	}

	@Test
	public void testOrdering() {
		
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
