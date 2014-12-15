/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Room Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Hotel.HotelPackage#getHotel_RoomService()
 * @model
 * @generated
 */
public interface Hotel_RoomService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Hotel_Room> getAllRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	Hotel_Room getRoomById(int id);

} // Hotel_RoomService
