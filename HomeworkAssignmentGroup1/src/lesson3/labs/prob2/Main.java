package lesson3.labs.prob2;

public class Main {
	
	
	public static void main(String[] args) {
		BuildingApartmentFactory baf= new BuildingApartmentFactory();
		Landlord landlord= baf.createLandlord("Landlord 1");
		Building building= baf.createBuilding("Building 1",100);
		
		baf.createApartment(building,"Apartment 1", 500);
		baf.createApartment(building,"Apartment 2",1000);
		baf.createApartment(building,"Apartment 3",2000);
		
		Building building2=baf.createBuilding("Building 2",100);
		
		baf.createApartment(building2,"Apartment 1",500);
		baf.createApartment(building2,"Apartment 2",600);
		
		landlord.getTotalProfit();
		System.out.println(landlord);
		
		
		/*
		 * OUTPUT SOLUTION:

			Name: Landlord 1 || Monthly total profit: 4400.0
				[
				 Name: Building 1 || Maintenance Cost:100.0 || Profit: 3400.0
				  [Apartment 1 Rent: 500.0, Apartment 2 Rent: 1000.0, Apartment 3 Rent: 2000.0]
				 , 
				 Name: Building 2 || Maintenance Cost:100.0 || Profit: 1000.0
				  [Apartment 1 Rent: 500.0, Apartment 2 Rent: 600.0]
				 ]

		 */
		
	}

}
