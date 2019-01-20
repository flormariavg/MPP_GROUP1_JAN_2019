package lesson5.labs.prob3;

public class VehicleFactory {

	private VehicleFactory() {
	}

	public static Vehicle getVehicle(String vehicleType) {
		Vehicle v = null;
		switch (vehicleType) {
		case "Bus":
			v = new Bus();
			break;
		case "Truck":
			v = new Truck();
			break;
		case "Car":
			v = new Car();
			break;
		case "ElectricCar":
			v = new ElectricCar();
		}
		v.startEngine();
		return v;
	}

}
