/**
 */
package Classes.Hotel;

import Classes.PersonRegistry.IPersonRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_Hotel#getPersonRegistry <em>Person Registry</em>}</li>
 *   <li>{@link Classes.Hotel.Hotel_Hotel#getPersistenceService <em>Persistence Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_Hotel()
 * @model
 * @generated
 */
public interface Hotel_Hotel extends IFrontDesk, ISearch, IOrdering, IConfiguration {
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
	 * Returns the value of the '<em><b>Persistence Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Service</em>' reference.
	 * @see #setPersistenceService(IPersistenceService)
	 * @see Classes.Hotel.HotelPackage#getHotel_Hotel_PersistenceService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IPersistenceService getPersistenceService();

	/**
	 * Sets the value of the '{@link Classes.Hotel.Hotel_Hotel#getPersistenceService <em>Persistence Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Service</em>' reference.
	 * @see #getPersistenceService()
	 * @generated
	 */
	void setPersistenceService(IPersistenceService value);

} // Hotel_Hotel
