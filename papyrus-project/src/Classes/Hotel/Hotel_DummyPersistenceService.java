/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Dummy Persistence Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_DummyPersistenceService#getOrder <em>Order</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_DummyPersistenceService#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_DummyPersistenceService#getOccupancies <em>Occupancies</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService()
 * @model
 * @generated
 */
public interface Hotel_DummyPersistenceService extends IPersistenceService {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Order()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Order> getOrder();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Rooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Occupancies</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Occupancy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancies</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Occupancies()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Occupancy> getOccupancies();

} // Hotel_DummyPersistenceService
