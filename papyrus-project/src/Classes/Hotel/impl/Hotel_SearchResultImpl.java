/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_BookingSuggestion;
import Classes.Hotel.Hotel_SearchResult;
import Classes.Hotel.IBookingSuggestion;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Search Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_SearchResultImpl#getBookingSuggestion <em>Booking Suggestion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_SearchResultImpl extends MinimalEObjectImpl.Container implements Hotel_SearchResult {
	/**
	 * The cached value of the '{@link #getBookingSuggestion() <em>Booking Suggestion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingSuggestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_BookingSuggestion> bookingSuggestion;

	private double price = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_SearchResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_SEARCH_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Hotel_BookingSuggestion> getBookingSuggestion() {
		if (bookingSuggestion == null) {
			bookingSuggestion = new EObjectResolvingEList<Hotel_BookingSuggestion>(Hotel_BookingSuggestion.class, this, HotelPackage.HOTEL_SEARCH_RESULT__BOOKING_SUGGESTION);
		}
		return bookingSuggestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IBookingSuggestion> getBookingSuggestions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookingSuggestion(Hotel_BookingSuggestion suggestion) {
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
			case HotelPackage.HOTEL_SEARCH_RESULT__BOOKING_SUGGESTION:
				return getBookingSuggestion();
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
			case HotelPackage.HOTEL_SEARCH_RESULT__BOOKING_SUGGESTION:
				getBookingSuggestion().clear();
				getBookingSuggestion().addAll((Collection<? extends Hotel_BookingSuggestion>)newValue);
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
			case HotelPackage.HOTEL_SEARCH_RESULT__BOOKING_SUGGESTION:
				getBookingSuggestion().clear();
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
			case HotelPackage.HOTEL_SEARCH_RESULT__BOOKING_SUGGESTION:
				return bookingSuggestion != null && !bookingSuggestion.isEmpty();
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
			case HotelPackage.HOTEL_SEARCH_RESULT___GET_BOOKING_SUGGESTIONS:
				return getBookingSuggestions();
			case HotelPackage.HOTEL_SEARCH_RESULT___GET_PRICE:
				return getPrice();
			case HotelPackage.HOTEL_SEARCH_RESULT___ADD_BOOKING_SUGGESTION__HOTEL_BOOKINGSUGGESTION:
				addBookingSuggestion((Hotel_BookingSuggestion)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_SearchResultImpl
