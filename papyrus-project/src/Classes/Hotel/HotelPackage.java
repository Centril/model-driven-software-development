/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.Hotel.HotelFactory
 * @model kind="package"
 * @generated
 */
public interface HotelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Hotel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Hotel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Hotel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelPackage eINSTANCE = Classes.Hotel.impl.HotelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.HotelImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel()
	 * @generated
	 */
	int HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Hotel.IRoom <em>IRoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.IRoom
	 * @see Classes.Hotel.impl.HotelPackageImpl#getIRoom()
	 * @generated
	 */
	int IROOM = 2;

	/**
	 * The number of structural features of the '<em>IRoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_ID = 0;

	/**
	 * The operation id for the '<em>Get Num Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_NUM_BEDS = 1;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_PRICE = 2;

	/**
	 * The operation id for the '<em>Set Num Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___SET_NUM_BEDS__INT = 3;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___SET_PRICE__DOUBLE = 4;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_NAME = 5;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___SET_NAME__STRING = 6;

	/**
	 * The operation id for the '<em>Get Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_ROOM_INFO = 7;

	/**
	 * The operation id for the '<em>Set Is Out Of Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___SET_IS_OUT_OF_ORDER__BOOLEAN = 8;

	/**
	 * The operation id for the '<em>Set Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___SET_ROOM_INFO__STRING = 9;

	/**
	 * The operation id for the '<em>Is Out Of Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___IS_OUT_OF_ORDER = 10;

	/**
	 * The number of operations of the '<em>IRoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_RoomImpl <em>Hotel Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_RoomImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Room()
	 * @generated
	 */
	int HOTEL_ROOM = 1;

	/**
	 * The number of structural features of the '<em>Hotel Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM_FEATURE_COUNT = IROOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___GET_ID = IROOM___GET_ID;

	/**
	 * The operation id for the '<em>Get Num Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___GET_NUM_BEDS = IROOM___GET_NUM_BEDS;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___GET_PRICE = IROOM___GET_PRICE;

	/**
	 * The operation id for the '<em>Set Num Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___SET_NUM_BEDS__INT = IROOM___SET_NUM_BEDS__INT;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___SET_PRICE__DOUBLE = IROOM___SET_PRICE__DOUBLE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___GET_NAME = IROOM___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___SET_NAME__STRING = IROOM___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___GET_ROOM_INFO = IROOM___GET_ROOM_INFO;

	/**
	 * The operation id for the '<em>Set Is Out Of Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___SET_IS_OUT_OF_ORDER__BOOLEAN = IROOM___SET_IS_OUT_OF_ORDER__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___SET_ROOM_INFO__STRING = IROOM___SET_ROOM_INFO__STRING;

	/**
	 * The operation id for the '<em>Is Out Of Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___IS_OUT_OF_ORDER = IROOM___IS_OUT_OF_ORDER;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM___SET_ID__INT = IROOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hotel Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM_OPERATION_COUNT = IROOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_OccupancyImpl <em>Hotel Occupancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_OccupancyImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Occupancy()
	 * @generated
	 */
	int HOTEL_OCCUPANCY = 3;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY__ROOM = 0;

	/**
	 * The number of structural features of the '<em>Hotel Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Keys</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY___ADD_KEYS__INT = 0;

	/**
	 * The operation id for the '<em>Remove Keys</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY___REMOVE_KEYS__INT = 1;

	/**
	 * The operation id for the '<em>Get Start Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY___GET_START_TIME = 2;

	/**
	 * The operation id for the '<em>Get End Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY___GET_END_TIME = 3;

	/**
	 * The operation id for the '<em>Set Start Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY___SET_START_TIME__LONG = 4;

	/**
	 * The operation id for the '<em>Set End Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY___SET_END_TIME__LONG = 5;

	/**
	 * The operation id for the '<em>Get Num Keys</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY___GET_NUM_KEYS = 6;

	/**
	 * The number of operations of the '<em>Hotel Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OCCUPANCY_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_StayImpl <em>Hotel Stay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_StayImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Stay()
	 * @generated
	 */
	int HOTEL_STAY = 4;

	/**
	 * The feature id for the '<em><b>Occupancy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAY__OCCUPANCY = 0;

	/**
	 * The number of structural features of the '<em>Hotel Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Current Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAY___GET_CURRENT_OCCUPANCY = 0;

	/**
	 * The operation id for the '<em>Add Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAY___ADD_OCCUPANCY__HOTEL_OCCUPANCY = 1;

	/**
	 * The number of operations of the '<em>Hotel Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Classes.Hotel.IBooking <em>IBooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.IBooking
	 * @see Classes.Hotel.impl.HotelPackageImpl#getIBooking()
	 * @generated
	 */
	int IBOOKING = 6;

	/**
	 * The number of structural features of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Contact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_CONTACT = 0;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_PRICE = 1;

	/**
	 * The operation id for the '<em>Get Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_GUESTS = 2;

	/**
	 * The operation id for the '<em>Get Check In Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_CHECK_IN_DATE = 3;

	/**
	 * The operation id for the '<em>Get Check Out Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_CHECK_OUT_DATE = 4;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_CUSTOMER = 5;

	/**
	 * The operation id for the '<em>Is Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___IS_PAID = 6;

	/**
	 * The operation id for the '<em>Set Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___SET_PAID__BOOLEAN = 7;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_ID = 8;

	/**
	 * The operation id for the '<em>Get IRoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_IROOM = 9;

	/**
	 * The operation id for the '<em>Is Checked In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___IS_CHECKED_IN = 10;

	/**
	 * The operation id for the '<em>Is Checked Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___IS_CHECKED_OUT = 11;

	/**
	 * The number of operations of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_BookingImpl <em>Hotel Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_BookingImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Booking()
	 * @generated
	 */
	int HOTEL_BOOKING = 5;

	/**
	 * The feature id for the '<em><b>Stay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__STAY = IBOOKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occupancy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__OCCUPANCY = IBOOKING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hotel Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_FEATURE_COUNT = IBOOKING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Contact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___GET_CONTACT = IBOOKING___GET_CONTACT;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___GET_PRICE = IBOOKING___GET_PRICE;

	/**
	 * The operation id for the '<em>Get Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___GET_GUESTS = IBOOKING___GET_GUESTS;

	/**
	 * The operation id for the '<em>Get Check In Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___GET_CHECK_IN_DATE = IBOOKING___GET_CHECK_IN_DATE;

	/**
	 * The operation id for the '<em>Get Check Out Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___GET_CHECK_OUT_DATE = IBOOKING___GET_CHECK_OUT_DATE;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___GET_CUSTOMER = IBOOKING___GET_CUSTOMER;

	/**
	 * The operation id for the '<em>Is Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___IS_PAID = IBOOKING___IS_PAID;

	/**
	 * The operation id for the '<em>Set Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___SET_PAID__BOOLEAN = IBOOKING___SET_PAID__BOOLEAN;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___GET_ID = IBOOKING___GET_ID;

	/**
	 * The operation id for the '<em>Get IRoom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___GET_IROOM = IBOOKING___GET_IROOM;

	/**
	 * The operation id for the '<em>Is Checked In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___IS_CHECKED_IN = IBOOKING___IS_CHECKED_IN;

	/**
	 * The operation id for the '<em>Is Checked Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___IS_CHECKED_OUT = IBOOKING___IS_CHECKED_OUT;

	/**
	 * The operation id for the '<em>Set ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___SET_ID__INT = IBOOKING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Checked In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___SET_CHECKED_IN__BOOLEAN = IBOOKING_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___SET_CUSTOMER__INT = IBOOKING_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Checked Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING___SET_CHECKED_OUT__BOOLEAN = IBOOKING_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hotel Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_OPERATION_COUNT = IBOOKING_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link Classes.Hotel.IOrder <em>IOrder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.IOrder
	 * @see Classes.Hotel.impl.HotelPackageImpl#getIOrder()
	 * @generated
	 */
	int IORDER = 8;

	/**
	 * The number of structural features of the '<em>IOrder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IORDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IORDER___GET_BOOKINGS = 0;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IORDER___GET_CUSTOMER = 1;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IORDER___GET_ID = 2;

	/**
	 * The number of operations of the '<em>IOrder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IORDER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_OrderImpl <em>Hotel Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_OrderImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Order()
	 * @generated
	 */
	int HOTEL_ORDER = 7;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER__BOOKING = IORDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hotel Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER_FEATURE_COUNT = IORDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER___GET_BOOKINGS = IORDER___GET_BOOKINGS;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER___GET_CUSTOMER = IORDER___GET_CUSTOMER;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER___GET_ID = IORDER___GET_ID;

	/**
	 * The operation id for the '<em>Set ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER___SET_ID__INT = IORDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER___SET_CUSTOMER__INT = IORDER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER___ADD_BOOKING__HOTEL_BOOKING = IORDER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hotel Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ORDER_OPERATION_COUNT = IORDER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link Classes.Hotel.IBookingSuggestion <em>IBooking Suggestion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.IBookingSuggestion
	 * @see Classes.Hotel.impl.HotelPackageImpl#getIBookingSuggestion()
	 * @generated
	 */
	int IBOOKING_SUGGESTION = 10;

	/**
	 * The number of structural features of the '<em>IBooking Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_SUGGESTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_SUGGESTION___GET_PRICE = 0;

	/**
	 * The operation id for the '<em>Get Start Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_SUGGESTION___GET_START_TIME = 1;

	/**
	 * The operation id for the '<em>Get End Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_SUGGESTION___GET_END_TIME = 2;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_SUGGESTION___GET_ROOM = 3;

	/**
	 * The number of operations of the '<em>IBooking Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_SUGGESTION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_BookingSuggestionImpl <em>Hotel Booking Suggestion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_BookingSuggestionImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_BookingSuggestion()
	 * @generated
	 */
	int HOTEL_BOOKING_SUGGESTION = 9;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_SUGGESTION__ROOM = IBOOKING_SUGGESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hotel Booking Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_SUGGESTION_FEATURE_COUNT = IBOOKING_SUGGESTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_SUGGESTION___GET_PRICE = IBOOKING_SUGGESTION___GET_PRICE;

	/**
	 * The operation id for the '<em>Get Start Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_SUGGESTION___GET_START_TIME = IBOOKING_SUGGESTION___GET_START_TIME;

	/**
	 * The operation id for the '<em>Get End Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_SUGGESTION___GET_END_TIME = IBOOKING_SUGGESTION___GET_END_TIME;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_SUGGESTION___GET_ROOM = IBOOKING_SUGGESTION___GET_ROOM;

	/**
	 * The number of operations of the '<em>Hotel Booking Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_SUGGESTION_OPERATION_COUNT = IBOOKING_SUGGESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Hotel.ISearchResult <em>ISearch Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.ISearchResult
	 * @see Classes.Hotel.impl.HotelPackageImpl#getISearchResult()
	 * @generated
	 */
	int ISEARCH_RESULT = 12;

	/**
	 * The number of structural features of the '<em>ISearch Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEARCH_RESULT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Booking Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEARCH_RESULT___GET_BOOKING_SUGGESTIONS = 0;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEARCH_RESULT___GET_PRICE = 1;

	/**
	 * The number of operations of the '<em>ISearch Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEARCH_RESULT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_SearchResultImpl <em>Hotel Search Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_SearchResultImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_SearchResult()
	 * @generated
	 */
	int HOTEL_SEARCH_RESULT = 11;

	/**
	 * The feature id for the '<em><b>Booking Suggestion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_SEARCH_RESULT__BOOKING_SUGGESTION = ISEARCH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hotel Search Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_SEARCH_RESULT_FEATURE_COUNT = ISEARCH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Booking Suggestions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_SEARCH_RESULT___GET_BOOKING_SUGGESTIONS = ISEARCH_RESULT___GET_BOOKING_SUGGESTIONS;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_SEARCH_RESULT___GET_PRICE = ISEARCH_RESULT___GET_PRICE;

	/**
	 * The operation id for the '<em>Add Booking Suggestion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_SEARCH_RESULT___ADD_BOOKING_SUGGESTION__HOTEL_BOOKINGSUGGESTION = ISEARCH_RESULT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hotel Search Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_SEARCH_RESULT_OPERATION_COUNT = ISEARCH_RESULT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Classes.Hotel.IFrontDesk <em>IFront Desk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.IFrontDesk
	 * @see Classes.Hotel.impl.HotelPackageImpl#getIFrontDesk()
	 * @generated
	 */
	int IFRONT_DESK = 15;

	/**
	 * The number of structural features of the '<em>IFront Desk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK___CHECK_IN__INT_INT = 0;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK___GET_BILL__INT = 1;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK___GET_BOOKINGS = 2;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK___PAY__INT = 3;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK___CHECK_OUT__INT = 4;

	/**
	 * The operation id for the '<em>Get Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK___GET_ORDERS = 5;

	/**
	 * The operation id for the '<em>Get Relevant Check In Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK___GET_RELEVANT_CHECK_IN_BOOKINGS__INT = 6;

	/**
	 * The operation id for the '<em>Hand In Keys</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK___HAND_IN_KEYS__INT_INT = 7;

	/**
	 * The number of operations of the '<em>IFront Desk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRONT_DESK_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_HotelImpl <em>Hotel Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_HotelImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Hotel()
	 * @generated
	 */
	int HOTEL_HOTEL = 13;

	/**
	 * The feature id for the '<em><b>Person Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL__PERSON_REGISTRY = IFRONT_DESK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL__PERSISTENCE_SERVICE = IFRONT_DESK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hotel Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL_FEATURE_COUNT = IFRONT_DESK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___CHECK_IN__INT_INT = IFRONT_DESK___CHECK_IN__INT_INT;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___GET_BILL__INT = IFRONT_DESK___GET_BILL__INT;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___GET_BOOKINGS = IFRONT_DESK___GET_BOOKINGS;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___PAY__INT = IFRONT_DESK___PAY__INT;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___CHECK_OUT__INT = IFRONT_DESK___CHECK_OUT__INT;

	/**
	 * The operation id for the '<em>Get Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___GET_ORDERS = IFRONT_DESK___GET_ORDERS;

	/**
	 * The operation id for the '<em>Get Relevant Check In Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___GET_RELEVANT_CHECK_IN_BOOKINGS__INT = IFRONT_DESK___GET_RELEVANT_CHECK_IN_BOOKINGS__INT;

	/**
	 * The operation id for the '<em>Hand In Keys</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___HAND_IN_KEYS__INT_INT = IFRONT_DESK___HAND_IN_KEYS__INT_INT;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___SEARCH__LONG_LONG_INT = IFRONT_DESK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Place Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___PLACE_ORDER__ORDERREQUEST = IFRONT_DESK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___CREATE_ROOM__INT_DOUBLE = IFRONT_DESK_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___GET_ROOMS = IFRONT_DESK_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Delete Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___DELETE_ROOM__INT = IFRONT_DESK_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Legal Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___SET_LEGAL_AGE__INT = IFRONT_DESK_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Legal Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL___GET_LEGAL_AGE = IFRONT_DESK_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Hotel Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_HOTEL_OPERATION_COUNT = IFRONT_DESK_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link Classes.Hotel.IPersistenceService <em>IPersistence Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.IPersistenceService
	 * @see Classes.Hotel.impl.HotelPackageImpl#getIPersistenceService()
	 * @generated
	 */
	int IPERSISTENCE_SERVICE = 14;

	/**
	 * The number of structural features of the '<em>IPersistence Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Occupancies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___GET_OCCUPANCIES = 0;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___GET_ROOMS = 1;

	/**
	 * The operation id for the '<em>Get Room By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___GET_ROOM_BY_ID__INT = 2;

	/**
	 * The operation id for the '<em>Get Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___GET_ORDERS = 3;

	/**
	 * The operation id for the '<em>Add Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___ADD_ORDER__HOTEL_ORDER = 4;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___ADD_ROOM__HOTEL_ROOM = 5;

	/**
	 * The operation id for the '<em>Get Order By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___GET_ORDER_BY_ID__INT = 6;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___GET_BOOKINGS = 7;

	/**
	 * The operation id for the '<em>Get Booking By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE___GET_BOOKING_BY_ID__INT = 8;

	/**
	 * The number of operations of the '<em>IPersistence Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSISTENCE_SERVICE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link Classes.Hotel.ISearch <em>ISearch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.ISearch
	 * @see Classes.Hotel.impl.HotelPackageImpl#getISearch()
	 * @generated
	 */
	int ISEARCH = 16;

	/**
	 * The number of structural features of the '<em>ISearch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEARCH_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEARCH___SEARCH__LONG_LONG_INT = 0;

	/**
	 * The number of operations of the '<em>ISearch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEARCH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.Hotel.IOrdering <em>IOrdering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.IOrdering
	 * @see Classes.Hotel.impl.HotelPackageImpl#getIOrdering()
	 * @generated
	 */
	int IORDERING = 17;

	/**
	 * The number of structural features of the '<em>IOrdering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IORDERING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Place Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IORDERING___PLACE_ORDER__ORDERREQUEST = 0;

	/**
	 * The number of operations of the '<em>IOrdering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IORDERING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.Hotel.OrderRequest <em>Order Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.OrderRequest
	 * @see Classes.Hotel.impl.HotelPackageImpl#getOrderRequest()
	 * @generated
	 */
	int ORDER_REQUEST = 18;

	/**
	 * The number of structural features of the '<em>Order Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUEST___GET_CUSTOMER = 0;

	/**
	 * The operation id for the '<em>Get Booking Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUEST___GET_BOOKING_REQUESTS = 1;

	/**
	 * The number of operations of the '<em>Order Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUEST_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Classes.Hotel.BookingRequest <em>Booking Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.BookingRequest
	 * @see Classes.Hotel.impl.HotelPackageImpl#getBookingRequest()
	 * @generated
	 */
	int BOOKING_REQUEST = 19;

	/**
	 * The number of structural features of the '<em>Booking Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Booking Suggestion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REQUEST___GET_BOOKING_SUGGESTION = 0;

	/**
	 * The operation id for the '<em>Get Contact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REQUEST___GET_CONTACT = 1;

	/**
	 * The operation id for the '<em>Get Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REQUEST___GET_GUESTS = 2;

	/**
	 * The number of operations of the '<em>Booking Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REQUEST_OPERATION_COUNT = 3;


	/**
	 * The meta object id for the '{@link Classes.Hotel.IConfiguration <em>IConfiguration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.IConfiguration
	 * @see Classes.Hotel.impl.HotelPackageImpl#getIConfiguration()
	 * @generated
	 */
	int ICONFIGURATION = 20;

	/**
	 * The number of structural features of the '<em>IConfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONFIGURATION___CREATE_ROOM__INT_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONFIGURATION___GET_ROOMS = 1;

	/**
	 * The operation id for the '<em>Delete Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONFIGURATION___DELETE_ROOM__INT = 2;

	/**
	 * The operation id for the '<em>Set Legal Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONFIGURATION___SET_LEGAL_AGE__INT = 3;

	/**
	 * The operation id for the '<em>Get Legal Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONFIGURATION___GET_LEGAL_AGE = 4;

	/**
	 * The number of operations of the '<em>IConfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONFIGURATION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl <em>Hotel Dummy Persistence Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl
	 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_DummyPersistenceService()
	 * @generated
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDERS = IPERSISTENCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOMS = IPERSISTENCE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occupancies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCIES = IPERSISTENCE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hotel Dummy Persistence Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE_FEATURE_COUNT = IPERSISTENCE_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Occupancies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_OCCUPANCIES = IPERSISTENCE_SERVICE___GET_OCCUPANCIES;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ROOMS = IPERSISTENCE_SERVICE___GET_ROOMS;

	/**
	 * The operation id for the '<em>Get Room By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ROOM_BY_ID__INT = IPERSISTENCE_SERVICE___GET_ROOM_BY_ID__INT;

	/**
	 * The operation id for the '<em>Get Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ORDERS = IPERSISTENCE_SERVICE___GET_ORDERS;

	/**
	 * The operation id for the '<em>Add Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___ADD_ORDER__HOTEL_ORDER = IPERSISTENCE_SERVICE___ADD_ORDER__HOTEL_ORDER;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___ADD_ROOM__HOTEL_ROOM = IPERSISTENCE_SERVICE___ADD_ROOM__HOTEL_ROOM;

	/**
	 * The operation id for the '<em>Get Order By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_ORDER_BY_ID__INT = IPERSISTENCE_SERVICE___GET_ORDER_BY_ID__INT;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_BOOKINGS = IPERSISTENCE_SERVICE___GET_BOOKINGS;

	/**
	 * The operation id for the '<em>Get Booking By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE___GET_BOOKING_BY_ID__INT = IPERSISTENCE_SERVICE___GET_BOOKING_BY_ID__INT;

	/**
	 * The number of operations of the '<em>Hotel Dummy Persistence Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_DUMMY_PERSISTENCE_SERVICE_OPERATION_COUNT = IPERSISTENCE_SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see Classes.Hotel.Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_Room <em>Hotel Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Room</em>'.
	 * @see Classes.Hotel.Hotel_Room
	 * @generated
	 */
	EClass getHotel_Room();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Room#setId(int) <em>Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Id</em>' operation.
	 * @see Classes.Hotel.Hotel_Room#setId(int)
	 * @generated
	 */
	EOperation getHotel_Room__SetId__int();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.IRoom <em>IRoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom</em>'.
	 * @see Classes.Hotel.IRoom
	 * @generated
	 */
	EClass getIRoom();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see Classes.Hotel.IRoom#getId()
	 * @generated
	 */
	EOperation getIRoom__GetId();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#getNumBeds() <em>Get Num Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num Beds</em>' operation.
	 * @see Classes.Hotel.IRoom#getNumBeds()
	 * @generated
	 */
	EOperation getIRoom__GetNumBeds();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see Classes.Hotel.IRoom#getPrice()
	 * @generated
	 */
	EOperation getIRoom__GetPrice();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#setNumBeds(int) <em>Set Num Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Num Beds</em>' operation.
	 * @see Classes.Hotel.IRoom#setNumBeds(int)
	 * @generated
	 */
	EOperation getIRoom__SetNumBeds__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#setPrice(double) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see Classes.Hotel.IRoom#setPrice(double)
	 * @generated
	 */
	EOperation getIRoom__SetPrice__double();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see Classes.Hotel.IRoom#getName()
	 * @generated
	 */
	EOperation getIRoom__GetName();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see Classes.Hotel.IRoom#setName(java.lang.String)
	 * @generated
	 */
	EOperation getIRoom__SetName__String();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#getRoomInfo() <em>Get Room Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Info</em>' operation.
	 * @see Classes.Hotel.IRoom#getRoomInfo()
	 * @generated
	 */
	EOperation getIRoom__GetRoomInfo();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#setIsOutOfOrder(boolean) <em>Set Is Out Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Out Of Order</em>' operation.
	 * @see Classes.Hotel.IRoom#setIsOutOfOrder(boolean)
	 * @generated
	 */
	EOperation getIRoom__SetIsOutOfOrder__boolean();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#setRoomInfo(java.lang.String) <em>Set Room Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Room Info</em>' operation.
	 * @see Classes.Hotel.IRoom#setRoomInfo(java.lang.String)
	 * @generated
	 */
	EOperation getIRoom__SetRoomInfo__String();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IRoom#isOutOfOrder() <em>Is Out Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Out Of Order</em>' operation.
	 * @see Classes.Hotel.IRoom#isOutOfOrder()
	 * @generated
	 */
	EOperation getIRoom__IsOutOfOrder();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_Occupancy <em>Hotel Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Occupancy</em>'.
	 * @see Classes.Hotel.Hotel_Occupancy
	 * @generated
	 */
	EClass getHotel_Occupancy();

	/**
	 * Returns the meta object for the reference '{@link Classes.Hotel.Hotel_Occupancy#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Classes.Hotel.Hotel_Occupancy#getRoom()
	 * @see #getHotel_Occupancy()
	 * @generated
	 */
	EReference getHotel_Occupancy_Room();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Occupancy#addKeys(int) <em>Add Keys</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Keys</em>' operation.
	 * @see Classes.Hotel.Hotel_Occupancy#addKeys(int)
	 * @generated
	 */
	EOperation getHotel_Occupancy__AddKeys__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Occupancy#removeKeys(int) <em>Remove Keys</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Keys</em>' operation.
	 * @see Classes.Hotel.Hotel_Occupancy#removeKeys(int)
	 * @generated
	 */
	EOperation getHotel_Occupancy__RemoveKeys__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Occupancy#getStartTime() <em>Get Start Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Time</em>' operation.
	 * @see Classes.Hotel.Hotel_Occupancy#getStartTime()
	 * @generated
	 */
	EOperation getHotel_Occupancy__GetStartTime();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Occupancy#getEndTime() <em>Get End Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Time</em>' operation.
	 * @see Classes.Hotel.Hotel_Occupancy#getEndTime()
	 * @generated
	 */
	EOperation getHotel_Occupancy__GetEndTime();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Occupancy#setStartTime(long) <em>Set Start Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Start Time</em>' operation.
	 * @see Classes.Hotel.Hotel_Occupancy#setStartTime(long)
	 * @generated
	 */
	EOperation getHotel_Occupancy__SetStartTime__long();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Occupancy#setEndTime(long) <em>Set End Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set End Time</em>' operation.
	 * @see Classes.Hotel.Hotel_Occupancy#setEndTime(long)
	 * @generated
	 */
	EOperation getHotel_Occupancy__SetEndTime__long();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Occupancy#getNumKeys() <em>Get Num Keys</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num Keys</em>' operation.
	 * @see Classes.Hotel.Hotel_Occupancy#getNumKeys()
	 * @generated
	 */
	EOperation getHotel_Occupancy__GetNumKeys();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_Stay <em>Hotel Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Stay</em>'.
	 * @see Classes.Hotel.Hotel_Stay
	 * @generated
	 */
	EClass getHotel_Stay();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Hotel.Hotel_Stay#getOccupancy <em>Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupancy</em>'.
	 * @see Classes.Hotel.Hotel_Stay#getOccupancy()
	 * @see #getHotel_Stay()
	 * @generated
	 */
	EReference getHotel_Stay_Occupancy();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Stay#getCurrentOccupancy() <em>Get Current Occupancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Occupancy</em>' operation.
	 * @see Classes.Hotel.Hotel_Stay#getCurrentOccupancy()
	 * @generated
	 */
	EOperation getHotel_Stay__GetCurrentOccupancy();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Stay#addOccupancy(Classes.Hotel.Hotel_Occupancy) <em>Add Occupancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Occupancy</em>' operation.
	 * @see Classes.Hotel.Hotel_Stay#addOccupancy(Classes.Hotel.Hotel_Occupancy)
	 * @generated
	 */
	EOperation getHotel_Stay__AddOccupancy__Hotel_Occupancy();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_Booking <em>Hotel Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Booking</em>'.
	 * @see Classes.Hotel.Hotel_Booking
	 * @generated
	 */
	EClass getHotel_Booking();

	/**
	 * Returns the meta object for the reference '{@link Classes.Hotel.Hotel_Booking#getStay <em>Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stay</em>'.
	 * @see Classes.Hotel.Hotel_Booking#getStay()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EReference getHotel_Booking_Stay();

	/**
	 * Returns the meta object for the reference '{@link Classes.Hotel.Hotel_Booking#getOccupancy <em>Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Occupancy</em>'.
	 * @see Classes.Hotel.Hotel_Booking#getOccupancy()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EReference getHotel_Booking_Occupancy();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Booking#setID(int) <em>Set ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set ID</em>' operation.
	 * @see Classes.Hotel.Hotel_Booking#setID(int)
	 * @generated
	 */
	EOperation getHotel_Booking__SetID__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Booking#setCheckedIn(boolean) <em>Set Checked In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Checked In</em>' operation.
	 * @see Classes.Hotel.Hotel_Booking#setCheckedIn(boolean)
	 * @generated
	 */
	EOperation getHotel_Booking__SetCheckedIn__boolean();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Booking#setCustomer(int) <em>Set Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Customer</em>' operation.
	 * @see Classes.Hotel.Hotel_Booking#setCustomer(int)
	 * @generated
	 */
	EOperation getHotel_Booking__SetCustomer__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Booking#setCheckedOut(boolean) <em>Set Checked Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Checked Out</em>' operation.
	 * @see Classes.Hotel.Hotel_Booking#setCheckedOut(boolean)
	 * @generated
	 */
	EOperation getHotel_Booking__SetCheckedOut__boolean();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking</em>'.
	 * @see Classes.Hotel.IBooking
	 * @generated
	 */
	EClass getIBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#getContact() <em>Get Contact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contact</em>' operation.
	 * @see Classes.Hotel.IBooking#getContact()
	 * @generated
	 */
	EOperation getIBooking__GetContact();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see Classes.Hotel.IBooking#getPrice()
	 * @generated
	 */
	EOperation getIBooking__GetPrice();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#getGuests() <em>Get Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guests</em>' operation.
	 * @see Classes.Hotel.IBooking#getGuests()
	 * @generated
	 */
	EOperation getIBooking__GetGuests();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#getCheckInDate() <em>Get Check In Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Check In Date</em>' operation.
	 * @see Classes.Hotel.IBooking#getCheckInDate()
	 * @generated
	 */
	EOperation getIBooking__GetCheckInDate();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#getCheckOutDate() <em>Get Check Out Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Check Out Date</em>' operation.
	 * @see Classes.Hotel.IBooking#getCheckOutDate()
	 * @generated
	 */
	EOperation getIBooking__GetCheckOutDate();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#getCustomer() <em>Get Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer</em>' operation.
	 * @see Classes.Hotel.IBooking#getCustomer()
	 * @generated
	 */
	EOperation getIBooking__GetCustomer();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#isPaid() <em>Is Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Paid</em>' operation.
	 * @see Classes.Hotel.IBooking#isPaid()
	 * @generated
	 */
	EOperation getIBooking__IsPaid();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#setPaid(boolean) <em>Set Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Paid</em>' operation.
	 * @see Classes.Hotel.IBooking#setPaid(boolean)
	 * @generated
	 */
	EOperation getIBooking__SetPaid__boolean();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see Classes.Hotel.IBooking#getID()
	 * @generated
	 */
	EOperation getIBooking__GetID();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#getIRoom() <em>Get IRoom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get IRoom</em>' operation.
	 * @see Classes.Hotel.IBooking#getIRoom()
	 * @generated
	 */
	EOperation getIBooking__GetIRoom();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#isCheckedIn() <em>Is Checked In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Checked In</em>' operation.
	 * @see Classes.Hotel.IBooking#isCheckedIn()
	 * @generated
	 */
	EOperation getIBooking__IsCheckedIn();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBooking#isCheckedOut() <em>Is Checked Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Checked Out</em>' operation.
	 * @see Classes.Hotel.IBooking#isCheckedOut()
	 * @generated
	 */
	EOperation getIBooking__IsCheckedOut();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_Order <em>Hotel Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Order</em>'.
	 * @see Classes.Hotel.Hotel_Order
	 * @generated
	 */
	EClass getHotel_Order();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Hotel.Hotel_Order#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking</em>'.
	 * @see Classes.Hotel.Hotel_Order#getBooking()
	 * @see #getHotel_Order()
	 * @generated
	 */
	EReference getHotel_Order_Booking();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Order#setID(int) <em>Set ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set ID</em>' operation.
	 * @see Classes.Hotel.Hotel_Order#setID(int)
	 * @generated
	 */
	EOperation getHotel_Order__SetID__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Order#setCustomer(int) <em>Set Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Customer</em>' operation.
	 * @see Classes.Hotel.Hotel_Order#setCustomer(int)
	 * @generated
	 */
	EOperation getHotel_Order__SetCustomer__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_Order#addBooking(Classes.Hotel.Hotel_Booking) <em>Add Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booking</em>' operation.
	 * @see Classes.Hotel.Hotel_Order#addBooking(Classes.Hotel.Hotel_Booking)
	 * @generated
	 */
	EOperation getHotel_Order__AddBooking__Hotel_Booking();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.IOrder <em>IOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOrder</em>'.
	 * @see Classes.Hotel.IOrder
	 * @generated
	 */
	EClass getIOrder();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IOrder#getBookings() <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see Classes.Hotel.IOrder#getBookings()
	 * @generated
	 */
	EOperation getIOrder__GetBookings();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IOrder#getCustomer() <em>Get Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer</em>' operation.
	 * @see Classes.Hotel.IOrder#getCustomer()
	 * @generated
	 */
	EOperation getIOrder__GetCustomer();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IOrder#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see Classes.Hotel.IOrder#getID()
	 * @generated
	 */
	EOperation getIOrder__GetID();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_BookingSuggestion <em>Hotel Booking Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Booking Suggestion</em>'.
	 * @see Classes.Hotel.Hotel_BookingSuggestion
	 * @generated
	 */
	EClass getHotel_BookingSuggestion();

	/**
	 * Returns the meta object for the reference '{@link Classes.Hotel.Hotel_BookingSuggestion#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Classes.Hotel.Hotel_BookingSuggestion#getRoom()
	 * @see #getHotel_BookingSuggestion()
	 * @generated
	 */
	EReference getHotel_BookingSuggestion_Room();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.IBookingSuggestion <em>IBooking Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Suggestion</em>'.
	 * @see Classes.Hotel.IBookingSuggestion
	 * @generated
	 */
	EClass getIBookingSuggestion();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBookingSuggestion#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see Classes.Hotel.IBookingSuggestion#getPrice()
	 * @generated
	 */
	EOperation getIBookingSuggestion__GetPrice();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBookingSuggestion#getStartTime() <em>Get Start Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Time</em>' operation.
	 * @see Classes.Hotel.IBookingSuggestion#getStartTime()
	 * @generated
	 */
	EOperation getIBookingSuggestion__GetStartTime();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBookingSuggestion#getEndTime() <em>Get End Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Time</em>' operation.
	 * @see Classes.Hotel.IBookingSuggestion#getEndTime()
	 * @generated
	 */
	EOperation getIBookingSuggestion__GetEndTime();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IBookingSuggestion#getRoom() <em>Get Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room</em>' operation.
	 * @see Classes.Hotel.IBookingSuggestion#getRoom()
	 * @generated
	 */
	EOperation getIBookingSuggestion__GetRoom();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_SearchResult <em>Hotel Search Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Search Result</em>'.
	 * @see Classes.Hotel.Hotel_SearchResult
	 * @generated
	 */
	EClass getHotel_SearchResult();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Hotel.Hotel_SearchResult#getBookingSuggestion <em>Booking Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking Suggestion</em>'.
	 * @see Classes.Hotel.Hotel_SearchResult#getBookingSuggestion()
	 * @see #getHotel_SearchResult()
	 * @generated
	 */
	EReference getHotel_SearchResult_BookingSuggestion();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.Hotel_SearchResult#addBookingSuggestion(Classes.Hotel.Hotel_BookingSuggestion) <em>Add Booking Suggestion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booking Suggestion</em>' operation.
	 * @see Classes.Hotel.Hotel_SearchResult#addBookingSuggestion(Classes.Hotel.Hotel_BookingSuggestion)
	 * @generated
	 */
	EOperation getHotel_SearchResult__AddBookingSuggestion__Hotel_BookingSuggestion();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.ISearchResult <em>ISearch Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISearch Result</em>'.
	 * @see Classes.Hotel.ISearchResult
	 * @generated
	 */
	EClass getISearchResult();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.ISearchResult#getBookingSuggestions() <em>Get Booking Suggestions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Suggestions</em>' operation.
	 * @see Classes.Hotel.ISearchResult#getBookingSuggestions()
	 * @generated
	 */
	EOperation getISearchResult__GetBookingSuggestions();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.ISearchResult#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see Classes.Hotel.ISearchResult#getPrice()
	 * @generated
	 */
	EOperation getISearchResult__GetPrice();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_Hotel <em>Hotel Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Hotel</em>'.
	 * @see Classes.Hotel.Hotel_Hotel
	 * @generated
	 */
	EClass getHotel_Hotel();

	/**
	 * Returns the meta object for the reference '{@link Classes.Hotel.Hotel_Hotel#getPersonRegistry <em>Person Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person Registry</em>'.
	 * @see Classes.Hotel.Hotel_Hotel#getPersonRegistry()
	 * @see #getHotel_Hotel()
	 * @generated
	 */
	EReference getHotel_Hotel_PersonRegistry();

	/**
	 * Returns the meta object for the reference '{@link Classes.Hotel.Hotel_Hotel#getPersistenceService <em>Persistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persistence Service</em>'.
	 * @see Classes.Hotel.Hotel_Hotel#getPersistenceService()
	 * @see #getHotel_Hotel()
	 * @generated
	 */
	EReference getHotel_Hotel_PersistenceService();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.IPersistenceService <em>IPersistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPersistence Service</em>'.
	 * @see Classes.Hotel.IPersistenceService
	 * @generated
	 */
	EClass getIPersistenceService();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#getOccupancies() <em>Get Occupancies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Occupancies</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#getOccupancies()
	 * @generated
	 */
	EOperation getIPersistenceService__GetOccupancies();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#getRooms() <em>Get Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#getRooms()
	 * @generated
	 */
	EOperation getIPersistenceService__GetRooms();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#getRoomById(int) <em>Get Room By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room By Id</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#getRoomById(int)
	 * @generated
	 */
	EOperation getIPersistenceService__GetRoomById__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#getOrders() <em>Get Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Orders</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#getOrders()
	 * @generated
	 */
	EOperation getIPersistenceService__GetOrders();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#addOrder(Classes.Hotel.Hotel_Order) <em>Add Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Order</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#addOrder(Classes.Hotel.Hotel_Order)
	 * @generated
	 */
	EOperation getIPersistenceService__AddOrder__Hotel_Order();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#addRoom(Classes.Hotel.Hotel_Room) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#addRoom(Classes.Hotel.Hotel_Room)
	 * @generated
	 */
	EOperation getIPersistenceService__AddRoom__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#getOrderById(int) <em>Get Order By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Order By Id</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#getOrderById(int)
	 * @generated
	 */
	EOperation getIPersistenceService__GetOrderById__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#getBookings() <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#getBookings()
	 * @generated
	 */
	EOperation getIPersistenceService__GetBookings();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IPersistenceService#getBookingById(int) <em>Get Booking By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking By Id</em>' operation.
	 * @see Classes.Hotel.IPersistenceService#getBookingById(int)
	 * @generated
	 */
	EOperation getIPersistenceService__GetBookingById__int();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.IFrontDesk <em>IFront Desk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFront Desk</em>'.
	 * @see Classes.Hotel.IFrontDesk
	 * @generated
	 */
	EClass getIFrontDesk();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IFrontDesk#checkIn(int, int) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see Classes.Hotel.IFrontDesk#checkIn(int, int)
	 * @generated
	 */
	EOperation getIFrontDesk__CheckIn__int_int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IFrontDesk#getBill(int) <em>Get Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill</em>' operation.
	 * @see Classes.Hotel.IFrontDesk#getBill(int)
	 * @generated
	 */
	EOperation getIFrontDesk__GetBill__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IFrontDesk#getBookings() <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see Classes.Hotel.IFrontDesk#getBookings()
	 * @generated
	 */
	EOperation getIFrontDesk__GetBookings();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IFrontDesk#pay(int) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see Classes.Hotel.IFrontDesk#pay(int)
	 * @generated
	 */
	EOperation getIFrontDesk__Pay__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IFrontDesk#checkOut(int) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see Classes.Hotel.IFrontDesk#checkOut(int)
	 * @generated
	 */
	EOperation getIFrontDesk__CheckOut__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IFrontDesk#getOrders() <em>Get Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Orders</em>' operation.
	 * @see Classes.Hotel.IFrontDesk#getOrders()
	 * @generated
	 */
	EOperation getIFrontDesk__GetOrders();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IFrontDesk#getRelevantCheckInBookings(int) <em>Get Relevant Check In Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Relevant Check In Bookings</em>' operation.
	 * @see Classes.Hotel.IFrontDesk#getRelevantCheckInBookings(int)
	 * @generated
	 */
	EOperation getIFrontDesk__GetRelevantCheckInBookings__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IFrontDesk#handInKeys(int, int) <em>Hand In Keys</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hand In Keys</em>' operation.
	 * @see Classes.Hotel.IFrontDesk#handInKeys(int, int)
	 * @generated
	 */
	EOperation getIFrontDesk__HandInKeys__int_int();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.ISearch <em>ISearch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISearch</em>'.
	 * @see Classes.Hotel.ISearch
	 * @generated
	 */
	EClass getISearch();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.ISearch#search(long, long, int) <em>Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search</em>' operation.
	 * @see Classes.Hotel.ISearch#search(long, long, int)
	 * @generated
	 */
	EOperation getISearch__Search__long_long_int();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.IOrdering <em>IOrdering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOrdering</em>'.
	 * @see Classes.Hotel.IOrdering
	 * @generated
	 */
	EClass getIOrdering();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IOrdering#placeOrder(Classes.Hotel.OrderRequest) <em>Place Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Place Order</em>' operation.
	 * @see Classes.Hotel.IOrdering#placeOrder(Classes.Hotel.OrderRequest)
	 * @generated
	 */
	EOperation getIOrdering__PlaceOrder__OrderRequest();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.OrderRequest <em>Order Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Request</em>'.
	 * @see Classes.Hotel.OrderRequest
	 * @generated
	 */
	EClass getOrderRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.OrderRequest#getCustomer() <em>Get Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer</em>' operation.
	 * @see Classes.Hotel.OrderRequest#getCustomer()
	 * @generated
	 */
	EOperation getOrderRequest__GetCustomer();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.OrderRequest#getBookingRequests() <em>Get Booking Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Requests</em>' operation.
	 * @see Classes.Hotel.OrderRequest#getBookingRequests()
	 * @generated
	 */
	EOperation getOrderRequest__GetBookingRequests();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.BookingRequest <em>Booking Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Request</em>'.
	 * @see Classes.Hotel.BookingRequest
	 * @generated
	 */
	EClass getBookingRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.BookingRequest#getBookingSuggestion() <em>Get Booking Suggestion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Suggestion</em>' operation.
	 * @see Classes.Hotel.BookingRequest#getBookingSuggestion()
	 * @generated
	 */
	EOperation getBookingRequest__GetBookingSuggestion();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.BookingRequest#getContact() <em>Get Contact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contact</em>' operation.
	 * @see Classes.Hotel.BookingRequest#getContact()
	 * @generated
	 */
	EOperation getBookingRequest__GetContact();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.BookingRequest#getGuests() <em>Get Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guests</em>' operation.
	 * @see Classes.Hotel.BookingRequest#getGuests()
	 * @generated
	 */
	EOperation getBookingRequest__GetGuests();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.IConfiguration <em>IConfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IConfiguration</em>'.
	 * @see Classes.Hotel.IConfiguration
	 * @generated
	 */
	EClass getIConfiguration();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IConfiguration#createRoom(int, double) <em>Create Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room</em>' operation.
	 * @see Classes.Hotel.IConfiguration#createRoom(int, double)
	 * @generated
	 */
	EOperation getIConfiguration__CreateRoom__int_double();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IConfiguration#getRooms() <em>Get Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms</em>' operation.
	 * @see Classes.Hotel.IConfiguration#getRooms()
	 * @generated
	 */
	EOperation getIConfiguration__GetRooms();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IConfiguration#deleteRoom(int) <em>Delete Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Room</em>' operation.
	 * @see Classes.Hotel.IConfiguration#deleteRoom(int)
	 * @generated
	 */
	EOperation getIConfiguration__DeleteRoom__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IConfiguration#setLegalAge(int) <em>Set Legal Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Legal Age</em>' operation.
	 * @see Classes.Hotel.IConfiguration#setLegalAge(int)
	 * @generated
	 */
	EOperation getIConfiguration__SetLegalAge__int();

	/**
	 * Returns the meta object for the '{@link Classes.Hotel.IConfiguration#getLegalAge() <em>Get Legal Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Legal Age</em>' operation.
	 * @see Classes.Hotel.IConfiguration#getLegalAge()
	 * @generated
	 */
	EOperation getIConfiguration__GetLegalAge();

	/**
	 * Returns the meta object for class '{@link Classes.Hotel.Hotel_DummyPersistenceService <em>Hotel Dummy Persistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Dummy Persistence Service</em>'.
	 * @see Classes.Hotel.Hotel_DummyPersistenceService
	 * @generated
	 */
	EClass getHotel_DummyPersistenceService();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Hotel.Hotel_DummyPersistenceService#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orders</em>'.
	 * @see Classes.Hotel.Hotel_DummyPersistenceService#getOrders()
	 * @see #getHotel_DummyPersistenceService()
	 * @generated
	 */
	EReference getHotel_DummyPersistenceService_Orders();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Hotel.Hotel_DummyPersistenceService#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see Classes.Hotel.Hotel_DummyPersistenceService#getRooms()
	 * @see #getHotel_DummyPersistenceService()
	 * @generated
	 */
	EReference getHotel_DummyPersistenceService_Rooms();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Hotel.Hotel_DummyPersistenceService#getOccupancies <em>Occupancies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupancies</em>'.
	 * @see Classes.Hotel.Hotel_DummyPersistenceService#getOccupancies()
	 * @see #getHotel_DummyPersistenceService()
	 * @generated
	 */
	EReference getHotel_DummyPersistenceService_Occupancies();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelFactory getHotelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.HotelImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel()
		 * @generated
		 */
		EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_RoomImpl <em>Hotel Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_RoomImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Room()
		 * @generated
		 */
		EClass HOTEL_ROOM = eINSTANCE.getHotel_Room();

		/**
		 * The meta object literal for the '<em><b>Set Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_ROOM___SET_ID__INT = eINSTANCE.getHotel_Room__SetId__int();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.IRoom <em>IRoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.IRoom
		 * @see Classes.Hotel.impl.HotelPackageImpl#getIRoom()
		 * @generated
		 */
		EClass IROOM = eINSTANCE.getIRoom();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_ID = eINSTANCE.getIRoom__GetId();

		/**
		 * The meta object literal for the '<em><b>Get Num Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_NUM_BEDS = eINSTANCE.getIRoom__GetNumBeds();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_PRICE = eINSTANCE.getIRoom__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Set Num Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___SET_NUM_BEDS__INT = eINSTANCE.getIRoom__SetNumBeds__int();

		/**
		 * The meta object literal for the '<em><b>Set Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___SET_PRICE__DOUBLE = eINSTANCE.getIRoom__SetPrice__double();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_NAME = eINSTANCE.getIRoom__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___SET_NAME__STRING = eINSTANCE.getIRoom__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_ROOM_INFO = eINSTANCE.getIRoom__GetRoomInfo();

		/**
		 * The meta object literal for the '<em><b>Set Is Out Of Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___SET_IS_OUT_OF_ORDER__BOOLEAN = eINSTANCE.getIRoom__SetIsOutOfOrder__boolean();

		/**
		 * The meta object literal for the '<em><b>Set Room Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___SET_ROOM_INFO__STRING = eINSTANCE.getIRoom__SetRoomInfo__String();

		/**
		 * The meta object literal for the '<em><b>Is Out Of Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___IS_OUT_OF_ORDER = eINSTANCE.getIRoom__IsOutOfOrder();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_OccupancyImpl <em>Hotel Occupancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_OccupancyImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Occupancy()
		 * @generated
		 */
		EClass HOTEL_OCCUPANCY = eINSTANCE.getHotel_Occupancy();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_OCCUPANCY__ROOM = eINSTANCE.getHotel_Occupancy_Room();

		/**
		 * The meta object literal for the '<em><b>Add Keys</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_OCCUPANCY___ADD_KEYS__INT = eINSTANCE.getHotel_Occupancy__AddKeys__int();

		/**
		 * The meta object literal for the '<em><b>Remove Keys</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_OCCUPANCY___REMOVE_KEYS__INT = eINSTANCE.getHotel_Occupancy__RemoveKeys__int();

		/**
		 * The meta object literal for the '<em><b>Get Start Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_OCCUPANCY___GET_START_TIME = eINSTANCE.getHotel_Occupancy__GetStartTime();

		/**
		 * The meta object literal for the '<em><b>Get End Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_OCCUPANCY___GET_END_TIME = eINSTANCE.getHotel_Occupancy__GetEndTime();

		/**
		 * The meta object literal for the '<em><b>Set Start Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_OCCUPANCY___SET_START_TIME__LONG = eINSTANCE.getHotel_Occupancy__SetStartTime__long();

		/**
		 * The meta object literal for the '<em><b>Set End Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_OCCUPANCY___SET_END_TIME__LONG = eINSTANCE.getHotel_Occupancy__SetEndTime__long();

		/**
		 * The meta object literal for the '<em><b>Get Num Keys</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_OCCUPANCY___GET_NUM_KEYS = eINSTANCE.getHotel_Occupancy__GetNumKeys();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_StayImpl <em>Hotel Stay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_StayImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Stay()
		 * @generated
		 */
		EClass HOTEL_STAY = eINSTANCE.getHotel_Stay();

		/**
		 * The meta object literal for the '<em><b>Occupancy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_STAY__OCCUPANCY = eINSTANCE.getHotel_Stay_Occupancy();

		/**
		 * The meta object literal for the '<em><b>Get Current Occupancy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_STAY___GET_CURRENT_OCCUPANCY = eINSTANCE.getHotel_Stay__GetCurrentOccupancy();

		/**
		 * The meta object literal for the '<em><b>Add Occupancy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_STAY___ADD_OCCUPANCY__HOTEL_OCCUPANCY = eINSTANCE.getHotel_Stay__AddOccupancy__Hotel_Occupancy();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_BookingImpl <em>Hotel Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_BookingImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Booking()
		 * @generated
		 */
		EClass HOTEL_BOOKING = eINSTANCE.getHotel_Booking();

		/**
		 * The meta object literal for the '<em><b>Stay</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_BOOKING__STAY = eINSTANCE.getHotel_Booking_Stay();

		/**
		 * The meta object literal for the '<em><b>Occupancy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_BOOKING__OCCUPANCY = eINSTANCE.getHotel_Booking_Occupancy();

		/**
		 * The meta object literal for the '<em><b>Set ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_BOOKING___SET_ID__INT = eINSTANCE.getHotel_Booking__SetID__int();

		/**
		 * The meta object literal for the '<em><b>Set Checked In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_BOOKING___SET_CHECKED_IN__BOOLEAN = eINSTANCE.getHotel_Booking__SetCheckedIn__boolean();

		/**
		 * The meta object literal for the '<em><b>Set Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_BOOKING___SET_CUSTOMER__INT = eINSTANCE.getHotel_Booking__SetCustomer__int();

		/**
		 * The meta object literal for the '<em><b>Set Checked Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_BOOKING___SET_CHECKED_OUT__BOOLEAN = eINSTANCE.getHotel_Booking__SetCheckedOut__boolean();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.IBooking <em>IBooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.IBooking
		 * @see Classes.Hotel.impl.HotelPackageImpl#getIBooking()
		 * @generated
		 */
		EClass IBOOKING = eINSTANCE.getIBooking();

		/**
		 * The meta object literal for the '<em><b>Get Contact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_CONTACT = eINSTANCE.getIBooking__GetContact();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_PRICE = eINSTANCE.getIBooking__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Get Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_GUESTS = eINSTANCE.getIBooking__GetGuests();

		/**
		 * The meta object literal for the '<em><b>Get Check In Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_CHECK_IN_DATE = eINSTANCE.getIBooking__GetCheckInDate();

		/**
		 * The meta object literal for the '<em><b>Get Check Out Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_CHECK_OUT_DATE = eINSTANCE.getIBooking__GetCheckOutDate();

		/**
		 * The meta object literal for the '<em><b>Get Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_CUSTOMER = eINSTANCE.getIBooking__GetCustomer();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___IS_PAID = eINSTANCE.getIBooking__IsPaid();

		/**
		 * The meta object literal for the '<em><b>Set Paid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___SET_PAID__BOOLEAN = eINSTANCE.getIBooking__SetPaid__boolean();

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_ID = eINSTANCE.getIBooking__GetID();

		/**
		 * The meta object literal for the '<em><b>Get IRoom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_IROOM = eINSTANCE.getIBooking__GetIRoom();

		/**
		 * The meta object literal for the '<em><b>Is Checked In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___IS_CHECKED_IN = eINSTANCE.getIBooking__IsCheckedIn();

		/**
		 * The meta object literal for the '<em><b>Is Checked Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___IS_CHECKED_OUT = eINSTANCE.getIBooking__IsCheckedOut();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_OrderImpl <em>Hotel Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_OrderImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Order()
		 * @generated
		 */
		EClass HOTEL_ORDER = eINSTANCE.getHotel_Order();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_ORDER__BOOKING = eINSTANCE.getHotel_Order_Booking();

		/**
		 * The meta object literal for the '<em><b>Set ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_ORDER___SET_ID__INT = eINSTANCE.getHotel_Order__SetID__int();

		/**
		 * The meta object literal for the '<em><b>Set Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_ORDER___SET_CUSTOMER__INT = eINSTANCE.getHotel_Order__SetCustomer__int();

		/**
		 * The meta object literal for the '<em><b>Add Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_ORDER___ADD_BOOKING__HOTEL_BOOKING = eINSTANCE.getHotel_Order__AddBooking__Hotel_Booking();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.IOrder <em>IOrder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.IOrder
		 * @see Classes.Hotel.impl.HotelPackageImpl#getIOrder()
		 * @generated
		 */
		EClass IORDER = eINSTANCE.getIOrder();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IORDER___GET_BOOKINGS = eINSTANCE.getIOrder__GetBookings();

		/**
		 * The meta object literal for the '<em><b>Get Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IORDER___GET_CUSTOMER = eINSTANCE.getIOrder__GetCustomer();

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IORDER___GET_ID = eINSTANCE.getIOrder__GetID();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_BookingSuggestionImpl <em>Hotel Booking Suggestion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_BookingSuggestionImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_BookingSuggestion()
		 * @generated
		 */
		EClass HOTEL_BOOKING_SUGGESTION = eINSTANCE.getHotel_BookingSuggestion();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_BOOKING_SUGGESTION__ROOM = eINSTANCE.getHotel_BookingSuggestion_Room();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.IBookingSuggestion <em>IBooking Suggestion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.IBookingSuggestion
		 * @see Classes.Hotel.impl.HotelPackageImpl#getIBookingSuggestion()
		 * @generated
		 */
		EClass IBOOKING_SUGGESTION = eINSTANCE.getIBookingSuggestion();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_SUGGESTION___GET_PRICE = eINSTANCE.getIBookingSuggestion__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Get Start Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_SUGGESTION___GET_START_TIME = eINSTANCE.getIBookingSuggestion__GetStartTime();

		/**
		 * The meta object literal for the '<em><b>Get End Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_SUGGESTION___GET_END_TIME = eINSTANCE.getIBookingSuggestion__GetEndTime();

		/**
		 * The meta object literal for the '<em><b>Get Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_SUGGESTION___GET_ROOM = eINSTANCE.getIBookingSuggestion__GetRoom();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_SearchResultImpl <em>Hotel Search Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_SearchResultImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_SearchResult()
		 * @generated
		 */
		EClass HOTEL_SEARCH_RESULT = eINSTANCE.getHotel_SearchResult();

		/**
		 * The meta object literal for the '<em><b>Booking Suggestion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_SEARCH_RESULT__BOOKING_SUGGESTION = eINSTANCE.getHotel_SearchResult_BookingSuggestion();

		/**
		 * The meta object literal for the '<em><b>Add Booking Suggestion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_SEARCH_RESULT___ADD_BOOKING_SUGGESTION__HOTEL_BOOKINGSUGGESTION = eINSTANCE.getHotel_SearchResult__AddBookingSuggestion__Hotel_BookingSuggestion();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.ISearchResult <em>ISearch Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.ISearchResult
		 * @see Classes.Hotel.impl.HotelPackageImpl#getISearchResult()
		 * @generated
		 */
		EClass ISEARCH_RESULT = eINSTANCE.getISearchResult();

		/**
		 * The meta object literal for the '<em><b>Get Booking Suggestions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISEARCH_RESULT___GET_BOOKING_SUGGESTIONS = eINSTANCE.getISearchResult__GetBookingSuggestions();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISEARCH_RESULT___GET_PRICE = eINSTANCE.getISearchResult__GetPrice();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_HotelImpl <em>Hotel Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_HotelImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_Hotel()
		 * @generated
		 */
		EClass HOTEL_HOTEL = eINSTANCE.getHotel_Hotel();

		/**
		 * The meta object literal for the '<em><b>Person Registry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_HOTEL__PERSON_REGISTRY = eINSTANCE.getHotel_Hotel_PersonRegistry();

		/**
		 * The meta object literal for the '<em><b>Persistence Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_HOTEL__PERSISTENCE_SERVICE = eINSTANCE.getHotel_Hotel_PersistenceService();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.IPersistenceService <em>IPersistence Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.IPersistenceService
		 * @see Classes.Hotel.impl.HotelPackageImpl#getIPersistenceService()
		 * @generated
		 */
		EClass IPERSISTENCE_SERVICE = eINSTANCE.getIPersistenceService();

		/**
		 * The meta object literal for the '<em><b>Get Occupancies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___GET_OCCUPANCIES = eINSTANCE.getIPersistenceService__GetOccupancies();

		/**
		 * The meta object literal for the '<em><b>Get Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___GET_ROOMS = eINSTANCE.getIPersistenceService__GetRooms();

		/**
		 * The meta object literal for the '<em><b>Get Room By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___GET_ROOM_BY_ID__INT = eINSTANCE.getIPersistenceService__GetRoomById__int();

		/**
		 * The meta object literal for the '<em><b>Get Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___GET_ORDERS = eINSTANCE.getIPersistenceService__GetOrders();

		/**
		 * The meta object literal for the '<em><b>Add Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___ADD_ORDER__HOTEL_ORDER = eINSTANCE.getIPersistenceService__AddOrder__Hotel_Order();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___ADD_ROOM__HOTEL_ROOM = eINSTANCE.getIPersistenceService__AddRoom__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Get Order By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___GET_ORDER_BY_ID__INT = eINSTANCE.getIPersistenceService__GetOrderById__int();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___GET_BOOKINGS = eINSTANCE.getIPersistenceService__GetBookings();

		/**
		 * The meta object literal for the '<em><b>Get Booking By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSISTENCE_SERVICE___GET_BOOKING_BY_ID__INT = eINSTANCE.getIPersistenceService__GetBookingById__int();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.IFrontDesk <em>IFront Desk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.IFrontDesk
		 * @see Classes.Hotel.impl.HotelPackageImpl#getIFrontDesk()
		 * @generated
		 */
		EClass IFRONT_DESK = eINSTANCE.getIFrontDesk();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFRONT_DESK___CHECK_IN__INT_INT = eINSTANCE.getIFrontDesk__CheckIn__int_int();

		/**
		 * The meta object literal for the '<em><b>Get Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFRONT_DESK___GET_BILL__INT = eINSTANCE.getIFrontDesk__GetBill__int();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFRONT_DESK___GET_BOOKINGS = eINSTANCE.getIFrontDesk__GetBookings();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFRONT_DESK___PAY__INT = eINSTANCE.getIFrontDesk__Pay__int();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFRONT_DESK___CHECK_OUT__INT = eINSTANCE.getIFrontDesk__CheckOut__int();

		/**
		 * The meta object literal for the '<em><b>Get Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFRONT_DESK___GET_ORDERS = eINSTANCE.getIFrontDesk__GetOrders();

		/**
		 * The meta object literal for the '<em><b>Get Relevant Check In Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFRONT_DESK___GET_RELEVANT_CHECK_IN_BOOKINGS__INT = eINSTANCE.getIFrontDesk__GetRelevantCheckInBookings__int();

		/**
		 * The meta object literal for the '<em><b>Hand In Keys</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFRONT_DESK___HAND_IN_KEYS__INT_INT = eINSTANCE.getIFrontDesk__HandInKeys__int_int();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.ISearch <em>ISearch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.ISearch
		 * @see Classes.Hotel.impl.HotelPackageImpl#getISearch()
		 * @generated
		 */
		EClass ISEARCH = eINSTANCE.getISearch();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISEARCH___SEARCH__LONG_LONG_INT = eINSTANCE.getISearch__Search__long_long_int();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.IOrdering <em>IOrdering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.IOrdering
		 * @see Classes.Hotel.impl.HotelPackageImpl#getIOrdering()
		 * @generated
		 */
		EClass IORDERING = eINSTANCE.getIOrdering();

		/**
		 * The meta object literal for the '<em><b>Place Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IORDERING___PLACE_ORDER__ORDERREQUEST = eINSTANCE.getIOrdering__PlaceOrder__OrderRequest();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.OrderRequest <em>Order Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.OrderRequest
		 * @see Classes.Hotel.impl.HotelPackageImpl#getOrderRequest()
		 * @generated
		 */
		EClass ORDER_REQUEST = eINSTANCE.getOrderRequest();

		/**
		 * The meta object literal for the '<em><b>Get Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER_REQUEST___GET_CUSTOMER = eINSTANCE.getOrderRequest__GetCustomer();

		/**
		 * The meta object literal for the '<em><b>Get Booking Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER_REQUEST___GET_BOOKING_REQUESTS = eINSTANCE.getOrderRequest__GetBookingRequests();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.BookingRequest <em>Booking Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.BookingRequest
		 * @see Classes.Hotel.impl.HotelPackageImpl#getBookingRequest()
		 * @generated
		 */
		EClass BOOKING_REQUEST = eINSTANCE.getBookingRequest();

		/**
		 * The meta object literal for the '<em><b>Get Booking Suggestion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_REQUEST___GET_BOOKING_SUGGESTION = eINSTANCE.getBookingRequest__GetBookingSuggestion();

		/**
		 * The meta object literal for the '<em><b>Get Contact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_REQUEST___GET_CONTACT = eINSTANCE.getBookingRequest__GetContact();

		/**
		 * The meta object literal for the '<em><b>Get Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_REQUEST___GET_GUESTS = eINSTANCE.getBookingRequest__GetGuests();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.IConfiguration <em>IConfiguration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.IConfiguration
		 * @see Classes.Hotel.impl.HotelPackageImpl#getIConfiguration()
		 * @generated
		 */
		EClass ICONFIGURATION = eINSTANCE.getIConfiguration();

		/**
		 * The meta object literal for the '<em><b>Create Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONFIGURATION___CREATE_ROOM__INT_DOUBLE = eINSTANCE.getIConfiguration__CreateRoom__int_double();

		/**
		 * The meta object literal for the '<em><b>Get Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONFIGURATION___GET_ROOMS = eINSTANCE.getIConfiguration__GetRooms();

		/**
		 * The meta object literal for the '<em><b>Delete Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONFIGURATION___DELETE_ROOM__INT = eINSTANCE.getIConfiguration__DeleteRoom__int();

		/**
		 * The meta object literal for the '<em><b>Set Legal Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONFIGURATION___SET_LEGAL_AGE__INT = eINSTANCE.getIConfiguration__SetLegalAge__int();

		/**
		 * The meta object literal for the '<em><b>Get Legal Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONFIGURATION___GET_LEGAL_AGE = eINSTANCE.getIConfiguration__GetLegalAge();

		/**
		 * The meta object literal for the '{@link Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl <em>Hotel Dummy Persistence Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Hotel.impl.Hotel_DummyPersistenceServiceImpl
		 * @see Classes.Hotel.impl.HotelPackageImpl#getHotel_DummyPersistenceService()
		 * @generated
		 */
		EClass HOTEL_DUMMY_PERSISTENCE_SERVICE = eINSTANCE.getHotel_DummyPersistenceService();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_DUMMY_PERSISTENCE_SERVICE__ORDERS = eINSTANCE.getHotel_DummyPersistenceService_Orders();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_DUMMY_PERSISTENCE_SERVICE__ROOMS = eINSTANCE.getHotel_DummyPersistenceService_Rooms();

		/**
		 * The meta object literal for the '<em><b>Occupancies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_DUMMY_PERSISTENCE_SERVICE__OCCUPANCIES = eINSTANCE.getHotel_DummyPersistenceService_Occupancies();

	}

} //HotelPackage
