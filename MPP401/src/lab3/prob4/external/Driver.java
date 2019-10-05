package lab3.prob4.external;

import java.util.Arrays;

import lab3.prob4.Condominium;
import lab3.prob4.House;
import lab3.prob4.Trailer;

public class Driver {

	public static void main(String[] args) {
		
		House house = new House(3, 300, "sr1", "cty1", "zip1", "cnry1");
		Condominium condo = new Condominium(3, 300, "sr2", "cty2", "zip2", "cnry2");
		Trailer trailer = new Trailer("sr3", "cty3", "zip3", "cnry3");
		
		double totalRent = Admin.computeTotalRent(Arrays.asList(house, condo, trailer));
		System.out.println("The total Rent is = " + totalRent);
	}
}
