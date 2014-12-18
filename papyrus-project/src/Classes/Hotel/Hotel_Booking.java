/**
 */
package Classes.Hotel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_Booking#getStay <em>Stay</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_Booking#getOccupancy <em>Occupancy</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_Booking()
 * @model
 * @generated
 */
public interface Hotel_Booking extends IBooking {
	/**
	 * Returns the value of the '<em><b>Stay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stay</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stay</em>' reference.
	 * @see #setStay(Hotel_Stay)
	 * @see Classes.Hotel.HotelPackage#getHotel_Booking_Stay()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_Stay getStay();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_Booking#getStay <em>Stay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stay</em>' reference.
	 * @see #getStay()
	 * @generated
	 */
	void setStay(Hotel_Stay value);

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
	 * @see Classes.Hotel.HotelPackage#getHotel_Booking_Occupancy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_Occupancy getOccupancy();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_Booking#getOccupancy <em>Occupancy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupancy</em>' reference.
	 * @see #getOccupancy()
	 * @generated
	 */
	void setOccupancy(Hotel_Occupancy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true" idOrdered="false"
	 * @generated
	 */
	void setID(int id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model isCheckedInRequired="true" isCheckedInOrdered="false"
	 * @generated
	 */
	void setCheckedIn(boolean isCheckedIn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerIdRequired="true" customerIdOrdered="false"
	 * @generated
	 */
	void setCustomer(int customerId);

} // Hotel_Booking
