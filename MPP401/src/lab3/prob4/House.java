package lab3.prob4;

public class House extends Property {

	Address address;
	double lotSize;
	double rent;

	public House(double lotSize, double rent, String street, String city, String zipCode, String country) {
		this.rent = rent;
		this.lotSize = lotSize;
		address = new Address(street, city, zipCode, country);
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 0.1 * lotSize;
	}

	public Address getAddress() {
		return address;
	}

	public double getLotSize() {
		return lotSize;
	}

	public double getRent() {
		return rent;
	}

}
