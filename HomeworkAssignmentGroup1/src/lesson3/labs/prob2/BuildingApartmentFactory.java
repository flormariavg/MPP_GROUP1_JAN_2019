package lesson3.labs.prob2;

public class BuildingApartmentFactory {
	private Building building;
	private Landlord landlord;
	
	public Landlord createLandlord(String name) {
		landlord= new Landlord(name);
		return landlord;
		
	}
	
	public void createBuilding(String name, double maintenceCost) {
		building = new Building(name ,maintenceCost);
		landlord.buildings.add(building);
		
	}
	
	public void  createApartment(String name, double rent) {
		Apartment apartment= new Apartment(name, rent );
		building.apartments.add(apartment);
		
	}
	

}
