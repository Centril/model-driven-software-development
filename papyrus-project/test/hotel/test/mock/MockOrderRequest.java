package hotel.test.mock;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import Classes.Hotel.BookingRequest;
import Classes.Hotel.OrderRequest;

public class MockOrderRequest extends MockEObject implements OrderRequest {

	private final int customer;
	private final List<BookingRequest> bookingRequests;

	public MockOrderRequest(int customer, List<BookingRequest> bookingRequests) {
		this.customer = customer;
		this.bookingRequests = new ArrayList<>(bookingRequests);
	}

	@Override
	public int getCustomer() {
		return customer;
	}

	@Override
	public EList<BookingRequest> getBookingRequests() {
		return new BasicEList<>(bookingRequests);
	}

}
