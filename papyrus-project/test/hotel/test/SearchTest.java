package hotel.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;

public class SearchTest {
	private ISearch search;

	@Before
	public void before() {
		search = ISearch.instance;
	}

	@Test(expected=IllegalArgumentException.class)
	public void testZeroPeople() {
		search.search(0, 1, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testStartTimeAfterEndTime() {
		search.search(1, 0, 1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testTooManyGuests() {
		search.search(1, 2, Integer.MAX_VALUE);
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
	
	@Test
	public void testFindOneTwoBed() {
		makeRoomsAvailable(2, 1);
		
		ISearch search = ISearch.instance;
		List<ISearchResult> results = search.search(0, 1000, 2);
		assertTrue(results.size() == 1);
		assertTrue(results.get(0).getBookingSuggestions().size() == 1);
		IBookingSuggestion bs = results.get(0).getBookingSuggestions().get(0);
		assertTrue(bs.getRoom().getNumBeds() == 2);
	}

	private void makeRoomsAvailable(int numBeds, int amount) {
		IConfiguration configuration = IConfiguration.instance;
		for(int i = 0; i < amount; i++) {
			configuration.createRoom(numBeds, 100.0);
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
