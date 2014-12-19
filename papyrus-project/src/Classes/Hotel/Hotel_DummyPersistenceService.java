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
 *   <li>{@link Classes.Hotel.Hotel_DummyPersistenceService#getOrders <em>Orders</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_DummyPersistenceService#getRooms <em>Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService()
 * @model
 * @generated
 */
public interface Hotel_DummyPersistenceService extends IPersistenceService {
	/**
	 * Returns the value of the '<em><b>Orders</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Orders()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Order> getOrders();

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

} // Hotel_DummyPersistenceService
