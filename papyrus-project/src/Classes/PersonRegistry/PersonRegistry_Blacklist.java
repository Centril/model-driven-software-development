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
 *   <li>{@link Classes.PersonRegistry.PersonRegistry_Blacklist#getPeople <em>People</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_Blacklist()
 * @model
 * @generated
 */
public interface PersonRegistry_Blacklist extends EObject {
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
	 * @model required="true" ordered="false" personRequired="true" personOrdered="false"
	 * @generated
	 */
	boolean add(PersonRegistry_Person person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personRequired="true" personOrdered="false"
	 * @generated
	 */
	boolean remove(PersonRegistry_Person person);

	/**
	 * Returns the value of the '<em><b>People</b></em>' reference list.
	 * The list contents are of type {@link Classes.PersonRegistry.PersonRegistry_Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' reference list.
	 * @see Classes.PersonRegistry.PersonRegistryPackage#getPersonRegistry_Blacklist_People()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PersonRegistry_Person> getPeople();

} // PersonRegistry_Blacklist
