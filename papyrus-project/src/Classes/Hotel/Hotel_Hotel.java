/**
 */
package Classes.Hotel;

import Classes.PersonRegistry.IPersonRegistry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_Hotel#getOrder <em>Order</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_Hotel#getPersonRegistry <em>Person Registry</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_Hotel#getRoomService <em>Room Service</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_Hotel#getOccupancyService <em>Occupancy Service</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_Hotel#getOrderService <em>Order Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_Hotel()
 * @model
 * @generated
 */
public interface Hotel_Hotel extends IFrontDesk, ISearch, IOrdering {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_Hotel_Order()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Order> getOrder();

	/**
	 * Returns the value of the '<em><b>Person Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Registry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Registry</em>' reference.
	 * @see #setPersonRegistry(IPersonRegistry)
	 * @see Classes.Hotel.HotelPackage#getHotel_Hotel_PersonRegistry()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IPersonRegistry getPersonRegistry();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_Hotel#getPersonRegistry <em>Person Registry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Registry</em>' reference.
	 * @see #getPersonRegistry()
	 * @generated
	 */
	void setPersonRegistry(IPersonRegistry value);

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
	 * @see Classes.Hotel.HotelPackage#getHotel_Hotel_RoomService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_RoomService getRoomService();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_Hotel#getRoomService <em>Room Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Service</em>' reference.
	 * @see #getRoomService()
	 * @generated
	 */
	void setRoomService(Hotel_RoomService value);

	/**
	 * Returns the value of the '<em><b>Occupancy Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancy Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancy Service</em>' reference.
	 * @see #setOccupancyService(Hotel_OccupancyService)
	 * @see Classes.Hotel.HotelPackage#getHotel_Hotel_OccupancyService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_OccupancyService getOccupancyService();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_Hotel#getOccupancyService <em>Occupancy Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupancy Service</em>' reference.
	 * @see #getOccupancyService()
	 * @generated
	 */
	void setOccupancyService(Hotel_OccupancyService value);

	/**
	 * Returns the value of the '<em><b>Order Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Service</em>' reference.
	 * @see #setOrderService(Hotel_OrderService)
	 * @see Classes.Hotel.HotelPackage#getHotel_Hotel_OrderService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_OrderService getOrderService();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_Hotel#getOrderService <em>Order Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Service</em>' reference.
	 * @see #getOrderService()
	 * @generated
	 */
	void setOrderService(Hotel_OrderService value);

} // Hotel_Hotel
