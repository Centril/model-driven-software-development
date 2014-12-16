package hotel.test;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import Classes.Hotel.HotelFactory;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;

public class OrderingTest {

	@Test
	public void testOrdering() {
		
		
		ISearch search = HotelFactory.eINSTANCE.createHotel_Hotel();
		
		EList<ISearchResult> results = search.search(0, 1, 3);
		
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.get(i).getBookingSuggestions().size(); j++) {
				System.out.println(results.get(i).getBookingSuggestions().get(j).getRoom().getId());
			}
			System.out.println();
		}
		System.out.println("Size: " + results.size());
	}

}
