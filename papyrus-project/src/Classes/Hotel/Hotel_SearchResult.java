/**
 */
package Classes.Hotel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Search Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Hotel.Hotel_SearchResult#getBookingSuggestion <em>Booking Suggestion</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Hotel.HotelPackage#getHotel_SearchResult()
 * @model
 * @generated
 */
public interface Hotel_SearchResult extends ISearchResult {
	/**
	 * Returns the value of the '<em><b>Booking Suggestion</b></em>' reference list.
	 * The list contents are of type {@link Classes.Hotel.Hotel_BookingSuggestion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Suggestion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Suggestion</em>' reference list.
	 * @see Classes.Hotel.HotelPackage#getHotel_SearchResult_BookingSuggestion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Hotel_BookingSuggestion> getBookingSuggestion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model suggestionRequired="true" suggestionOrdered="false"
	 * @generated
	 */
	void addBookingSuggestion(IBookingSuggestion suggestion);

} // Hotel_SearchResult
