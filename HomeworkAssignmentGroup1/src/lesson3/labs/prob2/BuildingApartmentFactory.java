package lesson3.labs.prob2;

public class BuildingApartmentFactory {
	private Landlord landlord;
	
	public Landlord createLandlord(String name) {
		landlord= new Landlord(name);
		return landlord;
		
	}
	
	public Building createBuilding(String name, double maintenceCost) {
		Building building = new Building(name ,maintenceCost);
		landlord.buildings.add(building);
		return building;
		
	}
	
	public void  createApartment(Building building, String name, double rent) {
		Apartment apartment= new Apartment(name, rent );
		building.apartments.add(apartment);
		
	}
	

}