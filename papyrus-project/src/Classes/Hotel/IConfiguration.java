/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EObject;

import Classes.Hotel.impl.Hotel_HotelImpl;

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
	
	static IConfiguration getInstance() {
		return Hotel_HotelImpl.getInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false" basePriceRequired="true" basePriceOrdered="false"
	 * @generated
	 */
	IRoom createRoom(int nbrOfBeds, double basePrice);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	IRoom getRooms();

} // IConfiguration
