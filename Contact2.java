/*
 * Deonne Ludwig
 * CS320 | 3-2 Milestone: Contact Service | re-do
 * 06/10/2023
 * Contact2.java
 */

package contactService2;

//declare variables
public class Contact2 {
	private String contactID, firstName, lastName, contactPhone, contactAddress;
	
	Contact2() {
		contactID = "contIDvalu";
		firstName = "fstNameVal";
		lastName = "lstNameVal";
		contactPhone = "testcontPh";
		contactAddress = "contactAddressValue";
	} 
	
	Contact2(String contactID) {
		checkContactID(contactID);
		firstName = "fstNameVal";
		lastName = "lstNameVal";
		contactPhone = "testcontPh";
		contactAddress = "contactAddressValue";
	}

	Contact2(String contactID, String firstName) {
		checkContactID(contactID);
		setFirstName(firstName);
		lastName = "lstNameVal";
		contactPhone = "testcontPh";
		contactAddress = "contactAddressValue";
	}
	
	Contact2(String contactID, String firstName, String lastName) {
		checkContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		contactPhone = "testcontPh";
		contactAddress = "contactAddressValue";
	}
	
	Contact2(String contactID, String firstName, String lastName, String contactPhone) {
		checkContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		setContactPhone(contactPhone);
		contactAddress = "contactAddressValue";
	}
	
	Contact2(String contactID, String firstName, String lastName, String contactPhone, String contactAddress) {
		checkContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		setContactPhone(contactPhone);
		setContactAddress(contactAddress);
	}
	

	//constructor with conditional checks
	public final String getContactID() { return contactID; }
	//contactID string that cannot be null or longer than 10 characters or updatable
	private void checkContactID(String contactID) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		} else {
			this.contactID = contactID;
		  }
	}
	
	public final String getFirstName() { return firstName; }
	protected void setFirstName(String firstName) {
		//firstName String field that cannot be null or longer than 10 characters
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		} else {
			this.firstName = firstName;
		}
	}
	
	public final String getLastName() { return lastName; }
	protected void setLastName(String lastName) {
		//lastName String field that cannot be null or longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		} else {
			this.lastName = lastName;
		}
	}
	
	public final String getContactPhone() { return contactPhone; }
	protected void setContactPhone(String contactPhone) {
		//contactPhone String field that cannot be null and must be 10 characters
		if (contactPhone == null || contactPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		} else {
			this.contactPhone = contactPhone;
		}
	}
	
	public final String getContactAddress() { return contactAddress; }
	protected void setContactAddress(String contactAddress) {
		//contactAddress String field that cannot be null or longer than 30 characters
		if (contactAddress == null || contactAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		} else {
			this.contactAddress = contactAddress;
		}
	}

}
