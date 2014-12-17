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
	 * @model required="true" ordered="false" personIDRequired="true" personIDOrdered="false"
	 * @generated
	 */
	boolean isBlacklisted(int personID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" birthDateRequired="true" birthDateOrdered="false"
	 * @generated
	 */
	IPerson createPerson(long birthDate);

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
	 * @model required="true" ordered="false" personIDRequired="true" personIDOrdered="false"
	 * @generated
	 */
	boolean addToBlacklist(int personID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personIDRequired="true" personIDOrdered="false"
	 * @generated
	 */
	boolean removeFromBlacklist(int personID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personIDRequired="true" personIDOrdered="false"
	 * @generated
	 */
	IPerson getPersonByID(int personID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	IPerson getPersonBySSN(String ssn);

} // IPersonRegistry
