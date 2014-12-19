import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.PersonRegistry.IPersonRegistry;



public class PresentationMain {
	public static void main(String[] args)  {
		System.out.println("Hello, welcome to group 12's presentation!\n");
		
		System.out.println("\nBuilt a new hotel!");
		Hotel_Hotel hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		IConfiguration iConfig = hotel;
		ISearch iSearch = hotel;
		IOrdering iOrder = hotel;
		IPersonRegistry iPersonReg = hotel.getPersonRegistry();
		
		System.out.println("\nSetup (use case maybe): Creates 4 rooms in the newly built hotel.");
		System.out.println(iConfig.createRoom(1, 400));
		System.out.println(iConfig.createRoom(1, 450));
		System.out.println(iConfig.createRoom(2, 1000));
		System.out.println(iConfig.createRoom(3, 1300));
		
		// Use case: Search
		System.out.println("\nUse Case: Search\nSearches for available rooms from today to 4 days in the future for 2 persons.");
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.HOUR, 24*4);
		Date fourDaysFromNow = cal.getTime();
		List<ISearchResult> results = iSearch.search(today.getTime(), fourDaysFromNow.getTime(), 2);
		System.out.println("Got back " + results.size() + " search results.");
		for (ISearchResult result : results) {
			System.out.println(result.toString());
		}
		
		// Use case: Ordering
		System.out.println("\nUse Case: Ordering");
		
		
		System.out.println("\nComputer over.");
	}
}
