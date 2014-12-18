package hotel.test;

import static org.junit.Assert.assertTrue;

import javax.xml.soap.SOAPException;

import org.junit.Before;
import org.junit.Test;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.PersonRegistry.IPersonRegistry;

public class OrderingTest {
	
	private CustomerRequires customerRequires;
	private AdministratorRequires adminRequires;
	private Hotel_Hotel hotel;
	private ISearch iSearch;
	private IOrdering iOrdering;
	private IPersonRegistry iPersonReg;
	
	@Before
	public void before() {
		// Ensure the existence of credit cards with money associated with some folks.
		try {
			customerRequires = CustomerRequires.instance();
		} catch (SOAPException soppa) {
			assertTrue(false);
		}
		try {
			adminRequires = AdministratorRequires.instance();
		} catch (SOAPException soppa) {
			assertTrue(false);;
		}
		try {
			if (!customerRequires.isCreditCardValid("1212 1319 4143 1336", "666", 2, 2077, "Nikola", "Tesla")) {
				adminRequires.addCreditCard("1212 1319 4143 1336", "666", 2, 2077, "Nikola", "Tesla");
			}
			adminRequires.makeDeposit("1212 1319 4143 1336", "666", 2, 2077, "Nikola", "Tesla", 100000);
			
			if (!customerRequires.isCreditCardValid("1212 6666 6666 6666", "111", 3, 2856, "Joseph", "Stalin")) {
				adminRequires.addCreditCard("1212 6666 6666 6666", "111", 3, 2856, "Joseph", "Stalin");
			}
			adminRequires.makeDeposit("1212 6666 6666 6666", "111", 3, 2856, "Joseph", "Stalin", 10000);
			
			if (!customerRequires.isCreditCardValid("1212 1919 1919 1919", "333", 4, 2356, "Walt", "Disney")) {
				adminRequires.addCreditCard("1212 1919 1919 1919", "333", 4, 2356, "Walt", "Disney");
			}
			adminRequires.makeDeposit("1212 1919 1919 1919", "333", 4, 2356, "Walt", "Disney", 250000);
			
		} catch (SOAPException soppa) {
			assertTrue(false);
		}
		
		hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		iSearch = hotel;
		iOrdering = hotel;
		iPersonReg = hotel.getPersonRegistry();
	}
	
	@Test
	public void testOrdering() {
		
	}
}
