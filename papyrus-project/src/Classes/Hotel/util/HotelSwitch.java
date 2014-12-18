/**
 */
package Classes.Hotel.util;

import Classes.Hotel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Classes.Hotel.HotelPackage
 * @generated
 */
public class HotelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelSwitch() {
		if (modelPackage == null) {
			modelPackage = HotelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HotelPackage.HOTEL: {
				Hotel hotel = (Hotel)theEObject;
				T result = caseHotel(hotel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_ROOM: {
				Hotel_Room hotel_Room = (Hotel_Room)theEObject;
				T result = caseHotel_Room(hotel_Room);
				if (result == null) result = caseIRoom(hotel_Room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.IROOM: {
				IRoom iRoom = (IRoom)theEObject;
				T result = caseIRoom(iRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_OCCUPANCY: {
				Hotel_Occupancy hotel_Occupancy = (Hotel_Occupancy)theEObject;
				T result = caseHotel_Occupancy(hotel_Occupancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_STAY: {
				Hotel_Stay hotel_Stay = (Hotel_Stay)theEObject;
				T result = caseHotel_Stay(hotel_Stay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_BOOKING: {
				Hotel_Booking hotel_Booking = (Hotel_Booking)theEObject;
				T result = caseHotel_Booking(hotel_Booking);
				if (result == null) result = caseIBooking(hotel_Booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.IBOOKING: {
				IBooking iBooking = (IBooking)theEObject;
				T result = caseIBooking(iBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_ORDER: {
				Hotel_Order hotel_Order = (Hotel_Order)theEObject;
				T result = caseHotel_Order(hotel_Order);
				if (result == null) result = caseIOrder(hotel_Order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.IORDER: {
				IOrder iOrder = (IOrder)theEObject;
				T result = caseIOrder(iOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_BOOKING_SUGGESTION: {
				Hotel_BookingSuggestion hotel_BookingSuggestion = (Hotel_BookingSuggestion)theEObject;
				T result = caseHotel_BookingSuggestion(hotel_BookingSuggestion);
				if (result == null) result = caseIBookingSuggestion(hotel_BookingSuggestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.IBOOKING_SUGGESTION: {
				IBookingSuggestion iBookingSuggestion = (IBookingSuggestion)theEObject;
				T result = caseIBookingSuggestion(iBookingSuggestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_SEARCH_RESULT: {
				Hotel_SearchResult hotel_SearchResult = (Hotel_SearchResult)theEObject;
				T result = caseHotel_SearchResult(hotel_SearchResult);
				if (result == null) result = caseISearchResult(hotel_SearchResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.ISEARCH_RESULT: {
				ISearchResult iSearchResult = (ISearchResult)theEObject;
				T result = caseISearchResult(iSearchResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_HOTEL: {
				Hotel_Hotel hotel_Hotel = (Hotel_Hotel)theEObject;
				T result = caseHotel_Hotel(hotel_Hotel);
				if (result == null) result = caseIFrontDesk(hotel_Hotel);
				if (result == null) result = caseISearch(hotel_Hotel);
				if (result == null) result = caseIOrdering(hotel_Hotel);
				if (result == null) result = caseIConfiguration(hotel_Hotel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.IPERSISTENCE_SERVICE: {
				IPersistenceService iPersistenceService = (IPersistenceService)theEObject;
				T result = caseIPersistenceService(iPersistenceService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.IFRONT_DESK: {
				IFrontDesk iFrontDesk = (IFrontDesk)theEObject;
				T result = caseIFrontDesk(iFrontDesk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.ISEARCH: {
				ISearch iSearch = (ISearch)theEObject;
				T result = caseISearch(iSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.IORDERING: {
				IOrdering iOrdering = (IOrdering)theEObject;
				T result = caseIOrdering(iOrdering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.ORDER_REQUEST: {
				OrderRequest orderRequest = (OrderRequest)theEObject;
				T result = caseOrderRequest(orderRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.BOOKING_REQUEST: {
				BookingRequest bookingRequest = (BookingRequest)theEObject;
				T result = caseBookingRequest(bookingRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.ICONFIGURATION: {
				IConfiguration iConfiguration = (IConfiguration)theEObject;
				T result = caseIConfiguration(iConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelPackage.HOTEL_DUMMY_PERSISTENCE_SERVICE: {
				Hotel_DummyPersistenceService hotel_DummyPersistenceService = (Hotel_DummyPersistenceService)theEObject;
				T result = caseHotel_DummyPersistenceService(hotel_DummyPersistenceService);
				if (result == null) result = caseIPersistenceService(hotel_DummyPersistenceService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel(Hotel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Room(Hotel_Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoom(IRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Occupancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Occupancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Occupancy(Hotel_Occupancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Stay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Stay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Stay(Hotel_Stay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Booking(Hotel_Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBooking(IBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Order(Hotel_Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOrder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOrder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOrder(IOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Booking Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Booking Suggestion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_BookingSuggestion(Hotel_BookingSuggestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking Suggestion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookingSuggestion(IBookingSuggestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Search Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Search Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_SearchResult(Hotel_SearchResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISearch Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISearch Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISearchResult(ISearchResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Hotel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Hotel(Hotel_Hotel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPersistence Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPersistence Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPersistenceService(IPersistenceService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFront Desk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFront Desk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFrontDesk(IFrontDesk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISearch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISearch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISearch(ISearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOrdering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOrdering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOrdering(IOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderRequest(OrderRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingRequest(BookingRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConfiguration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConfiguration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIConfiguration(IConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Dummy Persistence Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Dummy Persistence Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_DummyPersistenceService(Hotel_DummyPersistenceService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HotelSwitch
