/**
 */
package Classes.Hotel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Hotel.BookingRequest;
import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Booking;
import Classes.Hotel.Hotel_BookingSuggestion;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_Order;
import Classes.Hotel.Hotel_Room;
import Classes.Hotel.Hotel_SearchResult;
import Classes.Hotel.IBooking;
import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.IConfiguration;
import Classes.Hotel.IOrder;
import Classes.Hotel.IOrdering;
import Classes.Hotel.IPersistenceService;
import Classes.Hotel.IRoom;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.Hotel.OrderRequest;
import Classes.PersonRegistry.ICreditCardInfo;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_HotelImpl#getPersonRegistry <em>Person Registry</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_HotelImpl#getPersistenceService <em>Persistence Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_HotelImpl extends MinimalEObjectImpl.Container implements Hotel_Hotel {

	private static final int MAX_ROOM_COMBINATION = 2;
	private int legalAge = 18;

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
	 * The cached value of the '{@link #getPersistenceService() <em>Persistence Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceService()
	 * @generated
	 * @ordered
	 */
	protected IPersistenceService persistenceService;

	private static Hotel_Hotel instance;
	
	public static Hotel_Hotel getInstance() {
		if (instance == null) {
			instance = new Hotel_HotelImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Hotel_HotelImpl() {
		super();

		persistenceService = new Hotel_DummyPersistenceServiceImpl();
		personRegistry = IPersonRegistry.instance;
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
	public IPersistenceService getPersistenceService() {
		if (persistenceService != null && persistenceService.eIsProxy()) {
			InternalEObject oldPersistenceService = (InternalEObject)persistenceService;
			persistenceService = (IPersistenceService)eResolveProxy(oldPersistenceService);
			if (persistenceService != oldPersistenceService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_HOTEL__PERSISTENCE_SERVICE, oldPersistenceService, persistenceService));
			}
		}
		return persistenceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPersistenceService basicGetPersistenceService() {
		return persistenceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceService(IPersistenceService newPersistenceService) {
		IPersistenceService oldPersistenceService = persistenceService;
		persistenceService = newPersistenceService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_HOTEL__PERSISTENCE_SERVICE, oldPersistenceService, persistenceService));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkIn(int bookingID, int numKeys) {
		Hotel_Booking booking = persistenceService.getBookingById(bookingID);
		if(booking == null){
			return false; //requested booking to check in doesn't exist
		}
		
		Calendar cal = Calendar.getInstance();
		Date checkInDate = new Date(booking.getCheckInDate());
		Date checkOutDate = new Date(booking.getCheckOutDate());
		if(cal.getTime().after(checkInDate) && cal.getTime().before(checkOutDate)){
			if(!(booking.isCheckedIn())){
				//do check in things
				booking.setCheckedIn(true);
				booking.getOccupancy().addKeys(numKeys);
				return true;
			}	
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getBill(int bookingID) {
		IBooking booking = persistenceService.getBookingById(bookingID);
		if(booking == null) {
			return -1;
			//TODO: Ugly solution
		}
		return booking.getPrice(); //A bill should include customer and price objects. But double...
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IBooking> getBookings() {
		EList<IBooking> bookings = new BasicEList<>();
		for (Hotel_Order order : persistenceService.getOrders()) {
			bookings.addAll(order.getBooking());
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean pay(int bookingID) {
		IBooking booking = persistenceService.getBookingById(bookingID);
		if(booking == null) {
			return false;
		}
		IPerson customer = personRegistry.getIPersonByID(booking.getCustomer());
		ICreditCardInfo creditcard = customer.getCreditCard();
		double price = getBill(bookingID);
		try {
			CustomerRequires bank = CustomerRequires.instance();
			
			if (bank.isCreditCardValid(creditcard.getCCNumber(), creditcard.getCCV(), creditcard.getMonth(), creditcard.getYear(), creditcard.getFirstName(), creditcard.getLastName())) {
				return false;
			}
			
			if (bank.makePayment(creditcard.getCCNumber(), creditcard.getCCV(), creditcard.getMonth(), creditcard.getYear(), creditcard.getFirstName(), creditcard.getLastName(), price)) {
				booking.setPaid(true);
				return true;
			}
			return false;
		
		} catch (SOAPException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkOut(int bookingID) {
		Hotel_Booking booking = persistenceService.getBookingById(bookingID);
		if(booking != null && booking.isCheckedIn()){
			booking.setCheckedOut(true);
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IOrder> getOrders() {
		EList<IOrder> list = new BasicEList<IOrder>();
		for (Hotel_Order o : persistenceService.getOrders()) {
			// TODO: Perhaps return "anemic" version
			list.add(o);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IBooking> getRelevantCheckInBookings(int personID) {
		IPerson person = findPerson(personID);
		if (person == null) return null;
		
		EList<IBooking> relevantBookings = new BasicEList<>();
		
		EList<IBooking> allBookings = getBookings();
		for (IBooking booking : allBookings) {
			if (booking.getContact() == personID) {
				relevantBookings.add(booking);
			}
		}
		
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		cal.add(Calendar.HOUR, 12);
		Date halfADayIntoTheFuture = cal.getTime();
		
		for (IBooking booking : relevantBookings) {
			Date bookingCheckIn = new Date(booking.getCheckInDate());
			Date bookingCheckOut = new Date(booking.getCheckOutDate());
			
			if (currentDate.before(bookingCheckOut) && halfADayIntoTheFuture.after(bookingCheckIn)) {
				relevantBookings.add(booking);
			}
		}
		
		return relevantBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean handInKeys(int bookingId, int nbrKeys) {
		Hotel_Booking booking = persistenceService.getBookingById(bookingId);
		if(booking != null) {
			booking.getOccupancy().removeKeys(nbrKeys);
			if(persistenceService.getBookingById(bookingId).getOccupancy().getNumKeys() > 0) // Not all keys are handed in
				return false;
			return true;
		}
		return false;
	}

	private boolean isRoomAvailable(IRoom room, long startTime, long endTime) {
		if (startTime > endTime) {
			throw new IllegalArgumentException("endTime is lower than startTime.");
		}
		
		EList<Hotel_Occupancy> occupancies = persistenceService.getOccupancies();
		
		for (Hotel_Occupancy occupancy : occupancies) {
			if (occupancy.getRoom() != null) {
				if (room.getId() == occupancy.getRoom().getId()) {
			
					// Basic 1-dimensional box collision detection
					if (endTime > occupancy.getStartTime() && startTime < occupancy.getEndTime()) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ISearchResult> search(long startTime, long endTime, int numberOfPersons) {
		
		if (numberOfPersons < 1) {
			throw new IllegalArgumentException("numberOfPersons is 0 or less.");
		}
		if (numberOfPersons > 100) {
			throw new IllegalArgumentException("numberOfPersons is 100 or more");
		}
		
		if(startTime >= endTime) {
			throw new IllegalArgumentException("endTime before or equal to startTime");
		}
		
		EList<ISearchResult> results = new BasicEList<ISearchResult>();
		
		EList<Hotel_Room> rooms = persistenceService.getRooms();

	
		
		if (rooms.size() < 1) {
			return results;
		}


		abstract class RoomContainer {
			abstract int nBeds();
			abstract double price();
			abstract Hotel_Room room();
		}
		List<RoomContainer> sortedRooms = new ArrayList<>(rooms.size());
		for (final Hotel_Room room : rooms) {
			if (!isRoomAvailable(room, startTime, endTime)) {
				continue;
			}
			sortedRooms.add(new RoomContainer() {
				Hotel_Room room() {
					return room;
				}
				double price() {
					return room.getPrice();
				}
				int nBeds() {
					return room.getNumBeds();
				}
			});
		}
		Comparator<RoomContainer> comparator = new Comparator<RoomContainer>() {
			@Override
			public int compare(RoomContainer o1, RoomContainer o2) {
				int bedCompare = Integer.compare(o1.nBeds(), o2.nBeds());
				return bedCompare != 0 ? bedCompare : Double.compare(o1.price(), o2.price());
			}
		};
		Collections.sort(sortedRooms, comparator);
		class DummyRoom extends RoomContainer {
			private final int beds;
			private final double price;

			DummyRoom(int beds, double price) {
				this.beds = beds;
				this.price = price;
			}
			int nBeds() {
				return beds;
			}
			double price() {
				return price;
			}
			Hotel_Room room() {
				return null;
			}
		}

		Set<Set<RoomContainer>> resultSet = new HashSet<>();
		nRooms: for (int nRooms = 1; nRooms <= numberOfPersons && nRooms <= sortedRooms.size(); nRooms++) {
			int perRoom = numberOfPersons / nRooms;
			int extra = numberOfPersons % nRooms;
			int remaining = numberOfPersons;
			Set<RoomContainer> selected = new HashSet<>(nRooms);
			for (int upper =  -1 - (Collections.binarySearch(sortedRooms, new DummyRoom(perRoom + 1, -1.0), comparator)); extra > 0; upper++) {
				if (upper >= sortedRooms.size()) {
					continue nRooms;
				}
				RoomContainer room = sortedRooms.get(upper);
				selected.add(room);
				remaining -= room.nBeds();
				extra -= room.nBeds() - perRoom;
			}
			for (int lower = -1 - Collections.binarySearch(sortedRooms, new DummyRoom(perRoom, -1.0), comparator);
					remaining >= perRoom;
					lower++) {
				if (lower >= sortedRooms.size()) {
					continue nRooms;
				}
				if (selected.contains(sortedRooms.get(lower))) {
					continue;
				}
				RoomContainer room = sortedRooms.get(lower);
				selected.add(room);
				remaining -= room.nBeds();
			}
			for (int last = -1 - Collections.binarySearch(sortedRooms, new DummyRoom(remaining, -1.0), comparator); remaining > 0; last++) {
				if (last >= sortedRooms.size()) {
					continue nRooms;
				}
			    if (selected.contains(sortedRooms.get(last))) {
					continue;
				}
				RoomContainer room = sortedRooms.get(last);
				selected.add(room);
				remaining -= room.nBeds();
			}
			// If we get here, we have a suggestion!
			for (RoomContainer rc: selected) {
				if (rc.nBeds() + remaining < 0) {
					continue nRooms;
				}
			}
			resultSet.add(selected);
		}

		for (Set<RoomContainer> selected : resultSet) {
			Hotel_SearchResultImpl result = new Hotel_SearchResultImpl();
			for (RoomContainer rc : selected) {
				result.addBookingSuggestion(new Hotel_BookingSuggestionImpl(rc.room(), startTime, endTime));
			}
			results.add(result);
		}

		return results;
	}

	private IPerson findPerson(int id) {
		Collection<IPerson> people = basicGetPersonRegistry().getIPeople();
		for (IPerson person : people) {
			if (id == person.getId()) {
				return person;
			}
		}
		return null;
	}

	private boolean personIsYoungerThan(IPerson person, int ageInYears) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -ageInYears);
		Date xYearsAgo = calendar.getTime();

		Date personBirthDate = new Date(person.getBirthDate());
		return xYearsAgo.before(personBirthDate);
	}
	
	private boolean hasValidPaymentInfo(IPerson person) {
		try {
			CustomerRequires instance = CustomerRequires.instance();
			ICreditCardInfo card = person.getCreditCard();
			return instance.isCreditCardValid(card.getCCNumber(), card.getCCV(), card.getMonth(), card.getYear(), card.getFirstName(), card.getLastName());
		} catch (SOAPException e) {
			throw new RuntimeException("Couldn't establish SOAP.");
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean placeOrder(OrderRequest orderRequest) {
		
		// Check if person info is correct
		IPerson customer = findPerson(orderRequest.getCustomer());
		if (customer == null) {
			throw new IllegalArgumentException("Customer does not exist.");
		}
		if (personIsYoungerThan(customer, legalAge)) {
			throw new IllegalArgumentException("Customer is not of legal age.");
		}
		if (!hasValidPaymentInfo(customer)) {
			throw new IllegalArgumentException("Customer doesn't have valid payment info.");
		}
		if (basicGetPersonRegistry().isBlacklisted(customer.getId())) {
			throw new IllegalArgumentException("Customer is blacklisted.");
		}
		
		for (BookingRequest bookingReq : orderRequest.getBookingRequests()) {
			IPerson contact = findPerson(bookingReq.getContact());
			if (contact == null) {
				throw new IllegalArgumentException("Contact does not exist");
			}
			if (basicGetPersonRegistry().isBlacklisted(contact.getId())) {
				throw new IllegalArgumentException("Contact is blacklisted.");
			}
			
			for (int guestId : bookingReq.getGuests()) {
				IPerson guest = findPerson(guestId);
				if (guest == null) {
					throw new IllegalArgumentException("Guest does not exist.");
				}
				if (basicGetPersonRegistry().isBlacklisted(guest.getId())) {
					throw new IllegalArgumentException("Guest is blacklisted");
				}
			}
		}
		
		// Check if room info is correct and place order if that's the case
		synchronized (this) {
			
			// Check if requested rooms are available during the requested intervals
			for (BookingRequest bookingReq : orderRequest.getBookingRequests()) {
				IBookingSuggestion bs = bookingReq.getBookingSuggestion();
				if (bs.getStartTime() >= bs.getEndTime()) {
					throw new IllegalArgumentException("endTime is before or at the same time as the starTime.");
				}
				if (!isRoomAvailable(bs.getRoom(), bs.getStartTime(), bs.getEndTime())) {
					throw new IllegalArgumentException("One of the rooms is not available for booking at specified time");
				}
			}
			
			EList<Hotel_Booking> creatBookings = new BasicEList<>();
			for (BookingRequest bookingReq : orderRequest.getBookingRequests()) {
				
				Hotel_OccupancyImpl occupancy = new Hotel_OccupancyImpl(bookingReq.getBookingSuggestion().getStartTime(), bookingReq.getBookingSuggestion().getEndTime(), persistenceService.getRoomById(bookingReq.getBookingSuggestion().getRoom().getId()));
				
				Hotel_Booking tempBooking = new Hotel_BookingImpl(bookingReq.getGuests(), bookingReq.getContact(), orderRequest.getCustomer(),
				     bookingReq.getBookingSuggestion().getPrice(), bookingReq.getBookingSuggestion().getStartTime(), bookingReq.getBookingSuggestion().getEndTime(), occupancy);
				
				tempBooking.setStay(new Hotel_StayImpl(new Hotel_OccupancyImpl(occupancy))); // TODO: This is a stupid. Stays are bad.
				
				creatBookings.add(tempBooking);
			}
			
			Hotel_Order order = new Hotel_OrderImpl(orderRequest.getCustomer(), creatBookings);
			persistenceService.addOrder(order);
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IRoom createRoom(int nbrOfBeds, double basePrice) {
		Hotel_RoomImpl room = new Hotel_RoomImpl(nbrOfBeds, basePrice);
		persistenceService.addRoom(room);
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IRoom> getRooms() {
		return new BasicEList<IRoom>(persistenceService.getRooms());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deleteRoom(int roomId) {
		// TODO: Before someone tries to implement this, keep in mind that bookings is connected to rooms.
		// If we just remove a room from the list then the Room will still connect since we have pointers to it from Bookings.
		// So, be very careful. Maybe don't implement this.
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setLegalAge(int age) {
		this.legalAge = age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getLegalAge() {
		return legalAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBookingInterval(long length) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTimeInFutureBookingIsPossible(long time) {
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
			case HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY:
				if (resolve) return getPersonRegistry();
				return basicGetPersonRegistry();
			case HotelPackage.HOTEL_HOTEL__PERSISTENCE_SERVICE:
				if (resolve) return getPersistenceService();
				return basicGetPersistenceService();
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
			case HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY:
				setPersonRegistry((IPersonRegistry)newValue);
				return;
			case HotelPackage.HOTEL_HOTEL__PERSISTENCE_SERVICE:
				setPersistenceService((IPersistenceService)newValue);
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
			case HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY:
				setPersonRegistry((IPersonRegistry)null);
				return;
			case HotelPackage.HOTEL_HOTEL__PERSISTENCE_SERVICE:
				setPersistenceService((IPersistenceService)null);
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
			case HotelPackage.HOTEL_HOTEL__PERSON_REGISTRY:
				return personRegistry != null;
			case HotelPackage.HOTEL_HOTEL__PERSISTENCE_SERVICE:
				return persistenceService != null;
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
		if (baseClass == IConfiguration.class) {
			switch (baseOperationID) {
				case HotelPackage.ICONFIGURATION___CREATE_ROOM__INT_DOUBLE: return HotelPackage.HOTEL_HOTEL___CREATE_ROOM__INT_DOUBLE;
				case HotelPackage.ICONFIGURATION___GET_ROOMS: return HotelPackage.HOTEL_HOTEL___GET_ROOMS;
				case HotelPackage.ICONFIGURATION___DELETE_ROOM__INT: return HotelPackage.HOTEL_HOTEL___DELETE_ROOM__INT;
				case HotelPackage.ICONFIGURATION___SET_LEGAL_AGE__INT: return HotelPackage.HOTEL_HOTEL___SET_LEGAL_AGE__INT;
				case HotelPackage.ICONFIGURATION___GET_LEGAL_AGE: return HotelPackage.HOTEL_HOTEL___GET_LEGAL_AGE;
				case HotelPackage.ICONFIGURATION___SET_MAX_BOOKING_INTERVAL__LONG: return HotelPackage.HOTEL_HOTEL___SET_MAX_BOOKING_INTERVAL__LONG;
				case HotelPackage.ICONFIGURATION___SET_MAX_TIME_IN_FUTURE_BOOKING_IS_POSSIBLE__LONG: return HotelPackage.HOTEL_HOTEL___SET_MAX_TIME_IN_FUTURE_BOOKING_IS_POSSIBLE__LONG;
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
			case HotelPackage.HOTEL_HOTEL___CHECK_IN__INT_INT:
				return checkIn((Integer)arguments.get(0), (Integer)arguments.get(1));
			case HotelPackage.HOTEL_HOTEL___GET_BILL__INT:
				return getBill((Integer)arguments.get(0));
			case HotelPackage.HOTEL_HOTEL___GET_BOOKINGS:
				return getBookings();
			case HotelPackage.HOTEL_HOTEL___PAY__INT:
				return pay((Integer)arguments.get(0));
			case HotelPackage.HOTEL_HOTEL___CHECK_OUT__INT:
				return checkOut((Integer)arguments.get(0));
			case HotelPackage.HOTEL_HOTEL___GET_ORDERS:
				return getOrders();
			case HotelPackage.HOTEL_HOTEL___GET_RELEVANT_CHECK_IN_BOOKINGS__INT:
				return getRelevantCheckInBookings((Integer)arguments.get(0));
			case HotelPackage.HOTEL_HOTEL___HAND_IN_KEYS__INT_INT:
				return handInKeys((Integer)arguments.get(0), (Integer)arguments.get(1));
			case HotelPackage.HOTEL_HOTEL___SEARCH__LONG_LONG_INT:
				return search((Long)arguments.get(0), (Long)arguments.get(1), (Integer)arguments.get(2));
			case HotelPackage.HOTEL_HOTEL___PLACE_ORDER__ORDERREQUEST:
				return placeOrder((OrderRequest)arguments.get(0));
			case HotelPackage.HOTEL_HOTEL___CREATE_ROOM__INT_DOUBLE:
				return createRoom((Integer)arguments.get(0), (Double)arguments.get(1));
			case HotelPackage.HOTEL_HOTEL___GET_ROOMS:
				return getRooms();
			case HotelPackage.HOTEL_HOTEL___DELETE_ROOM__INT:
				deleteRoom((Integer)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_HOTEL___SET_LEGAL_AGE__INT:
				setLegalAge((Integer)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_HOTEL___GET_LEGAL_AGE:
				return getLegalAge();
			case HotelPackage.HOTEL_HOTEL___SET_MAX_BOOKING_INTERVAL__LONG:
				setMaxBookingInterval((Long)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_HOTEL___SET_MAX_TIME_IN_FUTURE_BOOKING_IS_POSSIBLE__LONG:
				setMaxTimeInFutureBookingIsPossible((Long)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_HotelImpl
