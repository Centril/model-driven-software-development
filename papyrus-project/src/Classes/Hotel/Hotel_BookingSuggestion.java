/**
 */
package Classes.Hotel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Booking Suggestion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_BookingSuggestion#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_BookingSuggestion()
 * @model
 * @generated
 */
public interface Hotel_BookingSuggestion extends IBookingSuggestion {
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
	 * @see Classes.Hotel.HotelPackage#getHotel_BookingSuggestion_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hotel_Room getRoom();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_BookingSuggestion#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Hotel_Room value);

} // Hotel_BookingSuggestion
