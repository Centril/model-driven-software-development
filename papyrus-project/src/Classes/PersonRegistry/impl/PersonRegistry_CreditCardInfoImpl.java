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

	private String ccNumber;
	private String ccv;
	private int month;
	private int year;
	private String firstName;
	private String lastName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PersonRegistry_CreditCardInfoImpl() {
		super();
		throw new UnsupportedOperationException("Empty constructor not supported");
	}

	protected PersonRegistry_CreditCardInfoImpl(String ccNumber, String ccv, int month, int year, String firstName, String lastName) {
		this.ccNumber = ccNumber;
		this.ccv = ccv;
		this.month = month;
		this.year = year;
		this.firstName = firstName;
		this.lastName = lastName;
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
	 * @generated NOT
	 */
	public String getCCV() {
		return ccv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCCNumber() {
		return ccNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLastName() {
		return lastName;
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
