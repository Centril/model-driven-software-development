package hotel.test.util;

import static hotel.test.util.CreditCardDetails.ccd;

public class TestConstants {

	public static final long MILLIS_IN_DAY = 86400000L;

	private TestConstants() {}

	public static final CreditCardDetails TESLA = ccd(
		"1212131941431336", "666", 2, 16, "Nikola", "Tesla", 100000);

	public static final CreditCardDetails STALIN = ccd(
		"1212666666666666", "111", 3, 16, "Joseph", "Stalin", 10000);

	public static final CreditCardDetails VREESWIJK = ccd(
		"1212999999999999", "111", 3, 16, "Cornelis", "Wreeswijk", 1);

	public static final CreditCardDetails[] ALL = new CreditCardDetails[] { TESLA, STALIN, VREESWIJK };
}
