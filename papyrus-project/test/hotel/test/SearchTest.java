package hotel.test;

import static org.junit.Assert.assertTrue;
import hotel.test.util.ConfigUtil;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;

public class SearchTest {
	
	private static final long MILLIS_IN_DAY = 86400000L;

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
	
	// Check if room for two is found if searching for two
	@Test
	public void testFindOneTwoBed() {
		ConfigUtil.removeAllRooms();
		makeRoomsAvailable(2, 1);
		
		List<ISearchResult> results = doSearch(2);
		
		assertTrue(results.size() == 1);
		testOneRoomResult(results.get(0), 2);
	}

	// Check if rooms three people is found if only option is 4-bed
	@Test
	public void testFindUnfilledButOnlyAvailable() {
		ConfigUtil.removeAllRooms();
		makeRoomsAvailable(2, 1);
		makeRoomsAvailable(4, 1);
		
		List<ISearchResult> results = doSearch(3);
		assertTrue(results.size() == 1);
		testOneRoomResult(results.get(0), 4);
	}
	
	// Make a number of dummy rooms with fixed price
	private void makeRoomsAvailable(int numBeds, int amount) {
		IConfiguration configuration = IConfiguration.instance;
		for(int i = 0; i < amount; i++) {
			configuration.createRoom(numBeds, 100.0);
		}
	}

	// Search with standard interval from 1 day from now to 2 days from now.
	private List<ISearchResult> doSearch(int numBeds) {
		long from = System.currentTimeMillis() + MILLIS_IN_DAY;
		long to = from + MILLIS_IN_DAY;
		return search.search(from, to, numBeds);
	}

	// Test that result contain one suggestion with an expected number of beds
	private void testOneRoomResult(ISearchResult result, int numBeds) {
		assertTrue(result.getBookingSuggestions().size() == 1);
		IBookingSuggestion bs = result.getBookingSuggestions().get(0);
		assertTrue(bs.getRoom().getNumBeds() == numBeds);		
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
