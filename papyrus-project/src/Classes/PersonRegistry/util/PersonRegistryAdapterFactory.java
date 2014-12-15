/**
 */
package Classes.PersonRegistry.util;

import Classes.PersonRegistry.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.PersonRegistry.PersonRegistryPackage
 * @generated
 */
public class PersonRegistryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersonRegistryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRegistryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PersonRegistryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonRegistrySwitch<Adapter> modelSwitch =
		new PersonRegistrySwitch<Adapter>() {
			@Override
			public Adapter casePersonRegistry(PersonRegistry object) {
				return createPersonRegistryAdapter();
			}
			@Override
			public Adapter casePersonRegistry_CreditCardInfo(PersonRegistry_CreditCardInfo object) {
				return createPersonRegistry_CreditCardInfoAdapter();
			}
			@Override
			public Adapter caseICreditCardInfo(ICreditCardInfo object) {
				return createICreditCardInfoAdapter();
			}
			@Override
			public Adapter casePersonRegistry_Person(PersonRegistry_Person object) {
				return createPersonRegistry_PersonAdapter();
			}
			@Override
			public Adapter caseIPerson(IPerson object) {
				return createIPersonAdapter();
			}
			@Override
			public Adapter casePersonRegistry_Blacklist(PersonRegistry_Blacklist object) {
				return createPersonRegistry_BlacklistAdapter();
			}
			@Override
			public Adapter casePersonRegistry_PersonRegistry(PersonRegistry_PersonRegistry object) {
				return createPersonRegistry_PersonRegistryAdapter();
			}
			@Override
			public Adapter caseIPersonRegistry(IPersonRegistry object) {
				return createIPersonRegistryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Classes.PersonRegistry.PersonRegistry <em>Person Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PersonRegistry.PersonRegistry
	 * @generated
	 */
	public Adapter createPersonRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.PersonRegistry.PersonRegistry_CreditCardInfo <em>Person Registry Credit Card Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PersonRegistry.PersonRegistry_CreditCardInfo
	 * @generated
	 */
	public Adapter createPersonRegistry_CreditCardInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.PersonRegistry.ICreditCardInfo <em>ICredit Card Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PersonRegistry.ICreditCardInfo
	 * @generated
	 */
	public Adapter createICreditCardInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.PersonRegistry.PersonRegistry_Person <em>Person Registry Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PersonRegistry.PersonRegistry_Person
	 * @generated
	 */
	public Adapter createPersonRegistry_PersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.PersonRegistry.IPerson <em>IPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PersonRegistry.IPerson
	 * @generated
	 */
	public Adapter createIPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.PersonRegistry.PersonRegistry_Blacklist <em>Person Registry Blacklist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PersonRegistry.PersonRegistry_Blacklist
	 * @generated
	 */
	public Adapter createPersonRegistry_BlacklistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.PersonRegistry.PersonRegistry_PersonRegistry <em>Person Registry Person Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PersonRegistry.PersonRegistry_PersonRegistry
	 * @generated
	 */
	public Adapter createPersonRegistry_PersonRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.PersonRegistry.IPersonRegistry <em>IPerson Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PersonRegistry.IPersonRegistry
	 * @generated
	 */
	public Adapter createIPersonRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PersonRegistryAdapterFactory
