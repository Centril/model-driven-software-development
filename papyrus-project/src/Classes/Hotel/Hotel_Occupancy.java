/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Occupancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_Occupancy#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_Occupancy()
 * @model
 * @generated
 */
public interface Hotel_Occupancy extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Hotel_Room)
	 * @see Classes.Hotel.HotelPackage#getHotel_Occupancy_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_Room getRoom();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_Occupancy#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Hotel_Room value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberRequired="true" numberOrdered="false"
	 * @generated
	 */
	void addKeys(int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberRequired="true" numberOrdered="false"
	 * @generated
	 */
	void removeKeys(int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	long getStartTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	long getEndTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startTimeRequired="true" startTimeOrdered="false"
	 * @generated
	 */
	void setStartTime(long startTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	void setEndTime(long endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getNumKeys();

} // Hotel_Occupancy
