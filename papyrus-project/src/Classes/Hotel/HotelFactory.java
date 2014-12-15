/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Hotel.HotelPackage
 * @generated
 */
public interface HotelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelFactory eINSTANCE = Classes.Hotel.impl.HotelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel</em>'.
	 * @generated
	 */
	Hotel createHotel();

	/**
	 * Returns a new object of class '<em>Hotel Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Room</em>'.
	 * @generated
	 */
	Hotel_Room createHotel_Room();

	/**
	 * Returns a new object of class '<em>Hotel Occupancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Occupancy</em>'.
	 * @generated
	 */
	Hotel_Occupancy createHotel_Occupancy();

	/**
	 * Returns a new object of class '<em>Hotel Stay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Stay</em>'.
	 * @generated
	 */
	Hotel_Stay createHotel_Stay();

	/**
	 * Returns a new object of class '<em>Hotel Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Booking</em>'.
	 * @generated
	 */
	Hotel_Booking createHotel_Booking();

	/**
	 * Returns a new object of class '<em>Hotel Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Order</em>'.
	 * @generated
	 */
	Hotel_Order createHotel_Order();

	/**
	 * Returns a new object of class '<em>Hotel Booking Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Booking Suggestion</em>'.
	 * @generated
	 */
	Hotel_BookingSuggestion createHotel_BookingSuggestion();

	/**
	 * Returns a new object of class '<em>Hotel Search Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Search Result</em>'.
	 * @generated
	 */
	Hotel_SearchResult createHotel_SearchResult();

	/**
	 * Returns a new object of class '<em>Hotel Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Hotel</em>'.
	 * @generated
	 */
	Hotel_Hotel createHotel_Hotel();

	/**
	 * Returns a new object of class '<em>Hotel Room Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Room Service</em>'.
	 * @generated
	 */
	Hotel_RoomService createHotel_RoomService();

	/**
	 * Returns a new object of class '<em>Hotel Occupancy Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Occupancy Service</em>'.
	 * @generated
	 */
	Hotel_OccupancyService createHotel_OccupancyService();

	/**
	 * Returns a new object of class '<em>Hotel Order Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Order Service</em>'.
	 * @generated
	 */
	Hotel_OrderService createHotel_OrderService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HotelPackage getHotelPackage();

} //HotelFactory
