/**
 */
package Classes.PersonRegistry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPerson Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.PersonRegistry.PersonRegistryPackage#getIPersonRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IPersonRegistry extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personRequired="true" personOrdered="false"
	 * @generated
	 */
	boolean isBlacklisted(IPerson person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model birthDateRequired="true" birthDateOrdered="false"
	 * @generated
	 */
	void createPerson(long birthDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<IPerson> getPeople();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model personRequired="true" personOrdered="false"
	 * @generated
	 */
	void addToBlacklist(IPerson person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model personRequired="true" personOrdered="false"
	 * @generated
	 */
	void removeFromBlacklist(IPerson person);

} // IPersonRegistry
