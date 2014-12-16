/**
 */
package Classes.Hotel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_OccupancyService;
import Classes.Hotel.Hotel_Room;
import Classes.Hotel.Hotel_RoomService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Occupancy Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_OccupancyServiceImpl#getRoomService <em>Room Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_OccupancyServiceImpl extends MinimalEObjectImpl.Container implements Hotel_OccupancyService {
	
	/**
	 * The cached value of the '{@link #getRoomService() <em>Room Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomService()
	 * @generated
	 * @ordered
	 */
	protected Hotel_RoomService roomService;
	private EList<Hotel_Occupancy> occupancies;
	
	private void init() {
		if (occupancies != null) {
			return;
		}
		
		occupancies = new BasicEList<Hotel_Occupancy>();
	
		Hotel_Occupancy occupancy = new Hotel_OccupancyImpl();
		
		Hotel_Room room = roomService.getRoomById(0);
		occupancy.setRoom(room);
		occupancy.setStartTime(0);
		occupancy.setEndTime(1);
		
		occupancies.add(occupancy);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Hotel_OccupancyServiceImpl() {
		super();
		
		roomService = new Hotel_RoomServiceImpl();
		
		init();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_OCCUPANCY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_RoomService getRoomService() {
		if (roomService != null && roomService.eIsProxy()) {
			InternalEObject oldRoomService = (InternalEObject)roomService;
			roomService = (Hotel_RoomService)eResolveProxy(oldRoomService);
			if (roomService != oldRoomService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_OCCUPANCY_SERVICE__ROOM_SERVICE, oldRoomService, roomService));
			}
		}
		return roomService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_RoomService basicGetRoomService() {
		return roomService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomService(Hotel_RoomService newRoomService) {
		Hotel_RoomService oldRoomService = roomService;
		roomService = newRoomService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_OCCUPANCY_SERVICE__ROOM_SERVICE, oldRoomService, roomService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Hotel_Occupancy> getAllOccupancies() {
		return new BasicEList<Hotel_Occupancy>(occupancies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.HOTEL_OCCUPANCY_SERVICE__ROOM_SERVICE:
				if (resolve) return getRoomService();
				return basicGetRoomService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelPackage.HOTEL_OCCUPANCY_SERVICE__ROOM_SERVICE:
				setRoomService((Hotel_RoomService)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HotelPackage.HOTEL_OCCUPANCY_SERVICE__ROOM_SERVICE:
				setRoomService((Hotel_RoomService)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HotelPackage.HOTEL_OCCUPANCY_SERVICE__ROOM_SERVICE:
				return roomService != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelPackage.HOTEL_OCCUPANCY_SERVICE___GET_ALL_OCCUPANCIES:
				return getAllOccupancies();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_OccupancyServiceImpl
