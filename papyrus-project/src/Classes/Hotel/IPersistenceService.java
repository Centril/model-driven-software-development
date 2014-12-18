/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPersistence Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Hotel.HotelPackage#getIPersistenceService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IPersistenceService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Hotel_Occupancy> getOccupancies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Hotel_Room> getRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	Hotel_Room getRoomById(int id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Hotel_Order> getOrders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" orderRequired="true" orderOrdered="false"
	 * @generated
	 */
	boolean addOrder(Hotel_Order order);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean addRoom(Hotel_Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	Hotel_Order getOrderById(int orderID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Hotel_Booking getBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	Hotel_Booking getBookingById(int bookingID);

} // IPersistenceService
