/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_OccupancyService;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Occupancy Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Hotel_OccupancyServiceImpl extends MinimalEObjectImpl.Container implements Hotel_OccupancyService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_OccupancyServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_OCCUPANCY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Occupancy> getAllOccupancies() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelPackage.HOTEL_OCCUPANCY_SERVICE___GET_ALL_OCCUPANCIES:
				return getAllOccupancies();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_OccupancyServiceImpl
