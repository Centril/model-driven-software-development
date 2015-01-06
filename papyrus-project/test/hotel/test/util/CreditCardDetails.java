package hotel.test.util;

public class CreditCardDetails {
	public final String ccNumber;
	public final String ccv;
	public final int expiryMonth;
	public final int expiryYear;
	public final String firstName;
	public final String lastName;
	public final double initialBalance;

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

	public static CreditCardDetails ccd(String ccNumber, String ccv, int expiryMonth,
			int expiryYear, String firstName, String lastName, double initialBalance) {
		return new CreditCardDetails(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, initialBalance);
	}
}
