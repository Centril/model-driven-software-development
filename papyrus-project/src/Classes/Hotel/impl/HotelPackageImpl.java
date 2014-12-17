/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.Hotel;
import Classes.Hotel.HotelFactory;
import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Booking;
import Classes.Hotel.Hotel_BookingSuggestion;
import Classes.Hotel.Hotel_DummyPersistenceService;
import Classes.Hotel.Hotel_Hotel;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_Order;
import Classes.Hotel.Hotel_Room;
import Classes.Hotel.Hotel_SearchResult;
import Classes.Hotel.Hotel_Stay;
import Classes.Hotel.IBooking;
import Classes.Hotel.IBookingSuggestion;
import Classes.Hotel.IFrontDesk;
import Classes.Hotel.IOrder;
import Classes.Hotel.IOrdering;
import Classes.Hotel.IPersistenceService;
import Classes.Hotel.IRoom;
import Classes.Hotel.ISearch;
import Classes.Hotel.ISearchResult;
import Classes.Hotel.OrderRequest;
import Classes.PersonRegistry.PersonRegistryPackage;
import Classes.PersonRegistry.impl.PersonRegistryPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelPackageImpl extends EPackageImpl implements HotelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_RoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_OccupancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_StayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_BookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_OrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_BookingSuggestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingSuggestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_SearchResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSearchResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_HotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPersistenceServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFrontDeskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iOrderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_DummyPersistenceServiceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Classes.Hotel.HotelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelPackageImpl() {
		super(eNS_URI, HotelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HotelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelPackage init() {
		if (isInited) return (HotelPackage)EPackage.Registry.INSTANCE.getEPackage(HotelPackage.eNS_URI);

		// Obtain or create and register package
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HotelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PersonRegistryPackageImpl thePersonRegistryPackage = (PersonRegistryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonRegistryPackage.eNS_URI) instanceof PersonRegistryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonRegistryPackage.eNS_URI) : PersonRegistryPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHotelPackage.createPackageContents();
		thePersonRegistryPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theHotelPackage.initializePackageContents();
		thePersonRegistryPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHotelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelPackage.eNS_URI, theHotelPackage);
		return theHotelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel() {
		return hotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Room() {
		return hotel_RoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoom() {
		return iRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__GetId() {
		return iRoomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__GetNumBeds() {
		return iRoomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__GetPrice() {
		return iRoomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__SetId__int() {
		return iRoomEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__SetNumBeds__int() {
		return iRoomEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__SetPrice__double() {
		return iRoomEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__GetName() {
		return iRoomEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__SetName__String() {
		return iRoomEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__GetRoomInfo() {
		return iRoomEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__SetIsOutOfOrder__boolean() {
		return iRoomEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__SetRoomInfo__String() {
		return iRoomEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__IsOutOfOrder() {
		return iRoomEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Occupancy() {
		return hotel_OccupancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Occupancy_Room() {
		return (EReference)hotel_OccupancyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel_Occupancy__AddKeys__int() {
		return hotel_OccupancyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel_Occupancy__RemoveKeys__int() {
		return hotel_OccupancyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel_Occupancy__GetStartTime() {
		return hotel_OccupancyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel_Occupancy__GetEndTime() {
		return hotel_OccupancyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel_Occupancy__SetStartTime__long() {
		return hotel_OccupancyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel_Occupancy__SetEndTime__long() {
		return hotel_OccupancyEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel_Occupancy__GetNumKeys() {
		return hotel_OccupancyEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Stay() {
		return hotel_StayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Stay_Occupancy() {
		return (EReference)hotel_StayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Booking() {
		return hotel_BookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Booking_Stay() {
		return (EReference)hotel_BookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Booking_Occupancy() {
		return (EReference)hotel_BookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBooking() {
		return iBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetContact() {
		return iBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetPrice() {
		return iBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetGuests() {
		return iBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetCheckInDate() {
		return iBookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetCheckOutDate() {
		return iBookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetCustomer() {
		return iBookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Order() {
		return hotel_OrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Order_Booking() {
		return (EReference)hotel_OrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOrder() {
		return iOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOrder__GetBookings() {
		return iOrderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOrder__GetCustomer() {
		return iOrderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_BookingSuggestion() {
		return hotel_BookingSuggestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_BookingSuggestion_Room() {
		return (EReference)hotel_BookingSuggestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookingSuggestion() {
		return iBookingSuggestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingSuggestion__GetPrice() {
		return iBookingSuggestionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingSuggestion__GetStartTime() {
		return iBookingSuggestionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingSuggestion__GetEndTime() {
		return iBookingSuggestionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingSuggestion__GetRoom() {
		return iBookingSuggestionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_SearchResult() {
		return hotel_SearchResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_SearchResult_BookingSuggestion() {
		return (EReference)hotel_SearchResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel_SearchResult__AddBookingSuggestion__Hotel_BookingSuggestion() {
		return hotel_SearchResultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISearchResult() {
		return iSearchResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getISearchResult__GetBookingSuggestions() {
		return iSearchResultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getISearchResult__GetPrice() {
		return iSearchResultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Hotel() {
		return hotel_HotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Hotel_PersonRegistry() {
		return (EReference)hotel_HotelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Hotel_PersistenceService() {
		return (EReference)hotel_HotelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPersistenceService() {
		return iPersistenceServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersistenceService__GetOccupancies() {
		return iPersistenceServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersistenceService__GetAllRooms() {
		return iPersistenceServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersistenceService__GetRoomById__int() {
		return iPersistenceServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersistenceService__GetAllOrders() {
		return iPersistenceServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersistenceService__AddOrder__Hotel_Order() {
		return iPersistenceServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersistenceService__AddRoom__Hotel_Room() {
		return iPersistenceServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFrontDesk() {
		return iFrontDeskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFrontDesk__CheckIn__IBooking_int() {
		return iFrontDeskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFrontDesk__GetBill__IBooking() {
		return iFrontDeskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFrontDesk__GetBookings() {
		return iFrontDeskEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFrontDesk__Pay__IBooking() {
		return iFrontDeskEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFrontDesk__CheckOut__IBooking_int() {
		return iFrontDeskEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFrontDesk__GetOrders() {
		return iFrontDeskEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISearch() {
		return iSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getISearch__Search__long_long_int() {
		return iSearchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOrdering() {
		return iOrderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOrdering__PlaceOrder__OrderRequest() {
		return iOrderingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderRequest() {
		return orderRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrderRequest__GetCustomer() {
		return orderRequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrderRequest__GetBookingRequests() {
		return orderRequestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingRequest() {
		return bookingRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingRequest__GetBookingSuggestion() {
		return bookingRequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingRequest__GetContact() {
		return bookingRequestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingRequest__GetGuests() {
		return bookingRequestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_DummyPersistenceService() {
		return hotel_DummyPersistenceServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_DummyPersistenceService_Order() {
		return (EReference)hotel_DummyPersistenceServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_DummyPersistenceService_Room() {
		return (EReference)hotel_DummyPersistenceServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_DummyPersistenceService_Occupancy() {
		return (EReference)hotel_DummyPersistenceServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelFactory getHotelFactory() {
		return (HotelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hotelEClass = createEClass(HOTEL);

		hotel_RoomEClass = createEClass(HOTEL_ROOM);

		iRoomEClass = createEClass(IROOM);
		createEOperation(iRoomEClass, IROOM___GET_ID);
		createEOperation(iRoomEClass, IROOM___GET_NUM_BEDS);
		createEOperation(iRoomEClass, IROOM___GET_PRICE);
		createEOperation(iRoomEClass, IROOM___SET_ID__INT);
		createEOperation(iRoomEClass, IROOM___SET_NUM_BEDS__INT);
		createEOperation(iRoomEClass, IROOM___SET_PRICE__DOUBLE);
		createEOperation(iRoomEClass, IROOM___GET_NAME);
		createEOperation(iRoomEClass, IROOM___SET_NAME__STRING);
		createEOperation(iRoomEClass, IROOM___GET_ROOM_INFO);
		createEOperation(iRoomEClass, IROOM___SET_IS_OUT_OF_ORDER__BOOLEAN);
		createEOperation(iRoomEClass, IROOM___SET_ROOM_INFO__STRING);
		createEOperation(iRoomEClass, IROOM___IS_OUT_OF_ORDER);

		hotel_OccupancyEClass = createEClass(HOTEL_OCCUPANCY);
		createEReference(hotel_OccupancyEClass, HOTEL_OCCUPANCY__ROOM);
		createEOperation(hotel_OccupancyEClass, HOTEL_OCCUPANCY___ADD_KEYS__INT);
		createEOperation(hotel_OccupancyEClass, HOTEL_OCCUPANCY___REMOVE_KEYS__INT);
		createEOperation(hotel_OccupancyEClass, HOTEL_OCCUPANCY___GET_START_TIME);
		createEOperation(hotel_OccupancyEClass, HOTEL_OCCUPANCY___GET_END_TIME);
		createEOperation(hotel_OccupancyEClass, HOTEL_OCCUPANCY___SET_START_TIME__LONG);
		createEOperation(hotel_OccupancyEClass, HOTEL_OCCUPANCY___SET_END_TIME__LONG);
		createEOperation(hotel_OccupancyEClass, HOTEL_OCCUPANCY___GET_NUM_KEYS);

		hotel_StayEClass = createEClass(HOTEL_STAY);
		createEReference(hotel_StayEClass, HOTEL_STAY__OCCUPANCY);

		hotel_BookingEClass = createEClass(HOTEL_BOOKING);
		createEReference(hotel_BookingEClass, HOTEL_BOOKING__STAY);
		createEReference(hotel_BookingEClass, HOTEL_BOOKING__OCCUPANCY);

		iBookingEClass = createEClass(IBOOKING);
		createEOperation(iBookingEClass, IBOOKING___GET_CONTACT);
		createEOperation(iBookingEClass, IBOOKING___GET_PRICE);
		createEOperation(iBookingEClass, IBOOKING___GET_GUESTS);
		createEOperation(iBookingEClass, IBOOKING___GET_CHECK_IN_DATE);
		createEOperation(iBookingEClass, IBOOKING___GET_CHECK_OUT_DATE);
		createEOperation(iBookingEClass, IBOOKING___GET_CUSTOMER);

		hotel_OrderEClass = createEClass(HOTEL_ORDER);
		createEReference(hotel_OrderEClass, HOTEL_ORDER__BOOKING);

		iOrderEClass = createEClass(IORDER);
		createEOperation(iOrderEClass, IORDER___GET_BOOKINGS);
		createEOperation(iOrderEClass, IORDER___GET_CUSTOMER);

		hotel_BookingSuggestionEClass = createEClass(HOTEL_BOOKING_SUGGESTION);
		createEReference(hotel_BookingSuggestionEClass, HOTEL_BOOKING_SUGGESTION__ROOM);

		iBookingSuggestionEClass = createEClass(IBOOKING_SUGGESTION);
		createEOperation(iBookingSuggestionEClass, IBOOKING_SUGGESTION___GET_PRICE);
		createEOperation(iBookingSuggestionEClass, IBOOKING_SUGGESTION___GET_START_TIME);
		createEOperation(iBookingSuggestionEClass, IBOOKING_SUGGESTION___GET_END_TIME);
		createEOperation(iBookingSuggestionEClass, IBOOKING_SUGGESTION___GET_ROOM);

		hotel_SearchResultEClass = createEClass(HOTEL_SEARCH_RESULT);
		createEReference(hotel_SearchResultEClass, HOTEL_SEARCH_RESULT__BOOKING_SUGGESTION);
		createEOperation(hotel_SearchResultEClass, HOTEL_SEARCH_RESULT___ADD_BOOKING_SUGGESTION__HOTEL_BOOKINGSUGGESTION);

		iSearchResultEClass = createEClass(ISEARCH_RESULT);
		createEOperation(iSearchResultEClass, ISEARCH_RESULT___GET_BOOKING_SUGGESTIONS);
		createEOperation(iSearchResultEClass, ISEARCH_RESULT___GET_PRICE);

		hotel_HotelEClass = createEClass(HOTEL_HOTEL);
		createEReference(hotel_HotelEClass, HOTEL_HOTEL__PERSON_REGISTRY);
		createEReference(hotel_HotelEClass, HOTEL_HOTEL__PERSISTENCE_SERVICE);

		iPersistenceServiceEClass = createEClass(IPERSISTENCE_SERVICE);
		createEOperation(iPersistenceServiceEClass, IPERSISTENCE_SERVICE___GET_OCCUPANCIES);
		createEOperation(iPersistenceServiceEClass, IPERSISTENCE_SERVICE___GET_ALL_ROOMS);
		createEOperation(iPersistenceServiceEClass, IPERSISTENCE_SERVICE___GET_ROOM_BY_ID__INT);
		createEOperation(iPersistenceServiceEClass, IPERSISTENCE_SERVICE___GET_ALL_ORDERS);
		createEOperation(iPersistenceServiceEClass, IPERSISTENCE_SERVICE___ADD_ORDER__HOTEL_ORDER);
		createEOperation(iPersistenceServiceEClass, IPERSISTENCE_SERVICE___ADD_ROOM__HOTEL_ROOM);

		iFrontDeskEClass = createEClass(IFRONT_DESK);
		createEOperation(iFrontDeskEClass, IFRONT_DESK___CHECK_IN__IBOOKING_INT);
		createEOperation(iFrontDeskEClass, IFRONT_DESK___GET_BILL__IBOOKING);
		createEOperation(iFrontDeskEClass, IFRONT_DESK___GET_BOOKINGS);
		createEOperation(iFrontDeskEClass, IFRONT_DESK___PAY__IBOOKING);
		createEOperation(iFrontDeskEClass, IFRONT_DESK___CHECK_OUT__IBOOKING_INT);
		createEOperation(iFrontDeskEClass, IFRONT_DESK___GET_ORDERS);

		iSearchEClass = createEClass(ISEARCH);
		createEOperation(iSearchEClass, ISEARCH___SEARCH__LONG_LONG_INT);

		iOrderingEClass = createEClass(IORDERING);
		createEOperation(iOrderingEClass, IORDERING___PLACE_ORDER__ORDERREQUEST);

		orderRequestEClass = createEClass(ORDER_REQUEST);
		createEOperation(orderRequestEClass, ORDER_REQUEST___GET_CUSTOMER);
		createEOperation(orderRequestEClass, ORDER_REQUEST___GET_BOOKING_REQUESTS);

		bookingRequestEClass = createEClass(BOOKING_REQUEST);
		createEOperation(bookingRequestEClass, BOOKING_REQUEST___GET_BOOKING_SUGGESTION);
		createEOperation(bookingRequestEClass, BOOKING_REQUEST___GET_CONTACT);
		createEOperation(bookingRequestEClass, BOOKING_REQUEST___GET_GUESTS);

		hotel_DummyPersistenceServiceEClass = createEClass(HOTEL_DUMMY_PERSISTENCE_SERVICE);
		createEReference(hotel_DummyPersistenceServiceEClass, HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDER);
		createEReference(hotel_DummyPersistenceServiceEClass, HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOM);
		createEReference(hotel_DummyPersistenceServiceEClass, HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		PersonRegistryPackage thePersonRegistryPackage = (PersonRegistryPackage)EPackage.Registry.INSTANCE.getEPackage(PersonRegistryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hotel_RoomEClass.getESuperTypes().add(this.getIRoom());
		hotel_BookingEClass.getESuperTypes().add(this.getIBooking());
		hotel_OrderEClass.getESuperTypes().add(this.getIOrder());
		hotel_BookingSuggestionEClass.getESuperTypes().add(this.getIBookingSuggestion());
		hotel_SearchResultEClass.getESuperTypes().add(this.getISearchResult());
		hotel_HotelEClass.getESuperTypes().add(this.getIFrontDesk());
		hotel_HotelEClass.getESuperTypes().add(this.getISearch());
		hotel_HotelEClass.getESuperTypes().add(this.getIOrdering());
		hotel_DummyPersistenceServiceEClass.getESuperTypes().add(this.getIPersistenceService());

		// Initialize classes, features, and operations; add parameters
		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotel_RoomEClass, Hotel_Room.class, "Hotel_Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRoomEClass, IRoom.class, "IRoom", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRoom__GetId(), ecorePackage.getEInt(), "getId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoom__GetNumBeds(), ecorePackage.getEInt(), "getNumBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoom__GetPrice(), ecorePackage.getEDouble(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIRoom__SetId__int(), null, "setId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoom__SetNumBeds__int(), null, "setNumBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoom__SetPrice__double(), null, "setPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoom__GetName(), theTypesPackage.getString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoom__SetName__String(), null, "setName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoom__GetRoomInfo(), theTypesPackage.getString(), "getRoomInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoom__SetIsOutOfOrder__boolean(), null, "setIsOutOfOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "outOfOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoom__SetRoomInfo__String(), null, "setRoomInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "info", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoom__IsOutOfOrder(), ecorePackage.getEBoolean(), "isOutOfOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotel_OccupancyEClass, Hotel_Occupancy.class, "Hotel_Occupancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotel_Occupancy_Room(), this.getHotel_Room(), null, "room", null, 1, 1, Hotel_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getHotel_Occupancy__AddKeys__int(), null, "addKeys", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHotel_Occupancy__RemoveKeys__int(), null, "removeKeys", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getHotel_Occupancy__GetStartTime(), ecorePackage.getELong(), "getStartTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getHotel_Occupancy__GetEndTime(), ecorePackage.getELong(), "getEndTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHotel_Occupancy__SetStartTime__long(), null, "setStartTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "startTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHotel_Occupancy__SetEndTime__long(), null, "setEndTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "endTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getHotel_Occupancy__GetNumKeys(), ecorePackage.getEInt(), "getNumKeys", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotel_StayEClass, Hotel_Stay.class, "Hotel_Stay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotel_Stay_Occupancy(), this.getHotel_Occupancy(), null, "occupancy", null, 1, -1, Hotel_Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_BookingEClass, Hotel_Booking.class, "Hotel_Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotel_Booking_Stay(), this.getHotel_Stay(), null, "stay", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Booking_Occupancy(), this.getHotel_Occupancy(), null, "occupancy", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingEClass, IBooking.class, "IBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBooking__GetContact(), ecorePackage.getEInt(), "getContact", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetPrice(), ecorePackage.getEDouble(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetGuests(), ecorePackage.getEInt(), "getGuests", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetCheckInDate(), ecorePackage.getELong(), "getCheckInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetCheckOutDate(), ecorePackage.getELong(), "getCheckOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetCustomer(), ecorePackage.getEInt(), "getCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotel_OrderEClass, Hotel_Order.class, "Hotel_Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotel_Order_Booking(), this.getHotel_Booking(), null, "booking", null, 0, -1, Hotel_Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iOrderEClass, IOrder.class, "IOrder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIOrder__GetBookings(), this.getIBooking(), "getBookings", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIOrder__GetCustomer(), ecorePackage.getEInt(), "getCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotel_BookingSuggestionEClass, Hotel_BookingSuggestion.class, "Hotel_BookingSuggestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotel_BookingSuggestion_Room(), this.getHotel_Room(), null, "room", null, 1, 1, Hotel_BookingSuggestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingSuggestionEClass, IBookingSuggestion.class, "IBookingSuggestion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBookingSuggestion__GetPrice(), ecorePackage.getEDouble(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookingSuggestion__GetStartTime(), ecorePackage.getELong(), "getStartTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookingSuggestion__GetEndTime(), ecorePackage.getELong(), "getEndTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookingSuggestion__GetRoom(), this.getIRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotel_SearchResultEClass, Hotel_SearchResult.class, "Hotel_SearchResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotel_SearchResult_BookingSuggestion(), this.getHotel_BookingSuggestion(), null, "bookingSuggestion", null, 1, -1, Hotel_SearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getHotel_SearchResult__AddBookingSuggestion__Hotel_BookingSuggestion(), null, "addBookingSuggestion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_BookingSuggestion(), "suggestion", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iSearchResultEClass, ISearchResult.class, "ISearchResult", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getISearchResult__GetBookingSuggestions(), this.getIBookingSuggestion(), "getBookingSuggestions", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getISearchResult__GetPrice(), ecorePackage.getEDouble(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotel_HotelEClass, Hotel_Hotel.class, "Hotel_Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotel_Hotel_PersonRegistry(), thePersonRegistryPackage.getIPersonRegistry(), null, "personRegistry", null, 1, 1, Hotel_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Hotel_PersistenceService(), this.getIPersistenceService(), null, "persistenceService", null, 1, 1, Hotel_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iPersistenceServiceEClass, IPersistenceService.class, "IPersistenceService", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIPersistenceService__GetOccupancies(), this.getHotel_Occupancy(), "getOccupancies", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPersistenceService__GetAllRooms(), this.getHotel_Room(), "getAllRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIPersistenceService__GetRoomById__int(), this.getHotel_Room(), "getRoomById", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPersistenceService__GetAllOrders(), this.getHotel_Order(), "getAllOrders", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIPersistenceService__AddOrder__Hotel_Order(), ecorePackage.getEBoolean(), "addOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Order(), "order", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIPersistenceService__AddRoom__Hotel_Room(), ecorePackage.getEBoolean(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iFrontDeskEClass, IFrontDesk.class, "IFrontDesk", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIFrontDesk__CheckIn__IBooking_int(), ecorePackage.getEBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numKeys", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFrontDesk__GetBill__IBooking(), ecorePackage.getEDouble(), "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIFrontDesk__GetBookings(), this.getIBooking(), "getBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFrontDesk__Pay__IBooking(), ecorePackage.getEBoolean(), "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFrontDesk__CheckOut__IBooking_int(), ecorePackage.getEBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numKeys", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIFrontDesk__GetOrders(), this.getIOrder(), "getOrders", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iSearchEClass, ISearch.class, "ISearch", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getISearch__Search__long_long_int(), this.getISearchResult(), "search", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "startTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "endTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfPersons", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iOrderingEClass, IOrdering.class, "IOrdering", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIOrdering__PlaceOrder__OrderRequest(), ecorePackage.getEBoolean(), "placeOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getOrderRequest(), "orderRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(orderRequestEClass, OrderRequest.class, "OrderRequest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOrderRequest__GetCustomer(), ecorePackage.getEInt(), "getCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOrderRequest__GetBookingRequests(), this.getBookingRequest(), "getBookingRequests", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingRequestEClass, BookingRequest.class, "BookingRequest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBookingRequest__GetBookingSuggestion(), this.getIBookingSuggestion(), "getBookingSuggestion", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingRequest__GetContact(), ecorePackage.getEInt(), "getContact", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingRequest__GetGuests(), ecorePackage.getEInt(), "getGuests", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotel_DummyPersistenceServiceEClass, Hotel_DummyPersistenceService.class, "Hotel_DummyPersistenceService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotel_DummyPersistenceService_Order(), this.getHotel_Order(), null, "order", null, 0, -1, Hotel_DummyPersistenceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_DummyPersistenceService_Room(), this.getHotel_Room(), null, "room", null, 0, -1, Hotel_DummyPersistenceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_DummyPersistenceService_Occupancy(), this.getHotel_Occupancy(), null, "occupancy", null, 0, -1, Hotel_DummyPersistenceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HotelPackageImpl
