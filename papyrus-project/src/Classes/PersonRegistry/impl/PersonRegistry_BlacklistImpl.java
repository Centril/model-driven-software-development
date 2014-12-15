/**
 */
package Classes.PersonRegistry.impl;

import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.PersonRegistryPackage;
import Classes.PersonRegistry.PersonRegistry_Blacklist;
import Classes.PersonRegistry.PersonRegistry_Person;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

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
 *   <li>{@link Classes.PersonRegistry.impl.PersonRegistry_BlacklistImpl#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonRegistry_BlacklistImpl extends MinimalEObjectImpl.Container implements PersonRegistry_Blacklist {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonRegistry_BlacklistImpl() {
		super();
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
	 * @generated
	 */
	public EList<PersonRegistry_Person> getPerson() {
		if (person == null) {
			person = new EObjectResolvingEList<PersonRegistry_Person>(PersonRegistry_Person.class, this, PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlacklisted(PersonRegistry_Person person) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(PersonRegistry_Person person) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(PersonRegistry_Person person) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPerson getPeople() {
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
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PERSON:
				return getPerson();
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
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonRegistry_Person>)newValue);
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
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PERSON:
				getPerson().clear();
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
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST__PERSON:
				return person != null && !person.isEmpty();
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
				add((PersonRegistry_Person)arguments.get(0));
				return null;
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST___REMOVE__PERSONREGISTRY_PERSON:
				remove((PersonRegistry_Person)arguments.get(0));
				return null;
			case PersonRegistryPackage.PERSON_REGISTRY_BLACKLIST___GET_PEOPLE:
				return getPeople();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PersonRegistry_BlacklistImpl
