/**
 */
package Classes.PersonRegistry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Registry Blacklist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.PersonRegistry.PersonRegistry_Blacklist#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_Blacklist()
 * @model
 * @generated
 */
public interface PersonRegistry_Blacklist extends EObject {
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
	 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_Blacklist_Person()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PersonRegistry_Person> getPerson();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personRequired="true" personOrdered="false"
	 * @generated
	 */
	boolean isBlacklisted(PersonRegistry_Person person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model personRequired="true" personOrdered="false"
	 * @generated
	 */
	void add(PersonRegistry_Person person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model personRequired="true" personOrdered="false"
	 * @generated
	 */
	void remove(PersonRegistry_Person person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	IPerson getPeople();

} // PersonRegistry_Blacklist
