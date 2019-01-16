package lesson3.labs.prob4;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	Address (String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String getCity () {
		return city;
	}

}
