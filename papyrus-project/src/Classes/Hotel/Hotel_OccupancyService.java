/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Occupancy Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_OccupancyService#getRoomService <em>Room Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_OccupancyService()
 * @model
 * @generated
 */
public interface Hotel_OccupancyService extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Service</em>' reference.
	 * @see #setRoomService(Hotel_RoomService)
	 * @see Classes.Hotel.HotelPackage#getHotel_OccupancyService_RoomService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_RoomService getRoomService();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_OccupancyService#getRoomService <em>Room Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Service</em>' reference.
	 * @see #getRoomService()
	 * @generated
	 */
	void setRoomService(Hotel_RoomService value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Hotel_Occupancy> getAllOccupancies();

} // Hotel_OccupancyService
