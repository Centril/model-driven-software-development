/**
 */
package Classes.PersonRegistry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl;

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

	final IPersonRegistry instance = PersonRegistry_PersonRegistryImpl.getInstance();
	
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
	EList<IPerson> getIPeople();

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
	IPerson getIPersonByID(int personID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	IPerson getIPersonBySSN(String ssn);

} // IPersonRegistry
