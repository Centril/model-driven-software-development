/**
 */
package Classes.PersonRegistry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Registry Person Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.PersonRegistry.PersonRegistry_PersonRegistry#getPerson <em>Person</em>}</li>
 *   <li>{@link Classes.PersonRegistry.PersonRegistry_PersonRegistry#getBlacklist <em>Blacklist</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_PersonRegistry()
 * @model
 * @generated
 */
public interface PersonRegistry_PersonRegistry extends IPersonRegistry {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference list.
	 * The list contents are of type {@link Classes.PersonRegistry.PersonRegistry_Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference list.
	 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_PersonRegistry_Person()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PersonRegistry_Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Blacklist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blacklist</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blacklist</em>' reference.
	 * @see #setBlacklist(PersonRegistry_Blacklist)
	 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_PersonRegistry_Blacklist()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PersonRegistry_Blacklist getBlacklist();

	/**
	 * Sets the value of the '{@link Classes.PersonRegistry.PersonRegistry_PersonRegistry#getBlacklist <em>Blacklist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blacklist</em>' reference.
	 * @see #getBlacklist()
	 * @generated
	 */
	void setBlacklist(PersonRegistry_Blacklist value);

} // PersonRegistry_PersonRegistry
