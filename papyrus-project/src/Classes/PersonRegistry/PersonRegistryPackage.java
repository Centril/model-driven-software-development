/**
 */
package Classes.PersonRegistry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.PersonRegistry.PersonRegistryFactory
 * @model kind="package"
 * @generated
 */
public interface PersonRegistryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PersonRegistry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/PersonRegistry.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.PersonRegistry";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersonRegistryPackage eINSTANCE = Classes.PersonRegistry.impl.PersonRegistryPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.PersonRegistry.impl.PersonRegistryImpl <em>Person Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.PersonRegistry.impl.PersonRegistryImpl
	 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry()
	 * @generated
	 */
	int PERSON_REGISTRY = 0;

	/**
	 * The number of structural features of the '<em>Person Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Person Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.PersonRegistry.ICreditCardInfo <em>ICredit Card Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.PersonRegistry.ICreditCardInfo
	 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getICreditCardInfo()
	 * @generated
	 */
	int ICREDIT_CARD_INFO = 2;

	/**
	 * The number of structural features of the '<em>ICredit Card Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICREDIT_CARD_INFO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get CCV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICREDIT_CARD_INFO___GET_CCV = 0;

	/**
	 * The operation id for the '<em>Get Month</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICREDIT_CARD_INFO___GET_MONTH = 1;

	/**
	 * The operation id for the '<em>Get Year</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICREDIT_CARD_INFO___GET_YEAR = 2;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICREDIT_CARD_INFO___GET_NUMBER = 3;

	/**
	 * The operation id for the '<em>Get First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICREDIT_CARD_INFO___GET_FIRST_NAME = 4;

	/**
	 * The operation id for the '<em>Get Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICREDIT_CARD_INFO___GET_LAST_NAME = 5;

	/**
	 * The number of operations of the '<em>ICredit Card Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICREDIT_CARD_INFO_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link Classes.PersonRegistry.impl.PersonRegistry_CreditCardInfoImpl <em>Person Registry Credit Card Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.PersonRegistry.impl.PersonRegistry_CreditCardInfoImpl
	 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry_CreditCardInfo()
	 * @generated
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO = 1;

	/**
	 * The number of structural features of the '<em>Person Registry Credit Card Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO_FEATURE_COUNT = ICREDIT_CARD_INFO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get CCV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO___GET_CCV = ICREDIT_CARD_INFO___GET_CCV;

	/**
	 * The operation id for the '<em>Get Month</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO___GET_MONTH = ICREDIT_CARD_INFO___GET_MONTH;

	/**
	 * The operation id for the '<em>Get Year</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO___GET_YEAR = ICREDIT_CARD_INFO___GET_YEAR;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO___GET_NUMBER = ICREDIT_CARD_INFO___GET_NUMBER;

	/**
	 * The operation id for the '<em>Get First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO___GET_FIRST_NAME = ICREDIT_CARD_INFO___GET_FIRST_NAME;

	/**
	 * The operation id for the '<em>Get Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO___GET_LAST_NAME = ICREDIT_CARD_INFO___GET_LAST_NAME;

	/**
	 * The number of operations of the '<em>Person Registry Credit Card Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_CREDIT_CARD_INFO_OPERATION_COUNT = ICREDIT_CARD_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.PersonRegistry.IPerson <em>IPerson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.PersonRegistry.IPerson
	 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getIPerson()
	 * @generated
	 */
	int IPERSON = 4;

	/**
	 * The number of structural features of the '<em>IPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Birth Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___GET_BIRTH_DATE = 0;

	/**
	 * The operation id for the '<em>Get First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___GET_FIRST_NAME = 1;

	/**
	 * The operation id for the '<em>Get Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___GET_LAST_NAME = 2;

	/**
	 * The operation id for the '<em>Get SSN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___GET_SSN = 3;

	/**
	 * The operation id for the '<em>Get Register Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___GET_REGISTER_DATE = 4;

	/**
	 * The operation id for the '<em>Get Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___GET_CREDIT_CARD = 5;

	/**
	 * The operation id for the '<em>Create Credit Card Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___CREATE_CREDIT_CARD_INFO = 6;

	/**
	 * The operation id for the '<em>Remove Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___REMOVE_CREDIT_CARD = 7;

	/**
	 * The operation id for the '<em>Create Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___CREATE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___GET_ID = 9;

	/**
	 * The operation id for the '<em>Set First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___SET_FIRST_NAME__STRING = 10;

	/**
	 * The operation id for the '<em>Set Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___SET_LAST_NAME__STRING = 11;

	/**
	 * The operation id for the '<em>Set SSN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON___SET_SSN__STRING = 12;

	/**
	 * The number of operations of the '<em>IPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_OPERATION_COUNT = 13;

	/**
	 * The meta object id for the '{@link Classes.PersonRegistry.impl.PersonRegistry_PersonImpl <em>Person Registry Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.PersonRegistry.impl.PersonRegistry_PersonImpl
	 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry_Person()
	 * @generated
	 */
	int PERSON_REGISTRY_PERSON = 3;

	/**
	 * The feature id for the '<em><b>Credit Card Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO = IPERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Person Registry Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_FEATURE_COUNT = IPERSON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Birth Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___GET_BIRTH_DATE = IPERSON___GET_BIRTH_DATE;

	/**
	 * The operation id for the '<em>Get First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___GET_FIRST_NAME = IPERSON___GET_FIRST_NAME;

	/**
	 * The operation id for the '<em>Get Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___GET_LAST_NAME = IPERSON___GET_LAST_NAME;

	/**
	 * The operation id for the '<em>Get SSN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___GET_SSN = IPERSON___GET_SSN;

	/**
	 * The operation id for the '<em>Get Register Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___GET_REGISTER_DATE = IPERSON___GET_REGISTER_DATE;

	/**
	 * The operation id for the '<em>Get Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___GET_CREDIT_CARD = IPERSON___GET_CREDIT_CARD;

	/**
	 * The operation id for the '<em>Create Credit Card Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___CREATE_CREDIT_CARD_INFO = IPERSON___CREATE_CREDIT_CARD_INFO;

	/**
	 * The operation id for the '<em>Remove Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___REMOVE_CREDIT_CARD = IPERSON___REMOVE_CREDIT_CARD;

	/**
	 * The operation id for the '<em>Create Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___CREATE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = IPERSON___CREATE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___GET_ID = IPERSON___GET_ID;

	/**
	 * The operation id for the '<em>Set First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___SET_FIRST_NAME__STRING = IPERSON___SET_FIRST_NAME__STRING;

	/**
	 * The operation id for the '<em>Set Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___SET_LAST_NAME__STRING = IPERSON___SET_LAST_NAME__STRING;

	/**
	 * The operation id for the '<em>Set SSN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON___SET_SSN__STRING = IPERSON___SET_SSN__STRING;

	/**
	 * The number of operations of the '<em>Person Registry Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_OPERATION_COUNT = IPERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.PersonRegistry.impl.PersonRegistry_BlacklistImpl <em>Person Registry Blacklist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.PersonRegistry.impl.PersonRegistry_BlacklistImpl
	 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry_Blacklist()
	 * @generated
	 */
	int PERSON_REGISTRY_BLACKLIST = 5;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_BLACKLIST__PERSON = 0;

	/**
	 * The number of structural features of the '<em>Person Registry Blacklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_BLACKLIST_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Blacklisted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_BLACKLIST___IS_BLACKLISTED__PERSONREGISTRY_PERSON = 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_BLACKLIST___ADD__PERSONREGISTRY_PERSON = 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_BLACKLIST___REMOVE__PERSONREGISTRY_PERSON = 2;

	/**
	 * The operation id for the '<em>Get People</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_BLACKLIST___GET_PEOPLE = 3;

	/**
	 * The number of operations of the '<em>Person Registry Blacklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_BLACKLIST_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Classes.PersonRegistry.IPersonRegistry <em>IPerson Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.PersonRegistry.IPersonRegistry
	 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getIPersonRegistry()
	 * @generated
	 */
	int IPERSON_REGISTRY = 7;

	/**
	 * The number of structural features of the '<em>IPerson Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Blacklisted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY___IS_BLACKLISTED__INT = 0;

	/**
	 * The operation id for the '<em>Create Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY___CREATE_PERSON__LONG = 1;

	/**
	 * The operation id for the '<em>Get People</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY___GET_PEOPLE = 2;

	/**
	 * The operation id for the '<em>Add To Blacklist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY___ADD_TO_BLACKLIST__INT = 3;

	/**
	 * The operation id for the '<em>Remove From Blacklist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY___REMOVE_FROM_BLACKLIST__INT = 4;

	/**
	 * The operation id for the '<em>Get Person By ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY___GET_PERSON_BY_ID__INT = 5;

	/**
	 * The operation id for the '<em>Get Person By SSN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY___GET_PERSON_BY_SSN__STRING = 6;

	/**
	 * The number of operations of the '<em>IPerson Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_REGISTRY_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl <em>Person Registry Person Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl
	 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry_PersonRegistry()
	 * @generated
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY = 6;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY__PERSON = IPERSON_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blacklist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST = IPERSON_REGISTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person Registry Person Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY_FEATURE_COUNT = IPERSON_REGISTRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Blacklisted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY___IS_BLACKLISTED__INT = IPERSON_REGISTRY___IS_BLACKLISTED__INT;

	/**
	 * The operation id for the '<em>Create Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY___CREATE_PERSON__LONG = IPERSON_REGISTRY___CREATE_PERSON__LONG;

	/**
	 * The operation id for the '<em>Get People</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY___GET_PEOPLE = IPERSON_REGISTRY___GET_PEOPLE;

	/**
	 * The operation id for the '<em>Add To Blacklist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY___ADD_TO_BLACKLIST__INT = IPERSON_REGISTRY___ADD_TO_BLACKLIST__INT;

	/**
	 * The operation id for the '<em>Remove From Blacklist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY___REMOVE_FROM_BLACKLIST__INT = IPERSON_REGISTRY___REMOVE_FROM_BLACKLIST__INT;

	/**
	 * The operation id for the '<em>Get Person By ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY___GET_PERSON_BY_ID__INT = IPERSON_REGISTRY___GET_PERSON_BY_ID__INT;

	/**
	 * The operation id for the '<em>Get Person By SSN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY___GET_PERSON_BY_SSN__STRING = IPERSON_REGISTRY___GET_PERSON_BY_SSN__STRING;

	/**
	 * The number of operations of the '<em>Person Registry Person Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTRY_PERSON_REGISTRY_OPERATION_COUNT = IPERSON_REGISTRY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Classes.PersonRegistry.PersonRegistry <em>Person Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Registry</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry
	 * @generated
	 */
	EClass getPersonRegistry();

	/**
	 * Returns the meta object for class '{@link Classes.PersonRegistry.PersonRegistry_CreditCardInfo <em>Person Registry Credit Card Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Registry Credit Card Info</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry_CreditCardInfo
	 * @generated
	 */
	EClass getPersonRegistry_CreditCardInfo();

	/**
	 * Returns the meta object for class '{@link Classes.PersonRegistry.ICreditCardInfo <em>ICredit Card Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICredit Card Info</em>'.
	 * @see Classes.PersonRegistry.ICreditCardInfo
	 * @generated
	 */
	EClass getICreditCardInfo();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.ICreditCardInfo#getCCV() <em>Get CCV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CCV</em>' operation.
	 * @see Classes.PersonRegistry.ICreditCardInfo#getCCV()
	 * @generated
	 */
	EOperation getICreditCardInfo__GetCCV();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.ICreditCardInfo#getMonth() <em>Get Month</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Month</em>' operation.
	 * @see Classes.PersonRegistry.ICreditCardInfo#getMonth()
	 * @generated
	 */
	EOperation getICreditCardInfo__GetMonth();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.ICreditCardInfo#getYear() <em>Get Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Year</em>' operation.
	 * @see Classes.PersonRegistry.ICreditCardInfo#getYear()
	 * @generated
	 */
	EOperation getICreditCardInfo__GetYear();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.ICreditCardInfo#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see Classes.PersonRegistry.ICreditCardInfo#getNumber()
	 * @generated
	 */
	EOperation getICreditCardInfo__GetNumber();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.ICreditCardInfo#getFirstName() <em>Get First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Name</em>' operation.
	 * @see Classes.PersonRegistry.ICreditCardInfo#getFirstName()
	 * @generated
	 */
	EOperation getICreditCardInfo__GetFirstName();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.ICreditCardInfo#getLastName() <em>Get Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Name</em>' operation.
	 * @see Classes.PersonRegistry.ICreditCardInfo#getLastName()
	 * @generated
	 */
	EOperation getICreditCardInfo__GetLastName();

	/**
	 * Returns the meta object for class '{@link Classes.PersonRegistry.PersonRegistry_Person <em>Person Registry Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Registry Person</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry_Person
	 * @generated
	 */
	EClass getPersonRegistry_Person();

	/**
	 * Returns the meta object for the reference '{@link Classes.PersonRegistry.PersonRegistry_Person#getCreditCardInfo <em>Credit Card Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Info</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry_Person#getCreditCardInfo()
	 * @see #getPersonRegistry_Person()
	 * @generated
	 */
	EReference getPersonRegistry_Person_CreditCardInfo();

	/**
	 * Returns the meta object for class '{@link Classes.PersonRegistry.IPerson <em>IPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPerson</em>'.
	 * @see Classes.PersonRegistry.IPerson
	 * @generated
	 */
	EClass getIPerson();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#getBirthDate() <em>Get Birth Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Birth Date</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#getBirthDate()
	 * @generated
	 */
	EOperation getIPerson__GetBirthDate();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#getFirstName() <em>Get First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Name</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#getFirstName()
	 * @generated
	 */
	EOperation getIPerson__GetFirstName();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#getLastName() <em>Get Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Name</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#getLastName()
	 * @generated
	 */
	EOperation getIPerson__GetLastName();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#getSSN() <em>Get SSN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SSN</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#getSSN()
	 * @generated
	 */
	EOperation getIPerson__GetSSN();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#getRegisterDate() <em>Get Register Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Register Date</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#getRegisterDate()
	 * @generated
	 */
	EOperation getIPerson__GetRegisterDate();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#getCreditCard() <em>Get Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Credit Card</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#getCreditCard()
	 * @generated
	 */
	EOperation getIPerson__GetCreditCard();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#createCreditCardInfo() <em>Create Credit Card Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Credit Card Info</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#createCreditCardInfo()
	 * @generated
	 */
	EOperation getIPerson__CreateCreditCardInfo();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#removeCreditCard() <em>Remove Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Credit Card</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#removeCreditCard()
	 * @generated
	 */
	EOperation getIPerson__RemoveCreditCard();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#createCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Create Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Credit Card</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#createCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIPerson__CreateCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#getId()
	 * @generated
	 */
	EOperation getIPerson__GetId();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#setFirstName(java.lang.String) <em>Set First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set First Name</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#setFirstName(java.lang.String)
	 * @generated
	 */
	EOperation getIPerson__SetFirstName__String();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#setLastName(java.lang.String) <em>Set Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Last Name</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#setLastName(java.lang.String)
	 * @generated
	 */
	EOperation getIPerson__SetLastName__String();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPerson#setSSN(java.lang.String) <em>Set SSN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set SSN</em>' operation.
	 * @see Classes.PersonRegistry.IPerson#setSSN(java.lang.String)
	 * @generated
	 */
	EOperation getIPerson__SetSSN__String();

	/**
	 * Returns the meta object for class '{@link Classes.PersonRegistry.PersonRegistry_Blacklist <em>Person Registry Blacklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Registry Blacklist</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry_Blacklist
	 * @generated
	 */
	EClass getPersonRegistry_Blacklist();

	/**
	 * Returns the meta object for the reference list '{@link Classes.PersonRegistry.PersonRegistry_Blacklist#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry_Blacklist#getPerson()
	 * @see #getPersonRegistry_Blacklist()
	 * @generated
	 */
	EReference getPersonRegistry_Blacklist_Person();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.PersonRegistry_Blacklist#isBlacklisted(Classes.PersonRegistry.PersonRegistry_Person) <em>Is Blacklisted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Blacklisted</em>' operation.
	 * @see Classes.PersonRegistry.PersonRegistry_Blacklist#isBlacklisted(Classes.PersonRegistry.PersonRegistry_Person)
	 * @generated
	 */
	EOperation getPersonRegistry_Blacklist__IsBlacklisted__PersonRegistry_Person();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.PersonRegistry_Blacklist#add(Classes.PersonRegistry.PersonRegistry_Person) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see Classes.PersonRegistry.PersonRegistry_Blacklist#add(Classes.PersonRegistry.PersonRegistry_Person)
	 * @generated
	 */
	EOperation getPersonRegistry_Blacklist__Add__PersonRegistry_Person();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.PersonRegistry_Blacklist#remove(Classes.PersonRegistry.PersonRegistry_Person) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see Classes.PersonRegistry.PersonRegistry_Blacklist#remove(Classes.PersonRegistry.PersonRegistry_Person)
	 * @generated
	 */
	EOperation getPersonRegistry_Blacklist__Remove__PersonRegistry_Person();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.PersonRegistry_Blacklist#getPeople() <em>Get People</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get People</em>' operation.
	 * @see Classes.PersonRegistry.PersonRegistry_Blacklist#getPeople()
	 * @generated
	 */
	EOperation getPersonRegistry_Blacklist__GetPeople();

	/**
	 * Returns the meta object for class '{@link Classes.PersonRegistry.PersonRegistry_PersonRegistry <em>Person Registry Person Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Registry Person Registry</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry_PersonRegistry
	 * @generated
	 */
	EClass getPersonRegistry_PersonRegistry();

	/**
	 * Returns the meta object for the reference list '{@link Classes.PersonRegistry.PersonRegistry_PersonRegistry#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry_PersonRegistry#getPerson()
	 * @see #getPersonRegistry_PersonRegistry()
	 * @generated
	 */
	EReference getPersonRegistry_PersonRegistry_Person();

	/**
	 * Returns the meta object for the reference '{@link Classes.PersonRegistry.PersonRegistry_PersonRegistry#getBlacklist <em>Blacklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blacklist</em>'.
	 * @see Classes.PersonRegistry.PersonRegistry_PersonRegistry#getBlacklist()
	 * @see #getPersonRegistry_PersonRegistry()
	 * @generated
	 */
	EReference getPersonRegistry_PersonRegistry_Blacklist();

	/**
	 * Returns the meta object for class '{@link Classes.PersonRegistry.IPersonRegistry <em>IPerson Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPerson Registry</em>'.
	 * @see Classes.PersonRegistry.IPersonRegistry
	 * @generated
	 */
	EClass getIPersonRegistry();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPersonRegistry#isBlacklisted(int) <em>Is Blacklisted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Blacklisted</em>' operation.
	 * @see Classes.PersonRegistry.IPersonRegistry#isBlacklisted(int)
	 * @generated
	 */
	EOperation getIPersonRegistry__IsBlacklisted__int();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPersonRegistry#createPerson(long) <em>Create Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Person</em>' operation.
	 * @see Classes.PersonRegistry.IPersonRegistry#createPerson(long)
	 * @generated
	 */
	EOperation getIPersonRegistry__CreatePerson__long();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPersonRegistry#getPeople() <em>Get People</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get People</em>' operation.
	 * @see Classes.PersonRegistry.IPersonRegistry#getPeople()
	 * @generated
	 */
	EOperation getIPersonRegistry__GetPeople();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPersonRegistry#addToBlacklist(int) <em>Add To Blacklist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add To Blacklist</em>' operation.
	 * @see Classes.PersonRegistry.IPersonRegistry#addToBlacklist(int)
	 * @generated
	 */
	EOperation getIPersonRegistry__AddToBlacklist__int();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPersonRegistry#removeFromBlacklist(int) <em>Remove From Blacklist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Blacklist</em>' operation.
	 * @see Classes.PersonRegistry.IPersonRegistry#removeFromBlacklist(int)
	 * @generated
	 */
	EOperation getIPersonRegistry__RemoveFromBlacklist__int();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPersonRegistry#getPersonByID(int) <em>Get Person By ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Person By ID</em>' operation.
	 * @see Classes.PersonRegistry.IPersonRegistry#getPersonByID(int)
	 * @generated
	 */
	EOperation getIPersonRegistry__GetPersonByID__int();

	/**
	 * Returns the meta object for the '{@link Classes.PersonRegistry.IPersonRegistry#getPersonBySSN(java.lang.String) <em>Get Person By SSN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Person By SSN</em>' operation.
	 * @see Classes.PersonRegistry.IPersonRegistry#getPersonBySSN(java.lang.String)
	 * @generated
	 */
	EOperation getIPersonRegistry__GetPersonBySSN__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersonRegistryFactory getPersonRegistryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.PersonRegistry.impl.PersonRegistryImpl <em>Person Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.PersonRegistry.impl.PersonRegistryImpl
		 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry()
		 * @generated
		 */
		EClass PERSON_REGISTRY = eINSTANCE.getPersonRegistry();

		/**
		 * The meta object literal for the '{@link Classes.PersonRegistry.impl.PersonRegistry_CreditCardInfoImpl <em>Person Registry Credit Card Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.PersonRegistry.impl.PersonRegistry_CreditCardInfoImpl
		 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry_CreditCardInfo()
		 * @generated
		 */
		EClass PERSON_REGISTRY_CREDIT_CARD_INFO = eINSTANCE.getPersonRegistry_CreditCardInfo();

		/**
		 * The meta object literal for the '{@link Classes.PersonRegistry.ICreditCardInfo <em>ICredit Card Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.PersonRegistry.ICreditCardInfo
		 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getICreditCardInfo()
		 * @generated
		 */
		EClass ICREDIT_CARD_INFO = eINSTANCE.getICreditCardInfo();

		/**
		 * The meta object literal for the '<em><b>Get CCV</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICREDIT_CARD_INFO___GET_CCV = eINSTANCE.getICreditCardInfo__GetCCV();

		/**
		 * The meta object literal for the '<em><b>Get Month</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICREDIT_CARD_INFO___GET_MONTH = eINSTANCE.getICreditCardInfo__GetMonth();

		/**
		 * The meta object literal for the '<em><b>Get Year</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICREDIT_CARD_INFO___GET_YEAR = eINSTANCE.getICreditCardInfo__GetYear();

		/**
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICREDIT_CARD_INFO___GET_NUMBER = eINSTANCE.getICreditCardInfo__GetNumber();

		/**
		 * The meta object literal for the '<em><b>Get First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICREDIT_CARD_INFO___GET_FIRST_NAME = eINSTANCE.getICreditCardInfo__GetFirstName();

		/**
		 * The meta object literal for the '<em><b>Get Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICREDIT_CARD_INFO___GET_LAST_NAME = eINSTANCE.getICreditCardInfo__GetLastName();

		/**
		 * The meta object literal for the '{@link Classes.PersonRegistry.impl.PersonRegistry_PersonImpl <em>Person Registry Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.PersonRegistry.impl.PersonRegistry_PersonImpl
		 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry_Person()
		 * @generated
		 */
		EClass PERSON_REGISTRY_PERSON = eINSTANCE.getPersonRegistry_Person();

		/**
		 * The meta object literal for the '<em><b>Credit Card Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO = eINSTANCE.getPersonRegistry_Person_CreditCardInfo();

		/**
		 * The meta object literal for the '{@link Classes.PersonRegistry.IPerson <em>IPerson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.PersonRegistry.IPerson
		 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getIPerson()
		 * @generated
		 */
		EClass IPERSON = eINSTANCE.getIPerson();

		/**
		 * The meta object literal for the '<em><b>Get Birth Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___GET_BIRTH_DATE = eINSTANCE.getIPerson__GetBirthDate();

		/**
		 * The meta object literal for the '<em><b>Get First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___GET_FIRST_NAME = eINSTANCE.getIPerson__GetFirstName();

		/**
		 * The meta object literal for the '<em><b>Get Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___GET_LAST_NAME = eINSTANCE.getIPerson__GetLastName();

		/**
		 * The meta object literal for the '<em><b>Get SSN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___GET_SSN = eINSTANCE.getIPerson__GetSSN();

		/**
		 * The meta object literal for the '<em><b>Get Register Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___GET_REGISTER_DATE = eINSTANCE.getIPerson__GetRegisterDate();

		/**
		 * The meta object literal for the '<em><b>Get Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___GET_CREDIT_CARD = eINSTANCE.getIPerson__GetCreditCard();

		/**
		 * The meta object literal for the '<em><b>Create Credit Card Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___CREATE_CREDIT_CARD_INFO = eINSTANCE.getIPerson__CreateCreditCardInfo();

		/**
		 * The meta object literal for the '<em><b>Remove Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___REMOVE_CREDIT_CARD = eINSTANCE.getIPerson__RemoveCreditCard();

		/**
		 * The meta object literal for the '<em><b>Create Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___CREATE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIPerson__CreateCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___GET_ID = eINSTANCE.getIPerson__GetId();

		/**
		 * The meta object literal for the '<em><b>Set First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___SET_FIRST_NAME__STRING = eINSTANCE.getIPerson__SetFirstName__String();

		/**
		 * The meta object literal for the '<em><b>Set Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___SET_LAST_NAME__STRING = eINSTANCE.getIPerson__SetLastName__String();

		/**
		 * The meta object literal for the '<em><b>Set SSN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON___SET_SSN__STRING = eINSTANCE.getIPerson__SetSSN__String();

		/**
		 * The meta object literal for the '{@link Classes.PersonRegistry.impl.PersonRegistry_BlacklistImpl <em>Person Registry Blacklist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.PersonRegistry.impl.PersonRegistry_BlacklistImpl
		 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry_Blacklist()
		 * @generated
		 */
		EClass PERSON_REGISTRY_BLACKLIST = eINSTANCE.getPersonRegistry_Blacklist();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_REGISTRY_BLACKLIST__PERSON = eINSTANCE.getPersonRegistry_Blacklist_Person();

		/**
		 * The meta object literal for the '<em><b>Is Blacklisted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON_REGISTRY_BLACKLIST___IS_BLACKLISTED__PERSONREGISTRY_PERSON = eINSTANCE.getPersonRegistry_Blacklist__IsBlacklisted__PersonRegistry_Person();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON_REGISTRY_BLACKLIST___ADD__PERSONREGISTRY_PERSON = eINSTANCE.getPersonRegistry_Blacklist__Add__PersonRegistry_Person();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON_REGISTRY_BLACKLIST___REMOVE__PERSONREGISTRY_PERSON = eINSTANCE.getPersonRegistry_Blacklist__Remove__PersonRegistry_Person();

		/**
		 * The meta object literal for the '<em><b>Get People</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON_REGISTRY_BLACKLIST___GET_PEOPLE = eINSTANCE.getPersonRegistry_Blacklist__GetPeople();

		/**
		 * The meta object literal for the '{@link Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl <em>Person Registry Person Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl
		 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getPersonRegistry_PersonRegistry()
		 * @generated
		 */
		EClass PERSON_REGISTRY_PERSON_REGISTRY = eINSTANCE.getPersonRegistry_PersonRegistry();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_REGISTRY_PERSON_REGISTRY__PERSON = eINSTANCE.getPersonRegistry_PersonRegistry_Person();

		/**
		 * The meta object literal for the '<em><b>Blacklist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST = eINSTANCE.getPersonRegistry_PersonRegistry_Blacklist();

		/**
		 * The meta object literal for the '{@link Classes.PersonRegistry.IPersonRegistry <em>IPerson Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.PersonRegistry.IPersonRegistry
		 * @see Classes.PersonRegistry.impl.PersonRegistryPackageImpl#getIPersonRegistry()
		 * @generated
		 */
		EClass IPERSON_REGISTRY = eINSTANCE.getIPersonRegistry();

		/**
		 * The meta object literal for the '<em><b>Is Blacklisted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON_REGISTRY___IS_BLACKLISTED__INT = eINSTANCE.getIPersonRegistry__IsBlacklisted__int();

		/**
		 * The meta object literal for the '<em><b>Create Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON_REGISTRY___CREATE_PERSON__LONG = eINSTANCE.getIPersonRegistry__CreatePerson__long();

		/**
		 * The meta object literal for the '<em><b>Get People</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON_REGISTRY___GET_PEOPLE = eINSTANCE.getIPersonRegistry__GetPeople();

		/**
		 * The meta object literal for the '<em><b>Add To Blacklist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON_REGISTRY___ADD_TO_BLACKLIST__INT = eINSTANCE.getIPersonRegistry__AddToBlacklist__int();

		/**
		 * The meta object literal for the '<em><b>Remove From Blacklist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON_REGISTRY___REMOVE_FROM_BLACKLIST__INT = eINSTANCE.getIPersonRegistry__RemoveFromBlacklist__int();

		/**
		 * The meta object literal for the '<em><b>Get Person By ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON_REGISTRY___GET_PERSON_BY_ID__INT = eINSTANCE.getIPersonRegistry__GetPersonByID__int();

		/**
		 * The meta object literal for the '<em><b>Get Person By SSN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPERSON_REGISTRY___GET_PERSON_BY_SSN__STRING = eINSTANCE.getIPersonRegistry__GetPersonBySSN__String();

	}

} //PersonRegistryPackage
