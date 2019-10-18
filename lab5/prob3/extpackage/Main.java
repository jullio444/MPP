package lab5.prob3.extpackage;

import lab5.prob3.VehicleFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory.startEngine("car");
		VehicleFactory.startEngine("TRUCK");
		VehicleFactory.startEngine("electricCAR");
		VehicleFactory.startEngine("Bus");
		VehicleFactory.startEngine("Bicycle");

	}

}

/***Sample output*
 * 
 * Car is starting
 * Truck is starting
 * ElectricCar is starting
 * Bus is starting
 * Vehicle is not available!!
 * */
