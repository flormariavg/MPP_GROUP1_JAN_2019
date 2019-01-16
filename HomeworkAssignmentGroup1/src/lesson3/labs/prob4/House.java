package lesson3.labs.prob4;

public class House extends Building {
	private double rent;
	public double lotSize;
	
	
	House(double lotSize) {
		this.lotSize = lotSize;
		
	}
	
	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		rent = 0.1* lotSize;
		return rent;
	}
	
	
	@Override
	public String toString () {
		return "House in " + getCity() + " with Rent = " + computeRent();
	}
	
	
}
