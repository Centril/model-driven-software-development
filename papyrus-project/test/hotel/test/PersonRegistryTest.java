package hotel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.PersonRegistry.IPerson;
import Classes.PersonRegistry.IPersonRegistry;

public class PersonRegistryTest {

	@Test
	public void testSuccessfullyStoringPerson() {
		IPersonRegistry registry = IPersonRegistry.instance;
		
		String firstName = "Nikola";
		String lastName = "Tesla";
		String ssn = "000-12-3456";
		String ccNumber =  "1212 1319 4143 1336";
		String ccv = "666";
		int month = 2;
		int year = 2077;
		
		// Send in data
		long birthDate = -3581025132L;
		IPerson created = registry.createPerson(birthDate);
		created.setFirstName(firstName);
		created.setLastName(lastName);
		created.setSSN(ssn);
		created.createCreditCard(ccNumber, ccv, month, year, firstName, lastName);
	
		int personID = created.getId();
		
		// Validate that the same is sent back when asking
		IPerson sentBack = registry.getIPersonByID(personID);
		assertEquals(birthDate, sentBack.getBirthDate());
		assertEquals(firstName, sentBack.getFirstName());
		assertEquals(lastName, sentBack.getLastName());
		assertEquals(ssn, sentBack.getSSN());
		assertEquals(ccNumber, sentBack.getCreditCard().getCCNumber());
		assertEquals(ccv, sentBack.getCreditCard().getCCV());
		assertEquals(month, sentBack.getCreditCard().getMonth());
		assertEquals(year, sentBack.getCreditCard().getYear());
	}
}
