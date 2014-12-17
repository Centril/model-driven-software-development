package hotel.test;

import org.junit.Test;

import Classes.Hotel.HotelFactory;
import Classes.Hotel.ISearch;

public class SearchTest {

	@Test(expected=IllegalArgumentException.class)
	public void testZeroPeople() {
		
		ISearch search = HotelFactory.eINSTANCE.createHotel_Hotel();
		
		search.search(0, 1, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testStartTimeAfterEndTime() {
		
		ISearch search = HotelFactory.eINSTANCE.createHotel_Hotel();
		
		search.search(1, 0, 1);
	}

}
