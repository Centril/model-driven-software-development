package hotel.test;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;

public class SearchTest {
	private ISearch search;

	@Before
	public void before() {
		search = HotelFactory.eINSTANCE.createHotel_Hotel();
	}

	@Test(expected=IllegalArgumentException.class)
	public void testZeroPeople() {
		search.search(0, 1, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testStartTimeAfterEndTime() {
		search.search(1, 0, 1);
	}

	@Test
	public void testTooManyGuests() {
		EList<ISearchResult> results = search.search(1, 2, Integer.MAX_VALUE);
		assertTrue(results.isEmpty());
	}

	@Test
	public void testOneGuest() {
		testNGuests(1);
	}

	@Test
	public void testNGuests() {
		for (int n = 2; n < 10; n++) {
			testNGuests(n);
		}
	}
	private void testNGuests(int n) {
		EList<ISearchResult> results = search.search(1, 2, n);
		for (ISearchResult result : results) {
			assertEnoughBeds(n, result);
		}
	}

	private static void assertEnoughBeds(int required, ISearchResult result) {
		int beds = 0;
		for (IBookingSuggestion bs: result.getBookingSuggestions()) {
			beds += bs.getRoom().getNumBeds();
		}
		assertTrue("Too few beds.", beds >= required);
	}
}
