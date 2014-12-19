package hotel.test;

import static org.junit.Assert.*;

import hotel.test.mock.MockOrderRequest;

import javax.xml.soap.SOAPException;

import org.junit.Before;
import org.junit.Test;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.PersonRegistry.IPersonRegistry;

public class HandlePaymentTest {

	private static final CreditCardDetails TESLA = ccd("1212131941431336",
			"666", 2, 16, "Nikola", "Tesla", 100000);

	private CustomerRequires customerRequires;
	private AdministratorRequires adminRequires;
	private ISearch iSearch;
	private IOrdering iOrdering;
	private IPersonRegistry iPersonReg;
	private IConfiguration iConfiguration;
	private IFrontDesk iFrontDesk;

	@Before
	public void before() throws SOAPException {
		// Ensure the existence of credit cards with money associated with some
		// folks.
		customerRequires = CustomerRequires.instance();

		adminRequires = AdministratorRequires.instance();

		setUpAccount(TESLA);

		Hotel_Hotel hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		iSearch = hotel;
		iOrdering = hotel;
		iConfiguration = hotel;
		iFrontDesk = hotel;
		iPersonReg = hotel.getPersonRegistry(); // If not for tests,
												// IPersonRegistry.instance
												// would be used
	}

	@Test
	public void testPayment() {

	}

	private void setUpAccount(CreditCardDetails ccd) throws SOAPException {
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

	private static CreditCardDetails ccd(String ccNumber, String ccv,
			int expiryMonth, int expiryYear, String firstName, String lastName,
			double initialBalance) {
		return new CreditCardDetails(ccNumber, ccv, expiryMonth, expiryYear,
				firstName, lastName, initialBalance);
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
