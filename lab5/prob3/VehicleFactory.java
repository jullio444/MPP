package lab5.prob3;

final public class VehicleFactory {
	
	private VehicleFactory() {
		
	}

	public static void startEngine(String vehicleType) {
		if (vehicleType == null)
			throw new IllegalArgumentException("Vehicle Type is either Bus or Car or ElectricCar or Truck");
		String type = vehicleType.toLowerCase();

		switch (type) {
		case "car":
			new Car().startEngine();
			break;
		case "bus":
			new Bus().startEngine();
			break;
		case "truck":
			new Truck().startEngine();
			break;
		case "electriccar":
			new ElectricCar().startEngine();
			break;
		default:
			System.out.println("Vehicle is not available!!");
		}
	}
}


