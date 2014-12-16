/**
 */
package Classes.Hotel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Occupancy;
import Classes.Hotel.Hotel_OccupancyService;
import Classes.Hotel.Hotel_Room;

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
	
	private static EList<Hotel_Occupancy> occupancies;
	
	private static void init() {
		if (occupancies != null) {
			return;
		}
		
		Hotel_RoomServiceImpl roomService = new Hotel_RoomServiceImpl();
		
		occupancies = new BasicEList<Hotel_Occupancy>();
	
		Hotel_Occupancy occupancy = new Hotel_OccupancyImpl();
		
		Hotel_Room room = roomService.getRoomById(0);
		
		occupancy.setRoom(room);
		occupancy.setStartTime(0);
		occupancy.setEndTime(1);
		
		occupancies.add(occupancy);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Hotel_OccupancyServiceImpl() {
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
		return HotelPackage.Literals.HOTEL_OCCUPANCY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Hotel_Occupancy> getAllOccupancies() {
		return new BasicEList<Hotel_Occupancy>(occupancies);
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
