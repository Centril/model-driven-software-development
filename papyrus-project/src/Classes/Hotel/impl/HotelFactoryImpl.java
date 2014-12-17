/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelFactoryImpl extends EFactoryImpl implements HotelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelFactory init() {
		try {
			HotelFactory theHotelFactory = (HotelFactory)EPackage.Registry.INSTANCE.getEFactory(HotelPackage.eNS_URI);
			if (theHotelFactory != null) {
				return theHotelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HotelPackage.HOTEL: return createHotel();
			case HotelPackage.HOTEL_ROOM: return createHotel_Room();
			case HotelPackage.HOTEL_OCCUPANCY: return createHotel_Occupancy();
			case HotelPackage.HOTEL_STAY: return createHotel_Stay();
			case HotelPackage.HOTEL_BOOKING: return createHotel_Booking();
			case HotelPackage.HOTEL_ORDER: return createHotel_Order();
			case HotelPackage.HOTEL_BOOKING_SUGGESTION: return createHotel_BookingSuggestion();
			case HotelPackage.HOTEL_SEARCH_RESULT: return createHotel_SearchResult();
			case HotelPackage.HOTEL_HOTEL: return createHotel_Hotel();
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE: return createHotel_DummyPersistenceService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel createHotel() {
		HotelImpl hotel = new HotelImpl();
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Room createHotel_Room() {
		Hotel_RoomImpl hotel_Room = new Hotel_RoomImpl();
		return hotel_Room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Occupancy createHotel_Occupancy() {
		Hotel_OccupancyImpl hotel_Occupancy = new Hotel_OccupancyImpl();
		return hotel_Occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Stay createHotel_Stay() {
		Hotel_StayImpl hotel_Stay = new Hotel_StayImpl();
		return hotel_Stay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Booking createHotel_Booking() {
		Hotel_BookingImpl hotel_Booking = new Hotel_BookingImpl();
		return hotel_Booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Order createHotel_Order() {
		Hotel_OrderImpl hotel_Order = new Hotel_OrderImpl();
		return hotel_Order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_BookingSuggestion createHotel_BookingSuggestion() {
		Hotel_BookingSuggestionImpl hotel_BookingSuggestion = new Hotel_BookingSuggestionImpl();
		return hotel_BookingSuggestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_SearchResult createHotel_SearchResult() {
		Hotel_SearchResultImpl hotel_SearchResult = new Hotel_SearchResultImpl();
		return hotel_SearchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Hotel createHotel_Hotel() {
		Hotel_HotelImpl hotel_Hotel = new Hotel_HotelImpl();
		return hotel_Hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_DummyPersistenceService createHotel_DummyPersistenceService() {
		Hotel_DummyPersistenceServiceImpl hotel_DummyPersistenceService = new Hotel_DummyPersistenceServiceImpl();
		return hotel_DummyPersistenceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelPackage getHotelPackage() {
		return (HotelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelPackage getPackage() {
		return HotelPackage.eINSTANCE;
	}

} //HotelFactoryImpl
