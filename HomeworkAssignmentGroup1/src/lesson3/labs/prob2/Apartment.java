package lesson3.labs.prob2;

public class Apartment {

	private double rent;
	private String name;

	public Apartment(String name, double rent) {
		// TODO Auto-generated constructor stub
		this.rent = rent;
		this.name= name;
	}

	public double getRent() {
		return rent;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" Rent: "+String.valueOf(rent);
	}
}
