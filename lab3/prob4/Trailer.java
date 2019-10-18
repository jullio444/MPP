package lab3.prob4;

public class Trailer extends Property {

	private Address address;
	private final double RENT = 500;

	public Trailer(String street, String city, String zipCode, String country) {
		address = new Address(street, city, zipCode, country);
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return getRENT();
	}

	public Address getAddress() {
		return address;
	}

	public double getRENT() {
		return RENT;
	}

}
