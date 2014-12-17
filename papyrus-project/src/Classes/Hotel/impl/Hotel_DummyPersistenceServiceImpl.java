/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_DummyPersistenceService;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_Order;
import Classes.Hotel.Hotel_Room;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Dummy Persistence Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl#getOccupancy <em>Occupancy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_DummyPersistenceServiceImpl extends MinimalEObjectImpl.Container implements Hotel_DummyPersistenceService {
	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Hotel_Order order;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Hotel_Room room;

	/**
	 * The cached value of the '{@link #getOccupancy() <em>Occupancy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancy()
	 * @generated
	 * @ordered
	 */
	protected Hotel_Occupancy occupancy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_DummyPersistenceServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_DUMMY_PERSISTENCE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Order getOrder() {
		if (order != null && order.eIsProxy()) {
			InternalEObject oldOrder = (InternalEObject)order;
			order = (Hotel_Order)eResolveProxy(oldOrder);
			if (order != oldOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDER, oldOrder, order));
			}
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Order basicGetOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Hotel_Order newOrder) {
		Hotel_Order oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Hotel_Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Hotel_Room newRoom) {
		Hotel_Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Occupancy getOccupancy() {
		if (occupancy != null && occupancy.eIsProxy()) {
			InternalEObject oldOccupancy = (InternalEObject)occupancy;
			occupancy = (Hotel_Occupancy)eResolveProxy(oldOccupancy);
			if (occupancy != oldOccupancy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCY, oldOccupancy, occupancy));
			}
		}
		return occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Occupancy basicGetOccupancy() {
		return occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupancy(Hotel_Occupancy newOccupancy) {
		Hotel_Occupancy oldOccupancy = occupancy;
		occupancy = newOccupancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCY, oldOccupancy, occupancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Occupancy> getOccupancies() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public EList<Hotel_Order> getAllOrders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addOrder(Hotel_Order order) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoom(Hotel_Room room) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDER:
				if (resolve) return getOrder();
				return basicGetOrder();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCY:
				if (resolve) return getOccupancy();
				return basicGetOccupancy();
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
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDER:
				setOrder((Hotel_Order)newValue);
				return;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOM:
				setRoom((Hotel_Room)newValue);
				return;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCY:
				setOccupancy((Hotel_Occupancy)newValue);
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
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDER:
				setOrder((Hotel_Order)null);
				return;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOM:
				setRoom((Hotel_Room)null);
				return;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCY:
				setOccupancy((Hotel_Occupancy)null);
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
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDER:
				return order != null;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOM:
				return room != null;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCY:
				return occupancy != null;
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
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_OCCUPANCIES:
				return getOccupancies();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ALL_ROOMS:
				return getAllRooms();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ROOM_BY_ID__INT:
				return getRoomById((Integer)arguments.get(0));
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ALL_ORDERS:
				return getAllOrders();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___ADD_ORDER__HOTEL_ORDER:
				return addOrder((Hotel_Order)arguments.get(0));
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___ADD_ROOM__HOTEL_ROOM:
				return addRoom((Hotel_Room)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_DummyPersistenceServiceImpl
