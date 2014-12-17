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
 *   <li>{@link Classes.Hotel.Hotel_DummyPersistenceService#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_DummyPersistenceService#getOccupancy <em>Occupancy</em>}</li>
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
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Room()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Occupancy</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Occupancy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancy</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Occupancy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Occupancy> getOccupancy();

} // Hotel_DummyPersistenceService
