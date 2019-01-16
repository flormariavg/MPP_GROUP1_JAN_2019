package lesson3.labs.prob4;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {

		Building[] objects = { new House(9000), new Condo(2), new Trailer() };
		
		Address[] address = { new Address ("House street", "Iowa", "Iowa", "12345"),  new Address ("Condo", "Iowa", "Iowa", "12345"),  new Address ("Trailer", "Cali", "Iowa", "12345")};
		for (int i = 0; i< objects.length ; i++ ) {
			objects[i].setAddress(address[i]);
		
		}
		
		System.out.println(Arrays.toString(objects));
		
		double totalRent = Admin.computeTotalRent(objects);
		
		System.out.println("Total Rent in System = " + totalRent);
		
		
		double totalRentCity = Admin.computeTotalRentOnCity(objects, "Iowa");
		System.out.println("Total Rent in Iowa City = " + totalRentCity);
	}
}
