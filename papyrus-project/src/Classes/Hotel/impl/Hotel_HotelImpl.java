/**
 */
package Classes.Hotel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	private int legalAge;
	private static final int MAX_ROOM_COMBINATION = 2;

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
		return booking.getPrice(); //A bill should include customer and price objects. But double...
	}

	private Hotel_Booking findBooking(IBooking booking){
		for(Hotel_Order order : persistenceService.getOrders()){
			for(Hotel_Booking aBooking : order.getBooking()){
				if(aBooking.getID() == booking.getID()){
					return aBooking;
				}
			}
		}
		
		return null;
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
		if(booking.isCheckedIn()){
			booking.setCheckedIn(false);
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
		persistenceService.getBookingById(bookingId).getOccupancy().removeKeys(nbrKeys);
		if(persistenceService.getBookingById(bookingId).getOccupancy().getNumKeys() > 0) // Not all keys are handed in
			return false;
		return true;
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

		
		// Add everything into roomtype map, could be cached / done somewhere else
		Map<Integer, List<Hotel_Room>> roomtypeToRoom = new HashMap<Integer, List<Hotel_Room>>();
		for(Hotel_Room r : rooms) {
			List<Hotel_Room> ofType = roomtypeToRoom.get(r.getNumBeds());
			if(ofType == null) {
				ofType = new ArrayList<Hotel_Room>();
				roomtypeToRoom.put(r.getNumBeds(), ofType);
			}
			ofType.add(r);
		}
		
		List<Integer> roomTypesAvailable = new ArrayList<Integer>(roomtypeToRoom.keySet());
		int largestRoom = roomTypesAvailable.get(roomTypesAvailable.size() - 1);

		// Keep track of the smallest value for the largest room in previous result. I know, makes no sense.
		// Used to prevent getting a room as big in a result with more rooms.
		int minLargestRoomSize = 0; //  
		boolean minFound = false;

		for (int numRooms = 1; numRooms <= MAX_ROOM_COMBINATION; numRooms++) {
			for (int extraBeds = 0; extraBeds < largestRoom; extraBeds++) {
				List<ISearchResult> partResult = findValidResults(numberOfPersons, startTime, endTime, numRooms,extraBeds, roomTypesAvailable, largestRoom, roomtypeToRoom);

				if (partResult.size() > 0) {
					
					// Try to not add results that are plainly worse than those
					// with less rooms
					int partLargest = getLargestRoomSize(partResult);
					if (!minFound || partLargest < minLargestRoomSize) {
						minLargestRoomSize = partLargest;
						minFound = true;
					} else {
						continue; // A bit unsure if this is appropriate
					}
					
					results.addAll(partResult);
					break;
				}
			}
		}
		
		return results;
	}

	private int getLargestRoomSize(List<ISearchResult> partResult) {
		int max = 0;
		for(ISearchResult sr : partResult) {
			for (IBookingSuggestion bs : sr.getBookingSuggestions()) {
				max = Math.max(max, bs.getRoom().getNumBeds());
			}
		}
		return max;
	}

	private List<ISearchResult> findValidResults(int numPeople, long startTime,
			long endTime, int numRooms, int extraBeds,
			List<Integer> roomTypesAvailable,
			int largestRoom, Map<Integer, List<Hotel_Room>> roomtypeToRoom) {
		List<ISearchResult> results = new ArrayList<ISearchResult>();
		if (numRooms == 1) {
			fillOneRoomresults(results, numPeople, startTime, startTime,
					endTime, extraBeds, roomTypesAvailable, largestRoom, roomtypeToRoom);
		} else if (numRooms == 2) {
			fillTwoRoomresults(results, numPeople, startTime, startTime,
					endTime, extraBeds, roomTypesAvailable, largestRoom, roomtypeToRoom);
		} else {
			// No can do
		}
		return results;
	}

	private void fillOneRoomresults(List<ISearchResult> results, int numPeople,
			long startTime, long startTime2, long endTime, int extraBeds,
			List<Integer> roomTypesAvailable, int largestRoom,
			Map<Integer, List<Hotel_Room>> roomtypeToRoom) {
		List<Hotel_Room> rooms = roomtypeToRoom.get(numPeople + extraBeds);
		if (rooms == null) {
			return;
		}
		Hotel_Room room = findOneResultInList(rooms, startTime, endTime);

		if (room == null) {
			return;
		}

		Hotel_BookingSuggestion sug = new Hotel_BookingSuggestionImpl(room,
				startTime, endTime);
		Hotel_SearchResult res = new Hotel_SearchResultImpl();
		res.addBookingSuggestion(sug);
		results.add(res);
	}

	private void fillTwoRoomresults(List<ISearchResult> results, int numPeople,
			long startTime, long startTime2, long endTime, int extraBeds,
			List<Integer> roomTypesAvailable,
			int largestRoom, Map<Integer, List<Hotel_Room>> roomtypeToRoom) {
		for (int room1Beds = 1; true; room1Beds++) {
			int room2Beds = numPeople - room1Beds + extraBeds;

			if(room1Beds > room2Beds) {
				break;
			}
			
			Hotel_Room room1Match = null;
			Hotel_Room room2Match = null;

			// Need to handle rooms of the same type separately
			if (room1Beds != room2Beds) {

				List<Hotel_Room> room1Sized = roomtypeToRoom.get(room1Beds);
				List<Hotel_Room> room2Sized = roomtypeToRoom.get(room2Beds);

				if (room1Sized == null || room2Sized == null) {
					continue;
				}

				room1Match = findOneResultInList(room1Sized, startTime, endTime);

				if (room1Match == null) {
					continue;
				}

				room2Match = findOneResultInList(room2Sized, startTime, endTime);
				if (room2Match == null) {
					continue;
				}

			} else {				
				List<Hotel_Room> roomsSharedSize = roomtypeToRoom
						.get(room1Beds);
				if (roomsSharedSize == null) {
					continue;
				}
				List<Hotel_Room> roomsFound = new ArrayList<>();
				for (Hotel_Room room : roomsSharedSize) {
					if (isRoomAvailable(room, startTime, endTime)) {
						roomsFound.add(room);
						if (roomsFound.size() == 2) {
							break;
						}
					}
				}
				if (roomsFound.size() != 2) {
					continue;
				}
				room1Match = roomsFound.get(0);
				room2Match = roomsFound.get(1);
			}

			Hotel_SearchResult result = new Hotel_SearchResultImpl();
			result.addBookingSuggestion(new Hotel_BookingSuggestionImpl(
					room1Match, startTime, endTime));
			result.addBookingSuggestion(new Hotel_BookingSuggestionImpl(
					room2Match, startTime, endTime));
			results.add(result);
		}
	}
	
	private Hotel_Room findOneResultInList(List<Hotel_Room> list,
			long startTime, long endTime) {
		for (Hotel_Room room : list) {
			if (isRoomAvailable(room, startTime, endTime)) {
				return room;
			}
		}
		return null;
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
	
	private boolean personIsYoungerThanX(IPerson person, int x) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, - x);
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
		if (personIsYoungerThanX(customer, legalAge)) {
			throw new IllegalArgumentException("Customer is younger than 15.");
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_HotelImpl
