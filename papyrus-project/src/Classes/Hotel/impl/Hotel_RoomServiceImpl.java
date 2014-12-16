/**
 */
package Classes.Hotel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Room;
import Classes.Hotel.Hotel_RoomService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Room Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Hotel_RoomServiceImpl extends MinimalEObjectImpl.Container implements Hotel_RoomService {
	
	private EList<Hotel_Room> rooms;
	
	private void init() {
		if (rooms != null) {
			return;
		}
		
		rooms = new BasicEList<Hotel_Room>();
		
		for (int i = 0; i < 100; i++) {
			Hotel_RoomImpl room = new Hotel_RoomImpl();
			room.setId(i);
			room.setPrice(100.0 * i + 100.0);
			room.setNumBeds(i % 5 + 1);
			rooms.add(room);
		}
	}
			
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Hotel_RoomServiceImpl() {
		super();
		
		init();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_ROOM_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Hotel_Room> getAllRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Hotel_Room getRoomById(int id) {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == id) {
				return rooms.get(i);
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelPackage.HOTEL_ROOM_SERVICE___GET_ALL_ROOMS:
				return getAllRooms();
			case HotelPackage.HOTEL_ROOM_SERVICE___GET_ROOM_BY_ID__INT:
				return getRoomById((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_RoomServiceImpl
