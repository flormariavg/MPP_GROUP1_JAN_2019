package lesson3.labs.prob4;

public class Trailer extends Building {
	
	private double rent; 
	
	Trailer() {
		
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		rent = 500;
		return rent;
	}
	@Override
	public String toString () {
		return "Trailer in " + getCity() + " with Rent = " + computeRent();
	}
}
