package hotel.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Classes.Hotel.IFrontDesk;

public class CheckOutTest {
	
	private IFrontDesk frontdesk;

	@Before
	public void before() {
		frontdesk = IFrontDesk.instance;
	}
	@Test 
	public void testCheckOutwithNoBooking() {
		assertTrue(!frontdesk.checkOut(0));
	}

}
