/**
 */
package Classes.Hotel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Booking;
import Classes.Hotel.Hotel_DummyPersistenceService;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_Order;
import Classes.Hotel.Hotel_Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Dummy Persistence Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl#getOccupancies <em>Occupancies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_DummyPersistenceServiceImpl extends MinimalEObjectImpl.Container implements Hotel_DummyPersistenceService {
	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Order> orders;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Room> rooms;

	/**
	 * The cached value of the '{@link #getOccupancies() <em>Occupancies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancies()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Occupancy> occupancies;
	
	private AtomicInteger baseId = new AtomicInteger(0);
	
	private void init() {
		orders = new BasicEList<Hotel_Order>();
		
		rooms = new BasicEList<Hotel_Room>();
		for (int i = 0; i < 100; i++) {
			addRoom(new Hotel_RoomImpl((i % 5) + 1, 100.0 * i + 100));
		}
		
		occupancies = new BasicEList<Hotel_Occupancy>();
		for (int i = 0; i < 1; i++) { // RUNS ONCE, YAY! 
			Hotel_Occupancy occupancy = new Hotel_OccupancyImpl();
			
			Hotel_Room room = getRoomById(0);
			occupancy.setRoom(room);
			occupancy.setStartTime(0);
			occupancy.setEndTime(1);
			
			occupancies.add(occupancy);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Hotel_DummyPersistenceServiceImpl() {
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
		return HotelPackage.Literals.HOTEL_DUMMY_PERSISTENCE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<Hotel_Room>(Hotel_Room.class, this, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Occupancy> getOccupancies() {
		if (occupancies == null) {
			occupancies = new EObjectResolvingEList<Hotel_Occupancy>(Hotel_Occupancy.class, this, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCIES);
		}
		return occupancies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Hotel_Room getRoomById(int id) {
		for (Hotel_Room room : rooms) {
			if (room.getId() == id) {
				return room;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Order> getOrders() {
		if (orders == null) {
			orders = new EObjectResolvingEList<Hotel_Order>(Hotel_Order.class, this, HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addOrder(Hotel_Order order) {
		// TODO: Fulahck
		for (Hotel_Booking booking : order.getBooking()) {
			occupancies.add(booking.getOccupancy());
		}
		return orders.add(order);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoom(Hotel_Room room) {
		if (room.getId() != -1) {
			throw new IllegalArgumentException("Room's id appears to have been changed already");
		}

		// Yes, it's not pretty to modify when adding
		room.setId(baseId.getAndIncrement());
		return rooms.add(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Hotel_Order getOrderById(int orderID) {
		for (Hotel_Order order : orders) {
			if (order.getID() == orderID) {
				return order;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Hotel_Booking> getBookings() {
		EList<Hotel_Booking> bookings = new BasicEList<>();
		for (Hotel_Order order : orders) {
			bookings.addAll(order.getBooking());
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Hotel_Booking getBookingById(int bookingID) {
		for (Hotel_Booking booking : this.getBookings()) {
			if (booking.getID() == bookingID) {
				return booking;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDERS:
				return getOrders();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOMS:
				return getRooms();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCIES:
				return getOccupancies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Hotel_Order>)newValue);
				return;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Hotel_Room>)newValue);
				return;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCIES:
				getOccupancies().clear();
				getOccupancies().addAll((Collection<? extends Hotel_Occupancy>)newValue);
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
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDERS:
				getOrders().clear();
				return;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOMS:
				getRooms().clear();
				return;
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCIES:
				getOccupancies().clear();
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
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDERS:
				return orders != null && !orders.isEmpty();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCIES:
				return occupancies != null && !occupancies.isEmpty();
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
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ROOM_BY_ID__INT:
				return getRoomById((Integer)arguments.get(0));
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___ADD_ORDER__HOTEL_ORDER:
				return addOrder((Hotel_Order)arguments.get(0));
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___ADD_ROOM__HOTEL_ROOM:
				return addRoom((Hotel_Room)arguments.get(0));
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ORDER_BY_ID__INT:
				return getOrderById((Integer)arguments.get(0));
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_BOOKINGS:
				return getBookings();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_BOOKING_BY_ID__INT:
				return getBookingById((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_DummyPersistenceServiceImpl
