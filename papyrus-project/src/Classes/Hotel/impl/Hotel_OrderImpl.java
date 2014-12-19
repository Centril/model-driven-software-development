/**
 */
package Classes.Hotel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Booking;
import Classes.Hotel.Hotel_Order;
import Classes.Hotel.IBooking;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_OrderImpl#getBookings <em>Bookings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_OrderImpl extends MinimalEObjectImpl.Container implements Hotel_Order {
	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Booking> bookings;

	private int customer;
	private int orderID;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_OrderImpl() {
		super();
	}
	
	protected Hotel_OrderImpl(int customerId, EList<Hotel_Booking> bookings) {
		this.customer = customerId;
		
		EList<Hotel_Booking> tmpbookings = new BasicEList<>();
		tmpbookings.addAll(bookings);
		this.bookings = tmpbookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectResolvingEList<Hotel_Booking>(Hotel_Booking.class, this, HotelPackage.HOTEL_ORDER__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IBooking> getIBookings() {
		EList<IBooking> tempBookings = new BasicEList<>();
		tempBookings.addAll(bookings);
		return tempBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getID() {
		return orderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setID(int orderID) {
		this.orderID = orderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCustomer(int customerId) {
		this.customer = customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBooking(Hotel_Booking booking) {
		this.bookings.add(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.HOTEL_ORDER__BOOKINGS:
				return getBookings();
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
			case HotelPackage.HOTEL_ORDER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends Hotel_Booking>)newValue);
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
			case HotelPackage.HOTEL_ORDER__BOOKINGS:
				getBookings().clear();
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
			case HotelPackage.HOTEL_ORDER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
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
			case HotelPackage.HOTEL_ORDER___GET_IBOOKINGS:
				return getIBookings();
			case HotelPackage.HOTEL_ORDER___GET_CUSTOMER:
				return getCustomer();
			case HotelPackage.HOTEL_ORDER___GET_ID:
				return getID();
			case HotelPackage.HOTEL_ORDER___SET_ID__INT:
				setID((Integer)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_ORDER___SET_CUSTOMER__INT:
				setCustomer((Integer)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_ORDER___ADD_BOOKING__HOTEL_BOOKING:
				addBooking((Hotel_Booking)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_OrderImpl
