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
 *
 * @see Classes.Hotel.HotelPackage#getHotel_OccupancyService()
 * @model
 * @generated
 */
public interface Hotel_OccupancyService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Hotel_Occupancy> getAllOccupancies();

} // Hotel_OccupancyService
