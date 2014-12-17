/**
 */
package Classes.PersonRegistry.impl;

import Classes.PersonRegistry.PersonRegistryPackage;
import Classes.PersonRegistry.PersonRegistry_CreditCardInfo;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Registry Credit Card Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PersonRegistry_CreditCardInfoImpl extends MinimalEObjectImpl.Container implements PersonRegistry_CreditCardInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonRegistry_CreditCardInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonRegistryPackage.Literals.PERSON_REGISTRY_CREDIT_CARD_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCCV() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonth() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCCNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PersonRegistryPackage.PERSON_REGISTRY_CREDIT_CARD_INFO___GET_CCV:
				return getCCV();
			case PersonRegistryPackage.PERSON_REGISTRY_CREDIT_CARD_INFO___GET_MONTH:
				return getMonth();
			case PersonRegistryPackage.PERSON_REGISTRY_CREDIT_CARD_INFO___GET_YEAR:
				return getYear();
			case PersonRegistryPackage.PERSON_REGISTRY_CREDIT_CARD_INFO___GET_CC_NUMBER:
				return getCCNumber();
			case PersonRegistryPackage.PERSON_REGISTRY_CREDIT_CARD_INFO___GET_FIRST_NAME:
				return getFirstName();
			case PersonRegistryPackage.PERSON_REGISTRY_CREDIT_CARD_INFO___GET_LAST_NAME:
				return getLastName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PersonRegistry_CreditCardInfoImpl
