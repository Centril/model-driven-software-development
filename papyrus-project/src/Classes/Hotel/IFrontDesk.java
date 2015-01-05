/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import Classes.Hotel.impl.Hotel_HotelImpl;

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
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false" numKeysRequired="true" numKeysOrdered="false"
	 * @generated
	 */
	boolean checkIn(int bookingID, int numKeys);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	double getBill(int bookingID);

	final IFrontDesk instance = Hotel_HotelImpl.getInstance();
	
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
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean pay(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean checkOut(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<IOrder> getOrders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" personIDRequired="true" personIDOrdered="false"
	 * @generated
	 */
	EList<IBooking> getRelevantCheckInBookings(int personID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false" nbrKeysRequired="true" nbrKeysOrdered="false"
	 * @generated
	 */
	boolean handInKeys(int bookingId, int nbrKeys);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	boolean cancelBooking(int bookingId);

} // IFrontDesk
