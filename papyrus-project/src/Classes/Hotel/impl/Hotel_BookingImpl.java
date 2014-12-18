/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Booking;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_Stay;

import Classes.Hotel.IRoom;
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
	
	//IDs of people in personregistry
	private EList<Integer> guests;
	private int contact, customer;
	private double initialPrice;
	private boolean isCheckedIn;
	//
	private int bookingId;
	
	//Expected dates for checking in and out
	private long checkInDate, checkOutDate;
	
	private boolean isPaid = false;
	private boolean isCheckedIn = false;
	

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
	 * @generated NOT
	 */
	protected Hotel_BookingImpl() {
		super();
		throw new UnsupportedOperationException("Can't create booking without guests and contact person");
	}
	
	//TODO: Should have more implementation, stay and occupancy probably
	protected Hotel_BookingImpl(EList<Integer> guests, int contact, int customer, double price, long checkInDate, long checkOutDate, Hotel_OccupancyImpl occupancy){
		this.guests = guests;
		this.contact = contact;
		this.initialPrice = price;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.occupancy = occupancy;
		this.isCheckedIn = false;
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
	 * @generated NOT
	 */
	public int getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getPrice() {
		//TODO: Add real price calculation
		return initialPrice;// + stay.priceFromThere();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Integer> getGuests() {
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getCheckInDate() {
		return checkInDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getCheckOutDate() {
		return checkOutDate;
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
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPaid(boolean state) {
		isPaid = state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getID() {
		return bookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IRoom getIRoom() {
		IRoom room = occupancy.getRoom();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setID(int id) {
		bookingId = id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCheckedIn(boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
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
			case HotelPackage.HOTEL_BOOKING___IS_PAID:
				return isPaid();
			case HotelPackage.HOTEL_BOOKING___SET_PAID__BOOLEAN:
				setPaid((Boolean)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_BOOKING___GET_ID:
				return getID();
			case HotelPackage.HOTEL_BOOKING___GET_IROOM:
				return getIRoom();
			case HotelPackage.HOTEL_BOOKING___IS_CHECKED_IN:
				return isCheckedIn();
			case HotelPackage.HOTEL_BOOKING___SET_ID__INT:
				setID((Integer)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_BOOKING___SET_CHECKED_IN__BOOLEAN:
				setCheckedIn((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_BookingImpl
