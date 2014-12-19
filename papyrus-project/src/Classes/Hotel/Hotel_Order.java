/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_Order#getBookings <em>Bookings</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_Order()
 * @model
 * @generated
 */
public interface Hotel_Order extends IOrder {
	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_Order_Bookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Booking> getBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	void setID(int orderID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerIdRequired="true" customerIdOrdered="false"
	 * @generated
	 */
	void setCustomer(int customerId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void addBooking(Hotel_Booking booking);

} // Hotel_Order
