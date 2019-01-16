package lesson3.labs.prob4;

public class Admin {
	public static double computeTotalRent(Building[] properties) {
		double totalRent = 0;
		
		for (Building o : properties) {
				totalRent += o.computeRent();
		}
		return totalRent;
	}
	
	public static double computeTotalRentOnCity(Building[] properties, String City) {
		double totalRent = 0;
		
		for (Building o : properties) {
			if (o.getCity() != null && o.getCity().equals(City))
				totalRent += o.computeRent();
				
		}
		return totalRent;
	}
}
