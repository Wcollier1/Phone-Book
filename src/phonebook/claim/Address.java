package phonebook.claim;

public class Address {
    protected String street;
	private String city;
	private long zipcode;
	private String state;
	
    public Address() { //add a default constructor
    
	}
    
    public Address(String state, String city, String street, long zipcode) { //add a parameterized constructor 
		this.state = state;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}
    
    public String getStreet() {
		return this.street;
	}
	
	public void setStreet(String street) { //it takes the Street we want to assign it
		this.street = street;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) { //it takes the city we want to assign it
		this.city = city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) { //it takes the state we want to assign it
		this.state = state;
	}
	
	public long getZipcode() {
		return this.zipcode;
	}
	
	public void setZipcode(long zipcode) { //it takes the first name we want to assign it
		this.zipcode = zipcode;
	}

}
