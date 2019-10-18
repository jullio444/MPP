package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String buildingName;
	private double maintenanceCost;
	private List<Apartment> ap;
	
	Building(String buildingName, double mc){
		ap = new ArrayList<>();
		this.buildingName = buildingName;
		maintenanceCost = mc;
	}
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	public List<Apartment> getApartement() {
		return ap;
	}
	public Apartment setAparment(String apartmentName, double  rent) {
		Apartment a = new Apartment(apartmentName, rent);
		this.ap.add(a);
		return a;
	}
	
	public double getProfit() {
		double sumRent = 0;
		for(Apartment a: ap) {
			sumRent+=a.getRent();
		}
		return sumRent-maintenanceCost;
	}

	@Override
	public String toString() {
		return "BuidlingName->" + buildingName + " MaintenanceCost->" + maintenanceCost 
				+ " Apartments->" + ap+ "BuildingProfit->"+ this.getProfit();
	}
}
