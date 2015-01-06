package hotel.test.util;

public class CreditCardDetails {
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
