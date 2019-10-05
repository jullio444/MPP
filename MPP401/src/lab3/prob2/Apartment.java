package lab3.prob2;

public class Apartment {
	private String apartmentName;
	private double rent;
	
	Apartment(String apartmentName, double rent){
		this.apartmentName = apartmentName;
		this.rent = rent;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}
	
	@Override
	public String toString() {
		return this.apartmentName+" "+rent;
	}
}
