/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Hotel.HotelPackage#getIRoom()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoom extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getNumBeds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true" idOrdered="false"
	 * @generated
	 */
	void setId(int id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numBedsRequired="true" numBedsOrdered="false"
	 * @generated
	 */
	void setNumBeds(int numBeds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void setPrice(double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void setName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRoomInfo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model outOfOrderRequired="true" outOfOrderOrdered="false"
	 * @generated
	 */
	void setIsOutOfOrder(boolean outOfOrder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model infoDataType="org.eclipse.uml2.types.String" infoRequired="true" infoOrdered="false"
	 * @generated
	 */
	void setRoomInfo(String info);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isOutOfOrder();

} // IRoom
