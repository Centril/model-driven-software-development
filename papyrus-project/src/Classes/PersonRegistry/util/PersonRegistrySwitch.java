/**
 */
package Classes.PersonRegistry.util;

import Classes.PersonRegistry.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Classes.PersonRegistry.PersonRegistryPackage
 * @generated
 */
public class PersonRegistrySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersonRegistryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistrySwitch() {
		if (modelPackage == null) {
			modelPackage = PersonRegistryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PersonRegistryPackage.PERSON_REGISTRY: {
				PersonRegistry personRegistry = (PersonRegistry)theEObject;
				T result = casePersonRegistry(personRegistry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersonRegistryPackage.PERSON_REGISTRY_CREDIT_CARD_INFO: {
				PersonRegistry_CreditCardInfo personRegistry_CreditCardInfo = (PersonRegistry_CreditCardInfo)theEObject;
				T result = casePersonRegistry_CreditCardInfo(personRegistry_CreditCardInfo);
				if (result == null) result = caseICreditCardInfo(personRegistry_CreditCardInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersonRegistryPackage.ICREDIT_CARD_INFO: {
				ICreditCardInfo iCreditCardInfo = (ICreditCardInfo)theEObject;
				T result = caseICreditCardInfo(iCreditCardInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON: {
				PersonRegistry_Person personRegistry_Person = (PersonRegistry_Person)theEObject;
				T result = casePersonRegistry_Person(personRegistry_Person);
				if (result == null) result = caseIPerson(personRegistry_Person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersonRegistryPackage.IPERSON: {
				IPerson iPerson = (IPerson)theEObject;
				T result = caseIPerson(iPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST: {
				PersonRegistry_Blacklist personRegistry_Blacklist = (PersonRegistry_Blacklist)theEObject;
				T result = casePersonRegistry_Blacklist(personRegistry_Blacklist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY: {
				PersonRegistry_PersonRegistry personRegistry_PersonRegistry = (PersonRegistry_PersonRegistry)theEObject;
				T result = casePersonRegistry_PersonRegistry(personRegistry_PersonRegistry);
				if (result == null) result = caseIPersonRegistry(personRegistry_PersonRegistry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersonRegistryPackage.IPERSON_REGISTRY: {
				IPersonRegistry iPersonRegistry = (IPersonRegistry)theEObject;
				T result = caseIPersonRegistry(iPersonRegistry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonRegistry(PersonRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Registry Credit Card Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Registry Credit Card Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonRegistry_CreditCardInfo(PersonRegistry_CreditCardInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICredit Card Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICredit Card Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICreditCardInfo(ICreditCardInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Registry Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Registry Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonRegistry_Person(PersonRegistry_Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPerson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPerson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPerson(IPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Registry Blacklist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Registry Blacklist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonRegistry_Blacklist(PersonRegistry_Blacklist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Registry Person Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Registry Person Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonRegistry_PersonRegistry(PersonRegistry_PersonRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPerson Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPerson Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPersonRegistry(IPersonRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PersonRegistrySwitch
