/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Room;
import Classes.Hotel.Hotel_RoomService;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_RoomServiceImpl() {
		super();
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
	 * @generated
	 */
	public EList<Hotel_Room> getAllRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Room getRoomById(int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
