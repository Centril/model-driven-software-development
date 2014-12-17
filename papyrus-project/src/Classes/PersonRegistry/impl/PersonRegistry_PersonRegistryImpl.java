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
 *   <li>{@link Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link Classes.PersonRegistry.impl.PersonRegistry_PersonRegistryImpl#getBlacklist <em>Blacklist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonRegistry_PersonRegistryImpl extends MinimalEObjectImpl.Container implements PersonRegistry_PersonRegistry {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonRegistry_Person> person;

	/**
	 * The cached value of the '{@link #getBlacklist() <em>Blacklist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlacklist()
	 * @generated
	 * @ordered
	 */
	protected PersonRegistry_Blacklist blacklist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonRegistry_PersonRegistryImpl() {
		super();
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
	public EList<PersonRegistry_Person> getPerson() {
		if (person == null) {
			person = new EObjectResolvingEList<PersonRegistry_Person>(PersonRegistry_Person.class, this, PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PERSON);
		}
		return person;
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
	 * @generated
	 */
	public boolean isBlacklisted(IPerson person) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPerson(long birthDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IPerson> getPeople() {
		EList<IPerson> list = new BasicEList<>();
		for (PersonRegistry_Person p : person) {
			list.add(p);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addToBlacklist(IPerson person) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFromBlacklist(IPerson person) {
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
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PERSON:
				return getPerson();
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
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonRegistry_Person>)newValue);
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
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PERSON:
				getPerson().clear();
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
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY__PERSON:
				return person != null && !person.isEmpty();
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
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___IS_BLACKLISTED__IPERSON:
				return isBlacklisted((IPerson)arguments.get(0));
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___CREATE_PERSON__LONG:
				createPerson((Long)arguments.get(0));
				return null;
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___GET_PEOPLE:
				return getPeople();
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___ADD_TO_BLACKLIST__IPERSON:
				addToBlacklist((IPerson)arguments.get(0));
				return null;
			case PersonRegistryPackage.PERSON_REGISTRY_PERSON_REGISTRY___REMOVE_FROM_BLACKLIST__IPERSON:
				removeFromBlacklist((IPerson)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PersonRegistry_PersonRegistryImpl
