package hotel.test.util;

import org.eclipse.emf.common.util.EList;

import Classes.Hotel.IConfiguration;
import Classes.Hotel.IRoom;

public class ConfigUtil {

	public static void removeAllRooms() {
		IConfiguration configuration = IConfiguration.instance;
		
		EList<IRoom> rooms = configuration.getRooms();
		for(IRoom r : rooms) {
			configuration.deleteRoom(r.getId());
		}
	}
	
}
