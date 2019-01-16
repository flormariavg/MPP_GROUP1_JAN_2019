package lesson3.labs.prob2;

public class Main {
	
	
	public static void main(String[] args) {
		BuildingApartmentFactory baf= new BuildingApartmentFactory();
		Landlord landlord= baf.createLandlord("Landlord 1");
		baf.createBuilding("Building 1",100);
		
		baf.createApartment("Apartment 1", 500);
	//	baf.createApartment("Apartment 2",1000);
	//	baf.createApartment("Apartment 3",2000);
		
	/*	Building building2= baf.createBuilding("Building 2",100);
		
		baf.createApartment("Apartment 1",500);
		baf.createApartment("Apartment 2",600);*/
		
		System.out.println(landlord);
		
		
		
		
	}

}
