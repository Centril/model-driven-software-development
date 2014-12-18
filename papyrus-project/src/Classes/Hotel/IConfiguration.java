/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IConfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Hotel.HotelPackage#getIConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IConfiguration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IRoom createRoom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	IRoom getRooms();

} // IConfiguration
