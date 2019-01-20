package lesson5.labs.prob3.extpackage;
import lesson5.labs.prob3.VehicleFactory;

public class Main {

	public static void main(String[] args) {
	       
	      VehicleFactory.getVehicle("Bus");
	      VehicleFactory.getVehicle("Truck");
	      VehicleFactory.getVehicle("Car");
	      VehicleFactory.getVehicle("ElectricCar");
	       

	}
	
	/*OUTPUT SOLUTION:
	 * 
	 * 	Bus started........
		Truck started........
		Car started........
		ElectricCar started........
	 */

}
