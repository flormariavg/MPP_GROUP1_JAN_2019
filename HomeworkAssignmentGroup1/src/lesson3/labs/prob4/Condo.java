package lesson3.labs.prob4;

public class Condo extends Building{
	
	public int numFloors;
	private double rent;

	Condo(int numFloors) {
		this.numFloors = numFloors;
	
	}
	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		rent = 400 * numFloors;
		return rent;
	}
	@Override
	public String toString () {
		return "Condo in " + getCity() + " with Rent = " + computeRent();
	}
}
