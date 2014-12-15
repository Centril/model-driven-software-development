/**
 */
package Classes.Hotel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISearch Result</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Hotel.HotelPackage#getISearchResult()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISearchResult extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	IBookingSuggestion getBookingSuggestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

} // ISearchResult
