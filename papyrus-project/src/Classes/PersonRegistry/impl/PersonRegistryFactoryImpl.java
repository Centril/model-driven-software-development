/**
 */
package Classes.PersonRegistry.impl;

import Classes.PersonRegistry.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonRegistryFactoryImpl extends EFactoryImpl implements PersonRegistryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonRegistryFactory init() {
		try {
			PersonRegistryFactory thePersonRegistryFactory = (PersonRegistryFactory)EPackage.Registry.INSTANCE.getEFactory(PersonRegistryPackage.eNS_URI);
			if (thePersonRegistryFactory != null) {
				return thePersonRegistryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PersonRegistryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PersonRegistryPackage.PERSON_REGISTRY: return createPersonRegistry();
			case PersonRegistryPackage.PERSON_REGISTRY_CREDIT_CARD_INFO: return createPersonRegistry_CreditCardInfo();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON: return createPersonRegistry_Person();
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST: return createPersonRegistry_Blacklist();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY: return createPersonRegistry_PersonRegistry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry createPersonRegistry() {
		PersonRegistryImpl personRegistry = new PersonRegistryImpl();
		return personRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry_CreditCardInfo createPersonRegistry_CreditCardInfo() {
		PersonRegistry_CreditCardInfoImpl personRegistry_CreditCardInfo = new PersonRegistry_CreditCardInfoImpl();
		return personRegistry_CreditCardInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry_Person createPersonRegistry_Person() {
		PersonRegistry_PersonImpl personRegistry_Person = new PersonRegistry_PersonImpl();
		return personRegistry_Person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry_Blacklist createPersonRegistry_Blacklist() {
		PersonRegistry_BlacklistImpl personRegistry_Blacklist = new PersonRegistry_BlacklistImpl();
		return personRegistry_Blacklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry_PersonRegistry createPersonRegistry_PersonRegistry() {
		PersonRegistry_PersonRegistryImpl personRegistry_PersonRegistry = new PersonRegistry_PersonRegistryImpl();
		return personRegistry_PersonRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistryPackage getPersonRegistryPackage() {
		return (PersonRegistryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersonRegistryPackage getPackage() {
		return PersonRegistryPackage.eINSTANCE;
	}

} //PersonRegistryFactoryImpl
