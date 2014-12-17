/**
 */
package Classes.Hotel;


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
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(Hotel_Order)
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Order()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_Order getOrder();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_DummyPersistenceService#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Hotel_Order value);

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
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_Room getRoom();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_DummyPersistenceService#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Hotel_Room value);

	/**
	 * Returns the value of the '<em><b>Occupancy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancy</em>' reference.
	 * @see #setOccupancy(Hotel_Occupancy)
	 * @see Classes.Hotel.HotelPackage#getHotel_DummyPersistenceService_Occupancy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_Occupancy getOccupancy();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_DummyPersistenceService#getOccupancy <em>Occupancy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupancy</em>' reference.
	 * @see #getOccupancy()
	 * @generated
	 */
	void setOccupancy(Hotel_Occupancy value);

} // Hotel_DummyPersistenceService
