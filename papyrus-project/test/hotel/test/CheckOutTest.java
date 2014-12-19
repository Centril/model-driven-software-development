package hotel.test;

import static org.junit.Assert.*;
import hotel.test.mock.MockBookingRequest;
import hotel.test.mock.MockOrderRequest;

import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.impl.Hotel_HotelImpl;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;

public class CheckOutTest {
	
	private IFrontDesk frontdesk;
	private Hotel_Hotel hotel;
	private IPersonRegistry personRegistry;
	private IPerson person;
	
	@Before
	public void before() {
		hotel = Hotel_HotelImpl.getInstance();
		frontdesk = hotel;
		personRegistry = IPersonRegistry.instance;
		person = personRegistry.createPerson(0);
	}
	@Test 
	public void testCheckOutwithNoBooking() {
		assertTrue(!frontdesk.checkOut(0));
	}

}
