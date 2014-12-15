/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EObject;

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
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model orderRequestRequired="true" orderRequestOrdered="false"
	 * @generated
	 */
	void placeOrder(OrderRequest orderRequest);

} // IOrdering
