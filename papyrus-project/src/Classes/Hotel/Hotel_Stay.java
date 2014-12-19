/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Stay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_Stay#getOccupancy <em>Occupancy</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_Stay()
 * @model
 * @generated
 */
public interface Hotel_Stay extends EObject {
	/**
	 * Returns the value of the '<em><b>Occupancy</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Occupancy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancy</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_Stay_Occupancy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Hotel_Occupancy> getOccupancy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Hotel_Occupancy getCurrentOccupancy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model occupancyRequired="true" occupancyOrdered="false"
	 * @generated
	 */
	void addOccupancy(Hotel_Occupancy occupancy);

} // Hotel_Stay
