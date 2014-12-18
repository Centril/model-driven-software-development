/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EObject;

import Classes.Hotel.impl.Hotel_HotelImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOrdering</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Hotel.HotelPackage#getIOrdering()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IOrdering extends EObject {
	
	IOrdering instance = Hotel_HotelImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" orderRequestRequired="true" orderRequestOrdered="false"
	 * @generated
	 */
	boolean placeOrder(OrderRequest orderRequest);

} // IOrdering
