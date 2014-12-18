package hotel.test.mock;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.IBookingSuggestion;

public class MockBookingRequest extends MockEObject implements BookingRequest {

	private final IBookingSuggestion bookingSuggestion;
	private final List<Integer> guests;
	private final int contact;

	public MockBookingRequest(IBookingSuggestion bookingSuggestion,
			List<Integer> guests, int contact) {
		this.bookingSuggestion = bookingSuggestion;
		this.guests = new ArrayList<>(guests);
		this.contact = contact;
	}

	@Override
	public IBookingSuggestion getBookingSuggestion() {
		return bookingSuggestion;
	}

	@Override
	public int getContact() {
		return contact;
	}

	@Override
	public EList<Integer> getGuests() {
		return new BasicEList<>(guests);
	}

}

