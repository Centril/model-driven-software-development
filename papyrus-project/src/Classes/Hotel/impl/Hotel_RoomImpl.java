/**
 */
package Classes.Hotel.impl;

import Classes.Hotel.HotelPackage;
import Classes.Hotel.Hotel_Room;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Hotel_RoomImpl extends MinimalEObjectImpl.Container implements Hotel_Room {
	
	private int roomId; //Unique for every room.
	private int nbrOfBeds;
	private double basePrice; //Standard price for one night
	private static int IDCounter = 0; 
	
	/**
	 * Creates a room with a unique ID.
	 * @generated NOT
	 */
	protected Hotel_RoomImpl() {
		this.nbrOfBeds = 1;
		this.basePrice = 100;
		IDCounter += 1;
		roomId = IDCounter;
		
	}
	
	/**
	 * Creates a room with a unique ID 
	 * given the number of beds and 
	 * the price of the room for one night.
	 * @param nbrOfBeds, number of beds in the room.
	 * @param basePrice, the price of the room for one night. 
	 */
	protected Hotel_RoomImpl(int nbrOfBeds, int basePrice) {
		this.nbrOfBeds = nbrOfBeds;
		this.basePrice = basePrice;
		IDCounter += 1;
		roomId = IDCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.HOTEL_ROOM;
	}

	/**
	 * Method returns the unique ID of the room.
	 * @generated NOT
	 */
	public int getId() {
		return roomId;
	}

	/**
	 * Method returns the number of beds in the room.
	 * @generated NOT
	 */
	public int getNumBeds() {
		return nbrOfBeds;
	}

	/**
	 * Method returns the price of the room for one night.
	 * @generated NOT
	 */
	public double getPrice() {
		return basePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumBeds(int numBeds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String name) {
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
			case HotelPackage.HOTEL_ROOM___GET_ID:
				return getId();
			case HotelPackage.HOTEL_ROOM___GET_NUM_BEDS:
				return getNumBeds();
			case HotelPackage.HOTEL_ROOM___GET_PRICE:
				return getPrice();
			case HotelPackage.HOTEL_ROOM___SET_ID__INT:
				setId((Integer)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_ROOM___SET_NUM_BEDS__INT:
				setNumBeds((Integer)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_ROOM___SET_PRICE__DOUBLE:
				setPrice((Double)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_ROOM___GET_NAME:
				return getName();
			case HotelPackage.HOTEL_ROOM___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Hotel_RoomImpl
