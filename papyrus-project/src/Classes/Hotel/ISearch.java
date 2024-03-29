/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import Classes.Hotel.impl.Hotel_HotelImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISearch</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Hotel.HotelPackage#getISearch()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISearch extends EObject {
	
	final ISearch instance = Hotel_HotelImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" startTimeRequired="true" startTimeOrdered="false" endTimeRequired="true" endTimeOrdered="false" numberOfPersonsRequired="true" numberOfPersonsOrdered="false"
	 * @generated
	 */
	EList<ISearchResult> search(long startTime, long endTime, int numberOfPersons);

} // ISearch
