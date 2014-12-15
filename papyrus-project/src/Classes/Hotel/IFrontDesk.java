/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFront Desk</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Hotel.HotelPackage#getIFrontDesk()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IFrontDesk extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" numKeysRequired="true" numKeysOrdered="false"
	 * @generated
	 */
	void checkIn(IBooking booking, int numKeys);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	double getBill(IBooking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<IBooking> getBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void pay(IBooking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" numKeysRequired="true" numKeysOrdered="false"
	 * @generated
	 */
	void checkOut(IBooking booking, int numKeys);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<IOrder> getOrders();

} // IFrontDesk
