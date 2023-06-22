/*
 * Deonne Ludwig
 * CS320 | 3-2 Milestone: Contact Service | re-do
 * 06/10/2023
 * ContactService2.java
 */

package contactService2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Contact2Test {
	//declare variables
	private String contactID, firstName, lastName, contactPhone, contactAddress;
	private String contactIDTooLong, firstNameTooLong, lastNameTooLong, contactPhoneTooLong, contactAddressTooLong;

	//test values
	@BeforeEach
	void testValues() {
		contactID = "contIDvalu";
		firstName = "fstNameVal";
		lastName = "lstNameVal";
		contactPhone = "testcontPh";
		contactAddress = "contactAddressValue";
		contactIDTooLong = "contactIDvalux";
		firstNameTooLong = "firstNameValuexxxxxxxx";
		lastNameTooLong = "lastNameValuexxxxxxxx";
		contactPhoneTooLong = "testcontPhonexx";
		contactAddressTooLong = "contactAddressValuexxxxxxxxxxxcontactAddressValue";
	}

	//Test Contact ID
	@Test
	void testGetContactID() {
		Contact2 contact2 = new Contact2(contactID);
		Assertions.assertEquals(contactID, contact2.getContactID());
	}

	//contact ID string that cannot be longer than 10 characters
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact2(contactIDTooLong));
	}
  
	//contact ID shall not be null
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> new Contact2(null));
	}

  
	//Test First Name
	@Test
	void testGetFirstName() {
		Contact2 contact2 = new Contact2(contactID, firstName);
		Assertions.assertEquals(firstName, contact2.getFirstName());
	}
  
	@Test
	void testAddFirstName() {
		Contact2 contact2 = new Contact2();
		contact2.setFirstName(firstName);
		Assertions.assertEquals(firstName, contact2.getFirstName());
	}
  
	//firstName String field that cannot be longer than 10 characters
	@Test
	void testAddFirstNameTooLong() {
		Contact2 contact2 = new Contact2();
		Assertions.assertThrows(IllegalArgumentException.class,() -> contact2.setFirstName(firstNameTooLong));
	}
  
	//lastName field shall not be null
	@Test
	void testFirstNameNull() {
		Contact2 contact2 = new Contact2();
		Assertions.assertThrows(IllegalArgumentException.class,() -> contact2.setFirstName(null));
	}

	
	
	//Test Last Name
	@Test
	void testGetLastName() {
		Contact2 contact2 = new Contact2(contactID, firstName, lastName);
		Assertions.assertEquals(lastName, contact2.getLastName());
	}
  
	@Test
	void testAddLastName() {
		Contact2 contact2 = new Contact2();
		contact2.setLastName(lastName);
		Assertions.assertEquals(lastName, contact2.getLastName());
	}
  
	//lastName String field that cannot be longer than 10 characters
	@Test
	void testAddLastNameTooLong() {
		Contact2 contact2 = new Contact2();
		Assertions.assertThrows(IllegalArgumentException.class,() -> contact2.setLastName(lastNameTooLong));
	}
  
	//lastName field shall not be null
	@Test
	void testLastNameNull() {
		Contact2 contact2 = new Contact2();
		Assertions.assertThrows(IllegalArgumentException.class,() -> contact2.setLastName(null));
	}

	
	//Test Contact Phone
	@Test
	void testGetContactPhone() {
		Contact2 contact2 = new Contact2(contactID, firstName, lastName, contactPhone);
		Assertions.assertEquals(contactPhone, contact2.getContactPhone());
	}
  
	@Test
	void testAddContactPhone() {
		Contact2 contact2 = new Contact2();
		contact2.setContactPhone(contactPhone);
		Assertions.assertEquals(contactPhone, contact2.getContactPhone());
	}
  
	//ContactPhone String field that cannot be longer than 10 characters
	@Test
	void testContactPhoneTooLong() {
		Contact2 contact2 = new Contact2();
		Assertions.assertThrows(IllegalArgumentException.class,() -> contact2.setContactPhone(contactPhoneTooLong));
	}
  
	//ContactPhone field shall not be null
	@Test
	void testContactPhoneNull() {
		Contact2 contact2 = new Contact2();
		Assertions.assertThrows(IllegalArgumentException.class,() -> contact2.setContactPhone(null));
	}	
	
	
	
	//Test Contact Address
	@Test
	void testGetContactAddress() {
		Contact2 contact2 = new Contact2(contactID, firstName, lastName, contactPhone, contactAddress);
		Assertions.assertEquals(contactAddress, contact2.getContactAddress());
	}
  
	@Test
	void testAddContactAddress() {
		Contact2 contact2 = new Contact2();
		contact2.setContactAddress(contactAddress);
		Assertions.assertEquals(contactAddress, contact2.getContactAddress());
	}
  
	//Contact Address String field that cannot be longer than 30 characters
	@Test
	void testContactAddressTooLong() {
		Contact2 contact2 = new Contact2();
		Assertions.assertThrows(IllegalArgumentException.class,() -> contact2.setContactAddress(contactAddressTooLong));
	}
  
	//Contact Address field shall not be null
	@Test
	void testContactAddressNull() {
		Contact2 contact2 = new Contact2();
		Assertions.assertThrows(IllegalArgumentException.class,() -> contact2.setContactAddress(null));
	}	

}