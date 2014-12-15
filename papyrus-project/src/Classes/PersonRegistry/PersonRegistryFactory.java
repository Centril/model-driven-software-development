/**
 */
package Classes.PersonRegistry;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.PersonRegistry.PersonRegistryPackage
 * @generated
 */
public interface PersonRegistryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersonRegistryFactory eINSTANCE = Classes.PersonRegistry.impl.PersonRegistryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Person Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Registry</em>'.
	 * @generated
	 */
	PersonRegistry createPersonRegistry();

	/**
	 * Returns a new object of class '<em>Person Registry Credit Card Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Registry Credit Card Info</em>'.
	 * @generated
	 */
	PersonRegistry_CreditCardInfo createPersonRegistry_CreditCardInfo();

	/**
	 * Returns a new object of class '<em>Person Registry Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Registry Person</em>'.
	 * @generated
	 */
	PersonRegistry_Person createPersonRegistry_Person();

	/**
	 * Returns a new object of class '<em>Person Registry Blacklist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Registry Blacklist</em>'.
	 * @generated
	 */
	PersonRegistry_Blacklist createPersonRegistry_Blacklist();

	/**
	 * Returns a new object of class '<em>Person Registry Person Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Registry Person Registry</em>'.
	 * @generated
	 */
	PersonRegistry_PersonRegistry createPersonRegistry_PersonRegistry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersonRegistryPackage getPersonRegistryPackage();

} //PersonRegistryFactory
