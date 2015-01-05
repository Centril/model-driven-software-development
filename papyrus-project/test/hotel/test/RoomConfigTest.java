package hotel.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Classes.Hotel.IConfiguration;
import Classes.Hotel.IRoom;

public class RoomConfigTest {

	@Test
	public void testAddingValidRooms() {
		
		String firstRoomName = "The first room";
		String secondRoomName = "The second room";
		int firstNumBeds = 2;
		int secondNumBeds = 4;
		double firstPrice = 100.0;
		double secondPrice = 200.0;

		IConfiguration configuration = IConfiguration.instance;
		IRoom room1 = configuration.createRoom(firstNumBeds, firstPrice);
		room1.setName(firstRoomName);
		IRoom room2 = configuration.createRoom(secondNumBeds, secondPrice);
		room2.setName(secondRoomName);
		
		int room1Id = room1.getId();
		int room2Id = room2.getId();
		
		// Check if room available when getting all rooms 
		List<IRoom> rooms = configuration.getRooms();
		IRoom returnedRoom1 = null;
		IRoom returnedRoom2 = null;
		for (IRoom r : rooms) {
			if(r.getId() == room1Id) {
				returnedRoom1 = r;
			} else if(r.getId() == room2Id) {
				returnedRoom2 = r;
			}
		}
		assertTrue(returnedRoom1 != null && returnedRoom2 != null);
		assertEquals(firstRoomName, returnedRoom1.getName());
		assertEquals(secondRoomName, returnedRoom2.getName());
		assertEquals(firstNumBeds, returnedRoom1.getNumBeds());
		assertEquals(secondNumBeds, returnedRoom2.getNumBeds());
		assertEquals(firstPrice, returnedRoom1.getPrice(), 0.01);
		assertEquals(secondPrice, returnedRoom2.getPrice(), 0.01);
	}
}
