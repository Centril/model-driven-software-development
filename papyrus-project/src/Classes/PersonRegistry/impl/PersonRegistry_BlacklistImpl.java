/**
 */
package Classes.PersonRegistry.impl;

import Classes.PersonRegistry.PersonRegistryPackage;
import Classes.PersonRegistry.PersonRegistry_Blacklist;
import Classes.PersonRegistry.PersonRegistry_Person;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Registry Blacklist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.PersonRegistry.impl.PersonRegistry_BlacklistImpl#getPeople <em>People</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonRegistry_BlacklistImpl extends MinimalEObjectImpl.Container implements PersonRegistry_Blacklist {
	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonRegistry_Person> people;
	private static PersonRegistry_Blacklist instance;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PersonRegistry_BlacklistImpl() {
		people = new BasicEList<PersonRegistry_Person>();
	}
	
	public static PersonRegistry_Blacklist getInstance(){
		if(instance == null)
			return new PersonRegistry_BlacklistImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonRegistryPackage.Literals.PERSON_REGISTRY_BLACKLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isBlacklisted(PersonRegistry_Person person) {
		return people.contains(person);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean add(PersonRegistry_Person person) {
		return people.add(person);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean remove(PersonRegistry_Person person) {
		return people.remove(person);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonRegistry_Person> getPeople() {
		if (people == null) {
			people = new EObjectResolvingEList<PersonRegistry_Person>(PersonRegistry_Person.class, this, PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PEOPLE);
		}
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PEOPLE:
				return getPeople();
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
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends PersonRegistry_Person>)newValue);
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
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PEOPLE:
				getPeople().clear();
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
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PEOPLE:
				return people != null && !people.isEmpty();
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
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST___IS_BLACKLISTED__PERSONREGISTRY_PERSON:
				return isBlacklisted((PersonRegistry_Person)arguments.get(0));
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST___ADD__PERSONREGISTRY_PERSON:
				return add((PersonRegistry_Person)arguments.get(0));
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST___REMOVE__PERSONREGISTRY_PERSON:
				return remove((PersonRegistry_Person)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PersonRegistry_BlacklistImpl
