package hotel.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.HotelFactory;
import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;

public class SearchTest {
	
	private static final long MILLIS_IN_DAY = 86400000L;

	private ISearch search;
	private IConfiguration configuration;

	@Before
	public void before() {
		// ISearch.instance, and similar, would be used for real implementation, for testing
		// purposes though, we create a new instance for each test
		Hotel_Hotel hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		search = hotel;
		configuration = hotel;
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
	
	// Check if room with two beds is found for two people
	@Test
	public void testFindOneTwoBed() {
		makeRoomsAvailable(2, 1);
		
		List<ISearchResult> results = doSearch(2);
		
		assertEquals(1, results.size());
		assertNumBedsOneRoom(results.get(0), 2);
	}

	// Check if room with four beds is found for three people
	@Test
	public void testFindUnfilledButOnlyAvailable() {
		makeRoomsAvailable(2, 1);
		makeRoomsAvailable(4, 1);
		
		List<ISearchResult> results = doSearch(3);
		assertEquals(1, results.size());
		assertNumBedsOneRoom(results.get(0), 4);
	}

	// Check if one 3-bed and 4-bed is found for 7 people
	@Test
	public void testFindFilledTwoRoomResult() {
		makeRoomsAvailable(1, 1);
		makeRoomsAvailable(3, 1);
		makeRoomsAvailable(4, 1);
		
		List<ISearchResult> results = doSearch(7);

		assertEquals(1, results.size());
		assertNumBeds(results.get(0), 3, 4);
	}
	
	// Check if two 4-bed rooms are found for 7 persons if 7-bed not available 
	@Test
	public void testFindMultiUnfilledButOnlyAvailable() {
		makeRoomsAvailable(2, 1);
		makeRoomsAvailable(4, 2);
		
		List<ISearchResult> results = doSearch(7);
		assertEquals(1, results.size());
		assertNumBeds(results.get(0), 4, 4);
	}

	// Check for three 3-bed rooms are returned when searching for 9 people
	@Test
	public void testThreeRoomResult() {
		makeRoomsAvailable(3, 3);
		
		List<ISearchResult> results = doSearch(9);
		assertEquals(1, results.size());
		assertNumBeds(results.get(0), 3, 3, 3);
	}

	// Search with standard interval from 1 day from now to 2 days from now.
	private List<ISearchResult> doSearch(int numBeds) {
		long from = System.currentTimeMillis() + MILLIS_IN_DAY;
		long to = from + MILLIS_IN_DAY;
		return search.search(from, to, numBeds);
	}

	// Make a number of dummy rooms with fixed price
	private void makeRoomsAvailable(int numBeds, int amount) {
		for(int i = 0; i < amount; i++) {
			configuration.createRoom(numBeds, 100.0);
		}
	}

	// Test that result contain one suggestion with an expected number of beds
	private static void assertNumBedsOneRoom(ISearchResult result, int numBeds) {
		assertTrue(result.getBookingSuggestions().size() == 1);
		IBookingSuggestion bs = result.getBookingSuggestions().get(0);
		assertTrue(getNumBeds(bs) == numBeds);		
	}
	
	// Check if ISearchResult contains exact number of expected beds
	private static void assertNumBeds(ISearchResult sr, int... numBeds) {
		List<IBookingSuggestion> bss = sr.getBookingSuggestions();
		assertTrue(bss.size() == numBeds.length);

		// Move beds for each suggestion to int array
		int[] bookingBeds = new int[bss.size()];
		for (int i = 0; i < bss.size(); i++) {
			bookingBeds[i] = getNumBeds(bss.get(i));
		}

		Arrays.sort(bookingBeds);
		Arrays.sort(numBeds);
		assertTrue(Arrays.equals(bookingBeds, numBeds));
	}
	
	private static int getNumBeds(IBookingSuggestion bs) {
		return bs.getRoom().getNumBeds();
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
