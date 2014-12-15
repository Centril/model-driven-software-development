/**
 */
package Classes.PersonRegistry;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Registry Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.PersonRegistry.PersonRegistry_Person#getCreditCardInfo <em>Credit Card Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_Person()
 * @model
 * @generated
 */
public interface PersonRegistry_Person extends IPerson {
	/**
	 * Returns the value of the '<em><b>Credit Card Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Info</em>' reference.
	 * @see #setCreditCardInfo(PersonRegistry_CreditCardInfo)
	 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_Person_CreditCardInfo()
	 * @model ordered="false"
	 * @generated
	 */
	PersonRegistry_CreditCardInfo getCreditCardInfo();

	/**
	 * Sets the value of the '{@link Classes.PersonRegistry.PersonRegistry_Person#getCreditCardInfo <em>Credit Card Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Info</em>' reference.
	 * @see #getCreditCardInfo()
	 * @generated
	 */
	void setCreditCardInfo(PersonRegistry_CreditCardInfo value);

} // PersonRegistry_Person
