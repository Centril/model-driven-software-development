/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_Stay;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Stay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Hotel.impl.Hotel_StayImpl#getOccupancy <em>Occupancy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hotel_StayImpl extends MinimalEObjectImpl.Container implements Hotel_Stay {
	/**
	 * The cached value of the '{@link #getOccupancy() <em>Occupancy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancy()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Occupancy> occupancy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_StayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_STAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Occupancy> getOccupancy() {
		if (occupancy == null) {
			occupancy = new EObjectResolvingEList<Hotel_Occupancy>(Hotel_Occupancy.class, this, HotelPackage.HOTEL_STAY__OCCUPANCY);
		}
		return occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.HOTEL_STAY__OCCUPANCY:
				return getOccupancy();
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
			case HotelPackage.HOTEL_STAY__OCCUPANCY:
				getOccupancy().clear();
				getOccupancy().addAll((Collection<? extends Hotel_Occupancy>)newValue);
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
			case HotelPackage.HOTEL_STAY__OCCUPANCY:
				getOccupancy().clear();
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
			case HotelPackage.HOTEL_STAY__OCCUPANCY:
				return occupancy != null && !occupancy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Hotel_StayImpl
