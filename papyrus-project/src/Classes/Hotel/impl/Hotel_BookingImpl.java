/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Booking;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_Stay;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_BookingImpl#getStay <em>Stay</em>}</li>
 *   <li>{@link Classes.Hotel.impl.Hotel_BookingImpl#getOccupancy <em>Occupancy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_BookingImpl extends MinimalEObjectImpl.Container implements Hotel_Booking {
	/**
	 * The cached value of the '{@link #getStay() <em>Stay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStay()
	 * @generated
	 * @ordered
	 */
	protected Hotel_Stay stay;

	/**
	 * The cached value of the '{@link #getOccupancy() <em>Occupancy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancy()
	 * @generated
	 * @ordered
	 */
	protected Hotel_Occupancy occupancy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Stay getStay() {
		if (stay != null && stay.eIsProxy()) {
			InternalEObject oldStay = (InternalEObject)stay;
			stay = (Hotel_Stay)eResolveProxy(oldStay);
			if (stay != oldStay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_BOOKING__STAY, oldStay, stay));
			}
		}
		return stay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Stay basicGetStay() {
		return stay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStay(Hotel_Stay newStay) {
		Hotel_Stay oldStay = stay;
		stay = newStay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_BOOKING__STAY, oldStay, stay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Occupancy getOccupancy() {
		if (occupancy != null && occupancy.eIsProxy()) {
			InternalEObject oldOccupancy = (InternalEObject)occupancy;
			occupancy = (Hotel_Occupancy)eResolveProxy(oldOccupancy);
			if (occupancy != oldOccupancy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.HOTEL_BOOKING__OCCUPANCY, oldOccupancy, occupancy));
			}
		}
		return occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Occupancy basicGetOccupancy() {
		return occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupancy(Hotel_Occupancy newOccupancy) {
		Hotel_Occupancy oldOccupancy = occupancy;
		occupancy = newOccupancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.HOTEL_BOOKING__OCCUPANCY, oldOccupancy, occupancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContact() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getGuests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCheckInDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCheckOutDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomer() {
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
			case HotelPackage.HOTEL_BOOKING__STAY:
				if (resolve) return getStay();
				return basicGetStay();
			case HotelPackage.HOTEL_BOOKING__OCCUPANCY:
				if (resolve) return getOccupancy();
				return basicGetOccupancy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelPackage.HOTEL_BOOKING__STAY:
				setStay((Hotel_Stay)newValue);
				return;
			case HotelPackage.HOTEL_BOOKING__OCCUPANCY:
				setOccupancy((Hotel_Occupancy)newValue);
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
			case HotelPackage.HOTEL_BOOKING__STAY:
				setStay((Hotel_Stay)null);
				return;
			case HotelPackage.HOTEL_BOOKING__OCCUPANCY:
				setOccupancy((Hotel_Occupancy)null);
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
			case HotelPackage.HOTEL_BOOKING__STAY:
				return stay != null;
			case HotelPackage.HOTEL_BOOKING__OCCUPANCY:
				return occupancy != null;
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
			case HotelPackage.HOTEL_BOOKING___GET_CONTACT:
				return getContact();
			case HotelPackage.HOTEL_BOOKING___GET_PRICE:
				return getPrice();
			case HotelPackage.HOTEL_BOOKING___GET_GUESTS:
				return getGuests();
			case HotelPackage.HOTEL_BOOKING___GET_CHECK_IN_DATE:
				return getCheckInDate();
			case HotelPackage.HOTEL_BOOKING___GET_CHECK_OUT_DATE:
				return getCheckOutDate();
			case HotelPackage.HOTEL_BOOKING___GET_CUSTOMER:
				return getCustomer();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_BookingImpl