/**
 */
package Classes.Hotel.util;

import Classes.Hotel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Hotel.HotelPackage
 * @generated
 */
public class HotelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HotelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelSwitch<Adapter> modelSwitch =
		new HotelSwitch<Adapter>() {
			@Override
			public Adapter caseHotel(Hotel object) {
				return createHotelAdapter();
			}
			@Override
			public Adapter caseHotel_Room(Hotel_Room object) {
				return createHotel_RoomAdapter();
			}
			@Override
			public Adapter caseIRoom(IRoom object) {
				return createIRoomAdapter();
			}
			@Override
			public Adapter caseHotel_Occupancy(Hotel_Occupancy object) {
				return createHotel_OccupancyAdapter();
			}
			@Override
			public Adapter caseHotel_Stay(Hotel_Stay object) {
				return createHotel_StayAdapter();
			}
			@Override
			public Adapter caseHotel_Booking(Hotel_Booking object) {
				return createHotel_BookingAdapter();
			}
			@Override
			public Adapter caseIBooking(IBooking object) {
				return createIBookingAdapter();
			}
			@Override
			public Adapter caseHotel_Order(Hotel_Order object) {
				return createHotel_OrderAdapter();
			}
			@Override
			public Adapter caseIOrder(IOrder object) {
				return createIOrderAdapter();
			}
			@Override
			public Adapter caseHotel_BookingSuggestion(Hotel_BookingSuggestion object) {
				return createHotel_BookingSuggestionAdapter();
			}
			@Override
			public Adapter caseIBookingSuggestion(IBookingSuggestion object) {
				return createIBookingSuggestionAdapter();
			}
			@Override
			public Adapter caseHotel_SearchResult(Hotel_SearchResult object) {
				return createHotel_SearchResultAdapter();
			}
			@Override
			public Adapter caseISearchResult(ISearchResult object) {
				return createISearchResultAdapter();
			}
			@Override
			public Adapter caseHotel_Hotel(Hotel_Hotel object) {
				return createHotel_HotelAdapter();
			}
			@Override
			public Adapter caseIPersistenceService(IPersistenceService object) {
				return createIPersistenceServiceAdapter();
			}
			@Override
			public Adapter caseIFrontDesk(IFrontDesk object) {
				return createIFrontDeskAdapter();
			}
			@Override
			public Adapter caseISearch(ISearch object) {
				return createISearchAdapter();
			}
			@Override
			public Adapter caseIOrdering(IOrdering object) {
				return createIOrderingAdapter();
			}
			@Override
			public Adapter caseOrderRequest(OrderRequest object) {
				return createOrderRequestAdapter();
			}
			@Override
			public Adapter caseBookingRequest(BookingRequest object) {
				return createBookingRequestAdapter();
			}
			@Override
			public Adapter caseHotel_DummyPersistenceService(Hotel_DummyPersistenceService object) {
				return createHotel_DummyPersistenceServiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel
	 * @generated
	 */
	public Adapter createHotelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_Room <em>Hotel Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_Room
	 * @generated
	 */
	public Adapter createHotel_RoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.IRoom <em>IRoom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.IRoom
	 * @generated
	 */
	public Adapter createIRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_Occupancy <em>Hotel Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_Occupancy
	 * @generated
	 */
	public Adapter createHotel_OccupancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_Stay <em>Hotel Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_Stay
	 * @generated
	 */
	public Adapter createHotel_StayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_Booking <em>Hotel Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_Booking
	 * @generated
	 */
	public Adapter createHotel_BookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.IBooking
	 * @generated
	 */
	public Adapter createIBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_Order <em>Hotel Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_Order
	 * @generated
	 */
	public Adapter createHotel_OrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.IOrder <em>IOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.IOrder
	 * @generated
	 */
	public Adapter createIOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_BookingSuggestion <em>Hotel Booking Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_BookingSuggestion
	 * @generated
	 */
	public Adapter createHotel_BookingSuggestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.IBookingSuggestion <em>IBooking Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.IBookingSuggestion
	 * @generated
	 */
	public Adapter createIBookingSuggestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_SearchResult <em>Hotel Search Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_SearchResult
	 * @generated
	 */
	public Adapter createHotel_SearchResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.ISearchResult <em>ISearch Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.ISearchResult
	 * @generated
	 */
	public Adapter createISearchResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_Hotel <em>Hotel Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_Hotel
	 * @generated
	 */
	public Adapter createHotel_HotelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.IPersistenceService <em>IPersistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.IPersistenceService
	 * @generated
	 */
	public Adapter createIPersistenceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.IFrontDesk <em>IFront Desk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.IFrontDesk
	 * @generated
	 */
	public Adapter createIFrontDeskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.ISearch <em>ISearch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.ISearch
	 * @generated
	 */
	public Adapter createISearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.IOrdering <em>IOrdering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.IOrdering
	 * @generated
	 */
	public Adapter createIOrderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.OrderRequest <em>Order Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.OrderRequest
	 * @generated
	 */
	public Adapter createOrderRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.BookingRequest <em>Booking Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.BookingRequest
	 * @generated
	 */
	public Adapter createBookingRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Hotel.Hotel_DummyPersistenceService <em>Hotel Dummy Persistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Hotel.Hotel_DummyPersistenceService
	 * @generated
	 */
	public Adapter createHotel_DummyPersistenceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HotelAdapterFactory
