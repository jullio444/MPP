package lab3.prob4.external;

import java.util.List;

import lab3.prob4.Property;

public class Admin {
	// an Admin do the same thing as a LandLord class
	public static double computeTotalRent(List<Property> properties) {
		double totalRent = 0;
		for (Property property : properties) {
				totalRent += property.computeRent();
		}
		return totalRent;
	}
}
