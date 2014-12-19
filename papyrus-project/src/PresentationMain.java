import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;



public class PresentationMain {
	public static void main(String[] args)  {
		System.out.println("Hello, welcome to group 12's presentation!");
		waitForEnter();
		System.out.println("We will try out some of our Use Cases, first up is Search and Ordering");
		waitForEnter();
		
		// Creates a Hotel maybe.
		Hotel_Hotel hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		ISearch iSearch = hotel;
		
		// Use case: Search
		System.out.println("Use Case: Search\nSearches for available rooms from today to 4 days in the future for 2 persons.");
		waitForEnter();
		
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.HOUR, 24*4);
		Date fourDaysFromNow = cal.getTime();
		List<ISearchResult> results = iSearch.search(today.getTime(), fourDaysFromNow.getTime(), 2);
		
		System.out.println("Got back " + results.size() + " search results.");
		for (ISearchResult result : results) {
			System.out.println(result);
		}
		
		
		System.out.println("Computer over.");
	}
	
	private static void waitForEnter() {
		Scanner sc = new Scanner(System.in);
		while(!sc.nextLine().equals(""));
		sc.close();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
