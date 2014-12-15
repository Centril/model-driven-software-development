/**
 */
package Classes.PersonRegistry.impl;

import Classes.Hotel.HotelPackage;

import Classes.Hotel.impl.HotelPackageImpl;

import Classes.PersonRegistry.ICreditCardInfo;
import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;
import Classes.PersonRegistry.PersonRegistry;
import Classes.PersonRegistry.PersonRegistryFactory;
import Classes.PersonRegistry.PersonRegistryPackage;
import Classes.PersonRegistry.PersonRegistry_Blacklist;
import Classes.PersonRegistry.PersonRegistry_CreditCardInfo;
import Classes.PersonRegistry.PersonRegistry_Person;
import Classes.PersonRegistry.PersonRegistry_PersonRegistry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonRegistryPackageImpl extends EPackageImpl implements PersonRegistryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personRegistry_CreditCardInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCreditCardInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personRegistry_PersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personRegistry_BlacklistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personRegistry_PersonRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPersonRegistryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Classes.PersonRegistry.PersonRegistryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersonRegistryPackageImpl() {
		super(eNS_URI, PersonRegistryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PersonRegistryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersonRegistryPackage init() {
		if (isInited) return (PersonRegistryPackage)EPackage.Registry.INSTANCE.getEPackage(PersonRegistryPackage.eNS_URI);

		// Obtain or create and register package
		PersonRegistryPackageImpl thePersonRegistryPackage = (PersonRegistryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PersonRegistryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PersonRegistryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelPackage.eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelPackage.eNS_URI) : HotelPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		thePersonRegistryPackage.createPackageContents();
		theHotelPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		thePersonRegistryPackage.initializePackageContents();
		theHotelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePersonRegistryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersonRegistryPackage.eNS_URI, thePersonRegistryPackage);
		return thePersonRegistryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonRegistry() {
		return personRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonRegistry_CreditCardInfo() {
		return personRegistry_CreditCardInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICreditCardInfo() {
		return iCreditCardInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICreditCardInfo__GetCCV() {
		return iCreditCardInfoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICreditCardInfo__GetMonth() {
		return iCreditCardInfoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICreditCardInfo__GetYear() {
		return iCreditCardInfoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICreditCardInfo__GetNumber() {
		return iCreditCardInfoEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICreditCardInfo__GetCardHolder() {
		return iCreditCardInfoEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonRegistry_Person() {
		return personRegistry_PersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonRegistry_Person_CreditCardInfo() {
		return (EReference)personRegistry_PersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPerson() {
		return iPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__GetBirthDate() {
		return iPersonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__GetFirstName() {
		return iPersonEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__GetLastName() {
		return iPersonEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__GetSSN() {
		return iPersonEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__GetRegisterDate() {
		return iPersonEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__GetCreditCard() {
		return iPersonEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__CreateCreditCardInfo() {
		return iPersonEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__RemoveCreditCard() {
		return iPersonEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__CreateCreditCard__String_String_int_int_String() {
		return iPersonEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__GetId() {
		return iPersonEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__SetFirstName() {
		return iPersonEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__SetLastName() {
		return iPersonEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPerson__SetSSN() {
		return iPersonEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonRegistry_Blacklist() {
		return personRegistry_BlacklistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonRegistry_Blacklist_Person() {
		return (EReference)personRegistry_BlacklistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonRegistry_Blacklist__IsBlacklisted__PersonRegistry_Person() {
		return personRegistry_BlacklistEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonRegistry_Blacklist__Add__PersonRegistry_Person() {
		return personRegistry_BlacklistEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonRegistry_Blacklist__Remove__PersonRegistry_Person() {
		return personRegistry_BlacklistEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonRegistry_Blacklist__GetPeople() {
		return personRegistry_BlacklistEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonRegistry_PersonRegistry() {
		return personRegistry_PersonRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonRegistry_PersonRegistry_Person() {
		return (EReference)personRegistry_PersonRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonRegistry_PersonRegistry_Blacklist() {
		return (EReference)personRegistry_PersonRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPersonRegistry() {
		return iPersonRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersonRegistry__IsBlacklisted__IPerson() {
		return iPersonRegistryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersonRegistry__CreatePerson__long() {
		return iPersonRegistryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersonRegistry__GetPeople() {
		return iPersonRegistryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersonRegistry__AddToBlacklist__IPerson() {
		return iPersonRegistryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPersonRegistry__RemoveFromBlacklist__IPerson() {
		return iPersonRegistryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistryFactory getPersonRegistryFactory() {
		return (PersonRegistryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personRegistryEClass = createEClass(PERSON_REGISTRY);

		personRegistry_CreditCardInfoEClass = createEClass(PERSON_REGISTRY_CREDIT_CARD_INFO);

		iCreditCardInfoEClass = createEClass(ICREDIT_CARD_INFO);
		createEOperation(iCreditCardInfoEClass, ICREDIT_CARD_INFO___GET_CCV);
		createEOperation(iCreditCardInfoEClass, ICREDIT_CARD_INFO___GET_MONTH);
		createEOperation(iCreditCardInfoEClass, ICREDIT_CARD_INFO___GET_YEAR);
		createEOperation(iCreditCardInfoEClass, ICREDIT_CARD_INFO___GET_NUMBER);
		createEOperation(iCreditCardInfoEClass, ICREDIT_CARD_INFO___GET_CARD_HOLDER);

		personRegistry_PersonEClass = createEClass(PERSON_REGISTRY_PERSON);
		createEReference(personRegistry_PersonEClass, PERSON_REGISTRY_PERSON__CREDIT_CARD_INFO);

		iPersonEClass = createEClass(IPERSON);
		createEOperation(iPersonEClass, IPERSON___GET_BIRTH_DATE);
		createEOperation(iPersonEClass, IPERSON___GET_FIRST_NAME);
		createEOperation(iPersonEClass, IPERSON___GET_LAST_NAME);
		createEOperation(iPersonEClass, IPERSON___GET_SSN);
		createEOperation(iPersonEClass, IPERSON___GET_REGISTER_DATE);
		createEOperation(iPersonEClass, IPERSON___GET_CREDIT_CARD);
		createEOperation(iPersonEClass, IPERSON___CREATE_CREDIT_CARD_INFO);
		createEOperation(iPersonEClass, IPERSON___REMOVE_CREDIT_CARD);
		createEOperation(iPersonEClass, IPERSON___CREATE_CREDIT_CARD__STRING_STRING_INT_INT_STRING);
		createEOperation(iPersonEClass, IPERSON___GET_ID);
		createEOperation(iPersonEClass, IPERSON___SET_FIRST_NAME);
		createEOperation(iPersonEClass, IPERSON___SET_LAST_NAME);
		createEOperation(iPersonEClass, IPERSON___SET_SSN);

		personRegistry_BlacklistEClass = createEClass(PERSON_REGISTRY_BLACKLIST);
		createEReference(personRegistry_BlacklistEClass, PERSON_REGISTRY_BLACKLIST__PERSON);
		createEOperation(personRegistry_BlacklistEClass, PERSON_REGISTRY_BLACKLIST___IS_BLACKLISTED__PERSONREGISTRY_PERSON);
		createEOperation(personRegistry_BlacklistEClass, PERSON_REGISTRY_BLACKLIST___ADD__PERSONREGISTRY_PERSON);
		createEOperation(personRegistry_BlacklistEClass, PERSON_REGISTRY_BLACKLIST___REMOVE__PERSONREGISTRY_PERSON);
		createEOperation(personRegistry_BlacklistEClass, PERSON_REGISTRY_BLACKLIST___GET_PEOPLE);

		personRegistry_PersonRegistryEClass = createEClass(PERSON_REGISTRY_PERSON_REGISTRY);
		createEReference(personRegistry_PersonRegistryEClass, PERSON_REGISTRY_PERSON_REGISTRY__PERSON);
		createEReference(personRegistry_PersonRegistryEClass, PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST);

		iPersonRegistryEClass = createEClass(IPERSON_REGISTRY);
		createEOperation(iPersonRegistryEClass, IPERSON_REGISTRY___IS_BLACKLISTED__IPERSON);
		createEOperation(iPersonRegistryEClass, IPERSON_REGISTRY___CREATE_PERSON__LONG);
		createEOperation(iPersonRegistryEClass, IPERSON_REGISTRY___GET_PEOPLE);
		createEOperation(iPersonRegistryEClass, IPERSON_REGISTRY___ADD_TO_BLACKLIST__IPERSON);
		createEOperation(iPersonRegistryEClass, IPERSON_REGISTRY___REMOVE_FROM_BLACKLIST__IPERSON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personRegistry_CreditCardInfoEClass.getESuperTypes().add(this.getICreditCardInfo());
		personRegistry_PersonEClass.getESuperTypes().add(this.getIPerson());
		personRegistry_PersonRegistryEClass.getESuperTypes().add(this.getIPersonRegistry());

		// Initialize classes, features, and operations; add parameters
		initEClass(personRegistryEClass, PersonRegistry.class, "PersonRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personRegistry_CreditCardInfoEClass, PersonRegistry_CreditCardInfo.class, "PersonRegistry_CreditCardInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iCreditCardInfoEClass, ICreditCardInfo.class, "ICreditCardInfo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getICreditCardInfo__GetCCV(), theTypesPackage.getString(), "getCCV", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICreditCardInfo__GetMonth(), ecorePackage.getEInt(), "getMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICreditCardInfo__GetYear(), ecorePackage.getEInt(), "getYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICreditCardInfo__GetNumber(), theTypesPackage.getString(), "getNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICreditCardInfo__GetCardHolder(), theTypesPackage.getString(), "getCardHolder", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(personRegistry_PersonEClass, PersonRegistry_Person.class, "PersonRegistry_Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonRegistry_Person_CreditCardInfo(), this.getPersonRegistry_CreditCardInfo(), null, "creditCardInfo", null, 0, 1, PersonRegistry_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iPersonEClass, IPerson.class, "IPerson", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIPerson__GetBirthDate(), ecorePackage.getELong(), "getBirthDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__GetFirstName(), theTypesPackage.getString(), "getFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__GetLastName(), theTypesPackage.getString(), "getLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__GetSSN(), theTypesPackage.getString(), "getSSN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__GetRegisterDate(), ecorePackage.getELong(), "getRegisterDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__GetCreditCard(), this.getICreditCardInfo(), "getCreditCard", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__CreateCreditCardInfo(), null, "createCreditCardInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__RemoveCreditCard(), null, "removeCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIPerson__CreateCreditCard__String_String_int_int_String(), null, "createCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "month", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "year", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "cardHolder", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__GetId(), ecorePackage.getEInt(), "getId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__SetFirstName(), theTypesPackage.getString(), "setFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__SetLastName(), theTypesPackage.getString(), "setLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPerson__SetSSN(), theTypesPackage.getString(), "setSSN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(personRegistry_BlacklistEClass, PersonRegistry_Blacklist.class, "PersonRegistry_Blacklist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonRegistry_Blacklist_Person(), this.getPersonRegistry_Person(), null, "person", null, 0, -1, PersonRegistry_Blacklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPersonRegistry_Blacklist__IsBlacklisted__PersonRegistry_Person(), ecorePackage.getEBoolean(), "isBlacklisted", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPersonRegistry_Person(), "person", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPersonRegistry_Blacklist__Add__PersonRegistry_Person(), null, "add", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPersonRegistry_Person(), "person", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPersonRegistry_Blacklist__Remove__PersonRegistry_Person(), null, "remove", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPersonRegistry_Person(), "person", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPersonRegistry_Blacklist__GetPeople(), this.getIPerson(), "getPeople", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(personRegistry_PersonRegistryEClass, PersonRegistry_PersonRegistry.class, "PersonRegistry_PersonRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonRegistry_PersonRegistry_Person(), this.getPersonRegistry_Person(), null, "person", null, 0, -1, PersonRegistry_PersonRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPersonRegistry_PersonRegistry_Blacklist(), this.getPersonRegistry_Blacklist(), null, "blacklist", null, 1, 1, PersonRegistry_PersonRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iPersonRegistryEClass, IPersonRegistry.class, "IPersonRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIPersonRegistry__IsBlacklisted__IPerson(), ecorePackage.getEBoolean(), "isBlacklisted", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIPerson(), "person", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIPersonRegistry__CreatePerson__long(), null, "createPerson", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "birthDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPersonRegistry__GetPeople(), this.getIPerson(), "getPeople", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIPersonRegistry__AddToBlacklist__IPerson(), null, "addToBlacklist", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIPerson(), "person", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIPersonRegistry__RemoveFromBlacklist__IPerson(), null, "removeFromBlacklist", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIPerson(), "person", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PersonRegistryPackageImpl
