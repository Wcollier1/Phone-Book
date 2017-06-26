package phonebook.claim;

public class Contact {
	protected FullName fullName;
	protected long telephone;
	protected Address myAddress;

	public  Contact() { //add a default constructor

	}

	public Contact(FullName fullName, Address myAddress, long telephone) { //add a parameterized constructor 
		this.fullName = fullName;
		this.telephone = telephone;
		this.myAddress = myAddress;
	}
	
	
	public long getTelephone() {
		return this.telephone;
	}
	
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	
	public Address getMyaddress() {
		return this.myAddress;
	}
	
	public void setMyaddress(Address myAddress) {
		this.myAddress = myAddress;
	}


	public Address getMyAddress() {
		return myAddress;
	}

	public void setMyAddress(Address myAddress) {
		this.myAddress = myAddress;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	
	
}