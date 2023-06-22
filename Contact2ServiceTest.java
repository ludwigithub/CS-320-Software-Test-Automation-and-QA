/*
 * Deonne Ludwig
 * CS320 | 3-2 Milestone: Contact Service | re-do
 * 06/10/2023
 * Contact2ServiceTest.java
 */

package contactService2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Contact2ServiceTest {
	//declare variables
	private String firstName, lastName, contactPhone, contactAddress;

	//test values
	@BeforeEach
	void testValues() {

		firstName = "fstNameVal";
		lastName = "lstNameVal";
		contactPhone = "testcontPh";
		contactAddress = "contactAddressValue";

	}
	
	//test add contact with a unique ID
	@Test
	void testAddContact() {
		Contact2Service contact2List = new Contact2Service();
		contact2List.addContact2();
		Assertions.assertNotNull(contact2List.getContact2List().get(0).getContactID());
		Assertions.assertNotEquals("contactNewValu", contact2List.getContact2List().get(0).getContactID());
	}

	//test delete contacts with a unique ID
	@Test
	void testDeleteContact() throws Exception {
		Contact2Service contact2List = new Contact2Service();
		contact2List.addContact2();
		assertEquals(1, contact2List.getContact2List().size());
		contact2List.deleteContact2(contact2List.getContact2List().get(0).getContactID());
		assertEquals(0, contact2List.getContact2List().size());
	}

	
	
	//test update contacts with a unique ID (FirstName)
	@Test
	void testUpdateFirstName() throws Exception {
		Contact2Service contact2List = new Contact2Service();
		contact2List.addContact2();
		contact2List.updateFirstName(contact2List.getContact2List().get(0).getContactID(), firstName);
		assertEquals(firstName, contact2List.getContact2List().get(0).getFirstName());
	}
	
	//test update contacts with a unique ID (LastName)
	@Test
	void testUpdateLastName() throws Exception {
		Contact2Service contact2List = new Contact2Service();
		contact2List.addContact2();
		contact2List.updateLastName(contact2List.getContact2List().get(0).getContactID(), firstName, lastName);
		assertEquals(lastName, contact2List.getContact2List().get(0).getLastName());
	}

	//test update tasks with a unique ID (ContactPhone)
	@Test
	void testUpdateContactPhone() throws Exception {
		Contact2Service contact2List = new Contact2Service();
		contact2List.addContact2();
		contact2List.updateContactPhone(contact2List.getContact2List().get(0).getContactID(), firstName, lastName, contactPhone);
		assertEquals(contactPhone, contact2List.getContact2List().get(0).getContactPhone());
	}

	//test update tasks with a unique ID (ContactAddress)
	@Test
	void testUpdateContactAddress() throws Exception {
		Contact2Service contact2List = new Contact2Service();
		contact2List.addContact2();
		contact2List.updateContactAddress(contact2List.getContact2List().get(0).getContactID(), firstName, lastName, contactPhone, contactAddress);
		assertEquals(contactAddress, contact2List.getContact2List().get(0).getContactAddress());
	}
	
}