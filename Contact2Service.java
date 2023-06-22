/*
 * Deonne Ludwig
 * CS320 | 3-2 Milestone: Contact Service | re-do
 * 06/10/2023
 * Contact2Service.java
 */

package contactService2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Contact2Service {

	// store list of Contacts
	private final List<Contact2> contact2List = new ArrayList<>();

	private Contact2 checkContact2(String contactID) throws Exception {
		int index = 0;
		while (index < contact2List.size()) {
			if (contactID.equals(contact2List.get(index).getContactID())) {
				return contact2List.get(index);
			}
			index++;
		}
		throw new Exception("contactUnknown");
	}

	//add contact with a unique ID
	private String uniqueID() {
		return UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}

	
	public void addContact2() {
		Contact2 contact2 = new Contact2(uniqueID());
		contact2List.add(contact2);
	}


	//delete contacts per contact ID.
	public void deleteContact2(String contactID) throws Exception {
		contact2List.remove(checkContact2(contactID));
	}

	
	//update contact fields per contact ID (firstName)
	public void updateFirstName(String contactID, String firstName) throws Exception {
		checkContact2(contactID).setFirstName(firstName);
	}

	//update contact fields per contact ID (lastName)
	public void updateLastName(String contactID, String firstName, String lastName) throws Exception {
		checkContact2(contactID).setLastName(lastName);
	}
	
	//update contact fields per contact ID (contactPhone)
	public void updateContactPhone(String contactID, String firstName, String lastName, String contactPhone) throws Exception {
		checkContact2(contactID).setContactPhone(contactPhone);
	}

	//update contact fields per contact ID (contactAddress)
	public void updateContactAddress(String contactID, String firstName, String lastName, String contactPhone, String contactAddress) throws Exception {
		checkContact2(contactID).setContactAddress(contactAddress);
	}
	
	

	
	//return contact2List
	public List<Contact2> getContact2List() { 
		return contact2List; 
	}
}