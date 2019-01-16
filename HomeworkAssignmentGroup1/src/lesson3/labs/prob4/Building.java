package lesson3.labs.prob4;

public abstract class Building {
	
	private Address address;
	abstract public double computeRent();
	public String getCity() {
		if (address != null) {
			return address.getCity();
		} else return null;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
