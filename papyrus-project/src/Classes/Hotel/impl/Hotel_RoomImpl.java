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
	private boolean OutOfOrder; //True is the room is out of service
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Hotel_RoomImpl() {
		super();
		throw new UnsupportedOperationException("Can't create room without parameters");
	
	}
	
	/**
	 * Creates given a unique id, the number of beds and 
	 * the price of the room for one night.
	 * @param nbrOfBeds, number of beds in the room.
	 * @param basePrice, the price of the room for one night. 
	 * @param roomId, Id of the room.
	 */
	protected Hotel_RoomImpl(int nbrOfBeds, double basePrice) {
		if (nbrOfBeds < 0) {
			throw new IllegalArgumentException("nbrOfBeds can't be negative");
		}
		if (basePrice < 0) {
			throw new IllegalArgumentException("basePrice can't be negative");
		}
		
		this.nbrOfBeds = nbrOfBeds;
		this.basePrice = basePrice;
		this.roomId = -1;
		this.OutOfOrder = false;
		this.roomInfo = "";
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
	 * Returns an informative text about the room.
	 * Might be empty.
	 * @generated NOT
	 */
	public String getRoomInfo() {
		return roomInfo;
	}

	/**
	 * Set the room to be out of order of not.
	 * @param outOfOrder, True is the room is out of order, 
	 * false otherwise.
	 * @generated NOT
	 */
	public void setIsOutOfOrder(boolean outOfOrder) {
		this.OutOfOrder = outOfOrder;
	}

	/**
	 * Methods sets the information of the room 
	 * given a string.
	 * @param info, the information of the room. 
	 * @generated NOT
	 */
	public void setRoomInfo(String info) {
		if (info == null)
			this.roomInfo = "";
		else
			this.roomInfo = info;
	}

	/**
	 * Returns weather or not the room is out of order.
	 * @generated NOT
	 */
	public boolean isOutOfOrder() {
		return OutOfOrder;
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
			case HotelPackage.HOTEL_ROOM___GET_ROOM_INFO:
				return getRoomInfo();
			case HotelPackage.HOTEL_ROOM___SET_IS_OUT_OF_ORDER__BOOLEAN:
				setIsOutOfOrder((Boolean)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_ROOM___SET_ROOM_INFO__STRING:
				setRoomInfo((String)arguments.get(0));
				return null;
			case HotelPackage.HOTEL_ROOM___IS_OUT_OF_ORDER:
				return isOutOfOrder();
			case HotelPackage.HOTEL_ROOM___SET_ID__INT:
				setId((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Room[");
		
		sb.append("id=");
		sb.append(getId());
		
		sb.append(", beds=");
		sb.append(getNumBeds());

		sb.append(", price=");
		sb.append(getPrice());
		
		sb.append(", isOutOfOrder=");
		sb.append(isOutOfOrder());
		
		if (getName() != null && getName() != "") {
			sb.append(", name=\"");
			sb.append(getName());
			sb.append("\"");
		}
		
		if (getRoomInfo() != null && getRoomInfo() != "") {
			sb.append(", info=\"");
			sb.append(getRoomInfo());
			sb.append("\"");
		}

		sb.append("]");
		
		return sb.toString();
	}

} //Hotel_RoomImpl
