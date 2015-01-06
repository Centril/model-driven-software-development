package hotel.test;

import javax.xml.soap.SOAPException;

import org.junit.Before;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IBooking;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.PersonRegistry.IPersonRegistry;
import Classes.PersonRegistry.PersonRegistryFactory;

public abstract class BaseTest {
	protected ISearch search;
	protected IFrontDesk frontdesk;
	protected IPersonRegistry personRegistry;
	protected IOrdering ordering;
	protected IConfiguration config;
	protected CustomerRequires customerRequires;
	protected AdministratorRequires adminRequires;

	@Before
	public void before() throws SOAPException {
		// ISearch.instance, and similar, would be used for real implementation,
		// for testing purposes though, we use the generated factory to get a
		// new instance of the hotel for each test
		customerRequires = CustomerRequires.instance();
		adminRequires = AdministratorRequires.instance();
		
		Hotel_Hotel hotel = HotelFactory.eINSTANCE.createHotel_Hotel();
		search = hotel;
		ordering = hotel;
		config = hotel;
		frontdesk = hotel;
		
		// If not for tests, IPersonRegistry.instance would be used
		personRegistry = PersonRegistryFactory.eINSTANCE.createPersonRegistry_PersonRegistry();
		hotel.setPersonRegistry(personRegistry);
	}
	
	protected static int findBookingIdByContactId(IFrontDesk iFrontDesk, int contactId) {
		for (IBooking booking : iFrontDesk.getBookings()) {
			if (booking.getContact() == contactId) {
				return booking.getID();
			}
		}
		return -1;
	}
	
}
