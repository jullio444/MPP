package lab3.prob4;

public class Condominium extends Property {

	private Address address;
	private int floor;
	private double rent;

	public Condominium(int floor, double rent, String street, String city, String zipCode, String country) {
		this.rent = rent;
		this.floor = floor;
		address = new Address(street, city, zipCode, country);
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 400 * floor;
	}

	public Address getAddress() {
		return address;
	}

	public int getFloor() {
		return floor;
	}

	public double getRent() {
		return rent;
	}

}
