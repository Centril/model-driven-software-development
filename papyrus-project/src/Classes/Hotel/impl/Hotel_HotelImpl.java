/**
 */
package Classes.Hotel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_BookingSuggestion;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_OccupancyService;
import Classes.Hotel.Hotel_Order;
import Classes.Hotel.Hotel_OrderService;
import Classes.Hotel.Hotel_Room;
import Classes.Hotel.Hotel_RoomService;
import Classes.Hotel.Hotel_SearchResult;
import Classes.Hotel.IBooking;
import Classes.Hotel.IOrder;
import Classes.Hotel.IOrdering;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.Hotel.OrderRequest;
import Classes.PersonRegistry.IPersonRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_HotelImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_HotelImpl#getPersonRegistry <em>Person Registry</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_HotelImpl#getRoomService <em>Room Service</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_HotelImpl#getOccupancyService <em>Occupancy Service</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_HotelImpl#getOrderService <em>Order Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_HotelImpl extends MinimalEObjectImpl.Container implements Hotel_Hotel {
	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Order> order;

	/**
	 * The cached value of the '{@link #getPersonRegistry() <em>Person Registry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonRegistry()
	 * @generated
	 * @ordered
	 */
	protected IPersonRegistry personRegistry;

	/**
	 * The cached value of the '{@link #getRoomService() <em>Room Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomService()
	 * @generated
	 * @ordered
	 */
	protected Hotel_RoomService roomService;

	/**
	 * The cached value of the '{@link #getOccupancyService() <em>Occupancy Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancyService()
	 * @generated
	 * @ordered
	 */
	protected Hotel_OccupancyService occupancyService;

	/**
	 * The cached value of the '{@link #getOrderService() <em>Order Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderService()
	 * @generated
	 * @ordered
	 */
	protected Hotel_OrderService orderService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_HotelImpl() {
		super();

		roomService = new Hotel_RoomServiceImpl();
		occupancyService = new Hotel_OccupancyServiceImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_HOTEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Order> getOrder() {
		if (order == null) {
			order = new EObjectResolvingEList<Hotel_Order>(Hotel_Order.class, this, HotelPackage.HOTEL_HOTEL__ORDER);
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPersonRegistry getPersonRegistry() {
		if (personRegistry != null && personRegistry.eIsProxy()) {
			InternalEObject oldPersonRegistry = (InternalEObject)personRegistry;
			personRegistry = (IPersonRegistry)eResolveProxy(oldPersonRegistry);
			if (personRegistry != oldPersonRegistry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY, oldPersonRegistry, personRegistry));
			}
		}
		return personRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPersonRegistry basicGetPersonRegistry() {
		return personRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonRegistry(IPersonRegistry newPersonRegistry) {
		IPersonRegistry oldPersonRegistry = personRegistry;
		personRegistry = newPersonRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY, oldPersonRegistry, personRegistry));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_HOTEL__ROOM_SERVICE, oldRoomService, roomService));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_HOTEL__ROOM_SERVICE, oldRoomService, roomService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_OccupancyService getOccupancyService() {
		if (occupancyService != null && occupancyService.eIsProxy()) {
			InternalEObject oldOccupancyService = (InternalEObject)occupancyService;
			occupancyService = (Hotel_OccupancyService)eResolveProxy(oldOccupancyService);
			if (occupancyService != oldOccupancyService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_HOTEL__OCCUPANCY_SERVICE, oldOccupancyService, occupancyService));
			}
		}
		return occupancyService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_OccupancyService basicGetOccupancyService() {
		return occupancyService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupancyService(Hotel_OccupancyService newOccupancyService) {
		Hotel_OccupancyService oldOccupancyService = occupancyService;
		occupancyService = newOccupancyService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_HOTEL__OCCUPANCY_SERVICE, oldOccupancyService, occupancyService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_OrderService getOrderService() {
		if (orderService != null && orderService.eIsProxy()) {
			InternalEObject oldOrderService = (InternalEObject)orderService;
			orderService = (Hotel_OrderService)eResolveProxy(oldOrderService);
			if (orderService != oldOrderService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_HOTEL__ORDER_SERVICE, oldOrderService, orderService));
			}
		}
		return orderService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_OrderService basicGetOrderService() {
		return orderService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderService(Hotel_OrderService newOrderService) {
		Hotel_OrderService oldOrderService = orderService;
		orderService = newOrderService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_HOTEL__ORDER_SERVICE, oldOrderService, orderService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(IBooking booking, int numKeys) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getBill(IBooking booking) {
		return booking.getPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IBooking> getBookings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pay(IBooking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut(IBooking booking, int numKeys) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOrder> getOrders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ISearchResult> search(long startTime, long endTime, int numberOfPersons) {
		
		EList<Hotel_Occupancy> occupancies = getOccupancyService().getAllOccupancies();
		EList<Hotel_Room> rooms = getRoomService().getAllRooms();
		
		EList<Hotel_Room> availableRooms = new BasicEList<>();
		
		// Loop through all rooms in the hotel
		for (int i = 0; i < rooms.size(); i++) {
			boolean available = true;
			
			// Loop through all occupancies
			for (int j = 0; j < occupancies.size(); j++) {
				// If same room and time intervals overlap the room is not available
				if (occupancies.get(j).getRoom().getId() == rooms.get(i).getId()
						&& !(endTime < occupancies.get(j).getStartTime()
								|| startTime > occupancies.get(j).getEndTime())) {
					available = false;
				}
			}
			
			if (available) {
				availableRooms.add(rooms.get(i));
			}
		}
		
		// Create a list (containing lists of rooms) where the index indicates the number of beds (minus one) in the rooms
		EList<EList<Hotel_Room>> roomsAccordingToNumBeds = new BasicEList<>();
		for (int i = 0; i < numberOfPersons; i++) {
			roomsAccordingToNumBeds.add(new BasicEList<Hotel_Room>());
		}
		
		// Also add a list containing all the rooms larger than necessary
		roomsAccordingToNumBeds.add(new BasicEList<Hotel_Room>());
		
		// Fill the new lists with appropriate rooms
		for (int i = 0; i < availableRooms.size(); i++) {
			int numBeds = availableRooms.get(i).getNumBeds();
			
			// If the room has the same or less beds, put it in the appropriate list
			if (numBeds <= numberOfPersons) {
				roomsAccordingToNumBeds.get(numBeds - 1).add(availableRooms.get(i));
			}
			else { // If the room has more beds than the number of people, put it in the last list
				roomsAccordingToNumBeds.get(roomsAccordingToNumBeds.size() - 1).add(availableRooms.get(i));
			}
		}
		
		EList<ISearchResult> results = new BasicEList<ISearchResult>();

		// For all rooms with the same number of beds as people, add them to the results
		for (int i = 0; i < roomsAccordingToNumBeds.get(numberOfPersons - 1).size(); i++) {
			
			// Fetch the room
			Hotel_Room room = roomsAccordingToNumBeds.get(numberOfPersons - 1).get(i);
			
			// Create a suggestion with the room
			Hotel_BookingSuggestion suggestion = new Hotel_BookingSuggestionImpl(room, startTime, endTime);
			
			// Create a search result with the suggestion
			Hotel_SearchResult searchResult = new Hotel_SearchResultImpl();
			searchResult.getBookingSuggestion().add(suggestion);
			
			// Add the result to the list of all results
			results.add(searchResult);
		}
		
		// For 2 rooms with the same number of beds as people, add them to the results
		for (int i = 0; i < numberOfPersons / 2; i++) {
			int bedsInRoomOne = numberOfPersons / 2;
			int bedsInRoomTwo = numberOfPersons - bedsInRoomOne;
			
			for (int j = 0; j < roomsAccordingToNumBeds.get(bedsInRoomOne - 1).size()
					&& j < roomsAccordingToNumBeds.get(bedsInRoomTwo - 1).size(); j++) {
				
				// Fetch the rooms
				Hotel_Room roomOne = roomsAccordingToNumBeds.get(bedsInRoomOne - 1).get(i);
				Hotel_Room roomTwo = roomsAccordingToNumBeds.get(bedsInRoomTwo - 1).get(i);
				
				// Create suggestions with the rooms
				Hotel_BookingSuggestion suggestionOne = new Hotel_BookingSuggestionImpl(roomOne, startTime, endTime);
				Hotel_BookingSuggestion suggestionTwo = new Hotel_BookingSuggestionImpl(roomTwo, startTime, endTime);
				
				// Create a search result with the suggestions
				Hotel_SearchResult searchResult = new Hotel_SearchResultImpl();
				searchResult.getBookingSuggestion().add(suggestionOne);
				searchResult.getBookingSuggestion().add(suggestionTwo);
				
				// Add the result to the list of all results
				results.add(searchResult);
			}
		}
		
		// Now just dump all the rooms containing more beds than number of people in the results...
		for (int i = 0; i < roomsAccordingToNumBeds.get(roomsAccordingToNumBeds.size() - 1).size(); i++) {
			
			// Fetch the room
			Hotel_Room room = roomsAccordingToNumBeds.get(roomsAccordingToNumBeds.size() - 1).get(i);
			
			// Create suggestion with the room
			Hotel_BookingSuggestion suggestion = new Hotel_BookingSuggestionImpl(room, startTime, endTime);
			
			// Create a search result with the suggestion
			Hotel_SearchResult searchResult = new Hotel_SearchResultImpl();
			searchResult.getBookingSuggestion().add(suggestion);
			
			// Add the result to the list of all results
			results.add(searchResult);
		}
		
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void placeOrder(OrderRequest orderRequest) {
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
			case HotelPackage.HOTEL_HOTEL__ORDER:
				return getOrder();
			case HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY:
				if (resolve) return getPersonRegistry();
				return basicGetPersonRegistry();
			case HotelPackage.HOTEL_HOTEL__ROOM_SERVICE:
				if (resolve) return getRoomService();
				return basicGetRoomService();
			case HotelPackage.HOTEL_HOTEL__OCCUPANCY_SERVICE:
				if (resolve) return getOccupancyService();
				return basicGetOccupancyService();
			case HotelPackage.HOTEL_HOTEL__ORDER_SERVICE:
				if (resolve) return getOrderService();
				return basicGetOrderService();
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
			case HotelPackage.HOTEL_HOTEL__ORDER:
				getOrder().clear();
				getOrder().addAll((Collection<? extends Hotel_Order>)newValue);
				return;
			case HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY:
				setPersonRegistry((IPersonRegistry)newValue);
				return;
			case HotelPackage.HOTEL_HOTEL__ROOM_SERVICE:
				setRoomService((Hotel_RoomService)newValue);
				return;
			case HotelPackage.HOTEL_HOTEL__OCCUPANCY_SERVICE:
				setOccupancyService((Hotel_OccupancyService)newValue);
				return;
			case HotelPackage.HOTEL_HOTEL__ORDER_SERVICE:
				setOrderService((Hotel_OrderService)newValue);
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
			case HotelPackage.HOTEL_HOTEL__ORDER:
				getOrder().clear();
				return;
			case HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY:
				setPersonRegistry((IPersonRegistry)null);
				return;
			case HotelPackage.HOTEL_HOTEL__ROOM_SERVICE:
				setRoomService((Hotel_RoomService)null);
				return;
			case HotelPackage.HOTEL_HOTEL__OCCUPANCY_SERVICE:
				setOccupancyService((Hotel_OccupancyService)null);
				return;
			case HotelPackage.HOTEL_HOTEL__ORDER_SERVICE:
				setOrderService((Hotel_OrderService)null);
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
			case HotelPackage.HOTEL_HOTEL__ORDER:
				return order != null && !order.isEmpty();
			case HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY:
				return personRegistry != null;
			case HotelPackage.HOTEL_HOTEL__ROOM_SERVICE:
				return roomService != null;
			case HotelPackage.HOTEL_HOTEL__OCCUPANCY_SERVICE:
				return occupancyService != null;
			case HotelPackage.HOTEL_HOTEL__ORDER_SERVICE:
				return orderService != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ISearch.class) {
			switch (baseOperationID) {
				case HotelPackage.ISEARCH___SEARCH__LONG_LONG_INT: return HotelPackage.HOTEL_HOTEL___SEARCH__LONG_LONG_INT;
				default: return -1;
			}
		}
		if (baseClass == IOrdering.class) {
			switch (baseOperationID) {
				case HotelPackage.IORDERING___PLACE_ORDER__ORDERREQUEST: return HotelPackage.HOTEL_HOTEL___PLACE_ORDER__ORDERREQUEST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelPackage.HOTEL_HOTEL___CHECK_IN__IBOOKING_INT:
				checkIn((IBooking)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case HotelPackage.HOTEL_HOTEL___GET_BILL__IBOOKING:
				return getBill((IBooking)arguments.get(0));
			case HotelPackage.HOTEL_HOTEL___GET_BOOKINGS:
				return getBookings();
			case HotelPackage.HOTEL_HOTEL___PAY__IBOOKING:
				pay((IBooking)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_HOTEL___CHECK_OUT__IBOOKING_INT:
				checkOut((IBooking)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case HotelPackage.HOTEL_HOTEL___GET_ORDERS:
				return getOrders();
			case HotelPackage.HOTEL_HOTEL___SEARCH__LONG_LONG_INT:
				return search((Long)arguments.get(0), (Long)arguments.get(1), (Integer)arguments.get(2));
			case HotelPackage.HOTEL_HOTEL___PLACE_ORDER__ORDERREQUEST:
				placeOrder((OrderRequest)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_HotelImpl
