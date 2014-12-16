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
	private String roomName;
	private String roomInfo;
	private boolean isOutOfService; //True is the room is out of service
	
	/**
	 * Creates a room 
	 * Doesn't get a unique ID.
	 * Will have default values for number of beds and price.
	 * @generated NOT
	 */
	protected Hotel_RoomImpl() {
		this.nbrOfBeds = 1;
		this.basePrice = 100;
		this.isOutOfService = false;
		
		this.roomInfo = "";
	
	}
	
	/**
	 * Creates given a unique id, the number of beds and 
	 * the price of the room for one night.
	 * @param nbrOfBeds, number of beds in the room.
	 * @param basePrice, the price of the room for one night. 
	 * @param roomId, Id of the room.
	 */
	protected Hotel_RoomImpl(int nbrOfBeds, int basePrice, int roomId, String roomInfo) {
		this.nbrOfBeds = nbrOfBeds;
		this.basePrice = basePrice;
		this.roomId = roomId;
		this.isOutOfService = false;
		
		if(roomInfo == null)
			this.roomInfo = "";
		else
		this.roomInfo = roomInfo;
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
	 * Sets the unique id of the room.
	 * @generated NOT
	 */
	public void setId(int id) {
		this.roomId = id;
	}

	/**
	 * Method for setting the number of beds of the room.
	 * @generated NOT
	 */
	public void setNumBeds(int numBeds) {
		this.nbrOfBeds = numBeds;
	}

	/**
	 * Method for setting the price of the room for one night.
	 * @generated NOT
	 */
	public void setPrice(double price) {
		this.basePrice = price;
	}

	/**
	 * Returns the name of the room.
	 * @generated NOT
	 */
	public String getName() {
		return roomName;
	}

	/**
	 * Method for setting the name of the room.
	 * @generated NOT
	 */
	public void setName(String name) {
		this.roomName = name;
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
