/**
 */
package Classes.PersonRegistry.impl;

import Classes.PersonRegistry.ICreditCardInfo;
import Classes.PersonRegistry.PersonRegistryPackage;
import Classes.PersonRegistry.PersonRegistry_CreditCardInfo;
import Classes.PersonRegistry.PersonRegistry_Person;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Registry Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.PersonRegistry.impl.PersonRegistry_PersonImpl#getCreditCardInfo <em>Credit Card Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonRegistry_PersonImpl extends MinimalEObjectImpl.Container implements PersonRegistry_Person {
	/**
	 * The cached value of the '{@link #getCreditCardInfo() <em>Credit Card Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInfo()
	 * @generated
	 * @ordered
	 */
	protected PersonRegistry_CreditCardInfo creditCardInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonRegistry_PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonRegistryPackage.Literals.PERSON_REGISTRY_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry_CreditCardInfo getCreditCardInfo() {
		if (creditCardInfo != null && creditCardInfo.eIsProxy()) {
			InternalEObject oldCreditCardInfo = (InternalEObject)creditCardInfo;
			creditCardInfo = (PersonRegistry_CreditCardInfo)eResolveProxy(oldCreditCardInfo);
			if (creditCardInfo != oldCreditCardInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersonRegistryPackage.PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO, oldCreditCardInfo, creditCardInfo));
			}
		}
		return creditCardInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry_CreditCardInfo basicGetCreditCardInfo() {
		return creditCardInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCardInfo(PersonRegistry_CreditCardInfo newCreditCardInfo) {
		PersonRegistry_CreditCardInfo oldCreditCardInfo = creditCardInfo;
		creditCardInfo = newCreditCardInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonRegistryPackage.PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO, oldCreditCardInfo, creditCardInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBirthDate() {
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
	public String getSSN() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRegisterDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICreditCardInfo getCreditCard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createCreditCardInfo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCreditCard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createCreditCard(String number, String ccv, int month, int year, String cardHolder) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setFirstName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setLastName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setSSN() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO:
				if (resolve) return getCreditCardInfo();
				return basicGetCreditCardInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO:
				setCreditCardInfo((PersonRegistry_CreditCardInfo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO:
				setCreditCardInfo((PersonRegistry_CreditCardInfo)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO:
				return creditCardInfo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___GET_BIRTH_DATE:
				return getBirthDate();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___GET_FIRST_NAME:
				return getFirstName();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___GET_LAST_NAME:
				return getLastName();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___GET_SSN:
				return getSSN();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___GET_REGISTER_DATE:
				return getRegisterDate();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___GET_CREDIT_CARD:
				return getCreditCard();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___CREATE_CREDIT_CARD_INFO:
				createCreditCardInfo();
				return null;
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___REMOVE_CREDIT_CARD:
				removeCreditCard();
				return null;
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___CREATE_CREDIT_CARD__STRING_STRING_INT_INT_STRING:
				createCreditCard((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
				return null;
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___GET_ID:
				return getId();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___SET_FIRST_NAME:
				return setFirstName();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___SET_LAST_NAME:
				return setLastName();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON___SET_SSN:
				return setSSN();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PersonRegistry_PersonImpl
