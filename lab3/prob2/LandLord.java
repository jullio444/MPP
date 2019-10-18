package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
	private String name;
	private List<Building> buildings;
	public LandLord(String name){
		this.name = name;
		buildings = new ArrayList<>();
	}
	
	public Building addBuilding(String buildingName, double mc) {
		Building b = new Building(buildingName, mc);
		this.buildings.add(b);
		return b;
	}
	
	public double monthlyProfit() {
		double profit = 0;
		for(Building b: buildings) {
			profit+=b.getProfit();
		}
		return profit;
	}
	
	public List<Building> getBuildings() {
		return buildings;
	}

	public Building addBuildings(Building b) {
		this.buildings.add(b);
		return b;
	}	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("LandLord's Entire Structure"+
	"\n---------------------------------------\n");
		sb.append("LandLoad's Name: "+name+"\n");
		sb.append(buildings+"\n");
		sb.append("LandLord's Profit:"+this.monthlyProfit());
		return sb.toString();
	}
}
