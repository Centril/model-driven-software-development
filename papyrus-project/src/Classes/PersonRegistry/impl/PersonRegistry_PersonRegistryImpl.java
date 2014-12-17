/**
 */
package Classes.PersonRegistry.impl;

import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.PersonRegistryPackage;
import Classes.PersonRegistry.PersonRegistry_Blacklist;
import Classes.PersonRegistry.PersonRegistry_Person;
import Classes.PersonRegistry.PersonRegistry_PersonRegistry;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Registry Person Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl#getPeople <em>People</em>}</li>
 *   <li>{@link Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl#getBlacklist <em>Blacklist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonRegistry_PersonRegistryImpl extends MinimalEObjectImpl.Container implements PersonRegistry_PersonRegistry {
	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonRegistry_Person> people;

	/**
	 * The cached value of the '{@link #getBlacklist() <em>Blacklist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlacklist()
	 * @generated
	 * @ordered
	 */
	protected PersonRegistry_Blacklist blacklist;

	private void init() {
		people = new BasicEList<PersonRegistry_Person>();
		blacklist = new PersonRegistry_BlacklistImpl();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PersonRegistry_PersonRegistryImpl() {
		super();
		
		init();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonRegistryPackage.Literals.PERSON_REGISTRY_PERSON_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonRegistry_Person> getPeople() {
		if (people == null) {
			people = new EObjectResolvingEList<PersonRegistry_Person>(PersonRegistry_Person.class, this, PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PEOPLE);
		}
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry_Blacklist getBlacklist() {
		if (blacklist != null && blacklist.eIsProxy()) {
			InternalEObject oldBlacklist = (InternalEObject)blacklist;
			blacklist = (PersonRegistry_Blacklist)eResolveProxy(oldBlacklist);
			if (blacklist != oldBlacklist) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST, oldBlacklist, blacklist));
			}
		}
		return blacklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistry_Blacklist basicGetBlacklist() {
		return blacklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlacklist(PersonRegistry_Blacklist newBlacklist) {
		PersonRegistry_Blacklist oldBlacklist = blacklist;
		blacklist = newBlacklist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST, oldBlacklist, blacklist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isBlacklisted(int personID) {
		for (PersonRegistry_Person person : people) {
			if (person.getId() == personID) {
				return blacklist.isBlacklisted(person);
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IPerson createPerson(long birthDate) {
		int id = 0; // TODO: Get unique ID somehow, maybe add PersonService.createPerson()
		long now = System.currentTimeMillis();
		PersonRegistry_Person person = new PersonRegistry_PersonImpl(id, birthDate, now);
		this.people.add(person);
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IPerson> getIPeople() {
		return new BasicEList<IPerson>(people);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addToBlacklist(int personID) {
		for (PersonRegistry_Person person : people) {
			if (person.getId() == personID) {
				return blacklist.add(person);
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeFromBlacklist(int personID) {
		for (PersonRegistry_Person person : people) {
			if (person.getId() == personID) {
				return blacklist.remove(person);
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IPerson getIPersonByID(int personID) {
		for (PersonRegistry_Person person : people) {
			if (person.getId() == personID) {
				return person;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IPerson getIPersonBySSN(String ssn) {
		for (PersonRegistry_Person person : people) {
			if (person.getSSN() == ssn) {
				return person;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PEOPLE:
				return getPeople();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST:
				if (resolve) return getBlacklist();
				return basicGetBlacklist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends PersonRegistry_Person>)newValue);
				return;
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST:
				setBlacklist((PersonRegistry_Blacklist)newValue);
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
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PEOPLE:
				getPeople().clear();
				return;
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST:
				setBlacklist((PersonRegistry_Blacklist)null);
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
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PEOPLE:
				return people != null && !people.isEmpty();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__BLACKLIST:
				return blacklist != null;
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
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___IS_BLACKLISTED__INT:
				return isBlacklisted((Integer)arguments.get(0));
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___CREATE_PERSON__LONG:
				return createPerson((Long)arguments.get(0));
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___GET_IPEOPLE:
				return getIPeople();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___ADD_TO_BLACKLIST__INT:
				return addToBlacklist((Integer)arguments.get(0));
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___REMOVE_FROM_BLACKLIST__INT:
				return removeFromBlacklist((Integer)arguments.get(0));
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___GET_IPERSON_BY_ID__INT:
				return getIPersonByID((Integer)arguments.get(0));
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___GET_IPERSON_BY_SSN__STRING:
				return getIPersonBySSN((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PersonRegistry_PersonRegistryImpl
