package lab3.prob2.external;

import lab3.prob2.Building;
import lab3.prob2.LandLord;

public class Main {

	public static void main(String[] args) {
		LandLord l = new LandLord("Group7");
		Building blg = l.addBuilding("Mutasa", 2500);

		blg.setAparment("BLOCK-A", 1500);
		blg.setAparment("BLOCK-B", 1300);
		blg.setAparment("BLOCK-C", 1500);
		
		Building blg2 = l.addBuilding("Mabirizi", 1500);
		blg2.setAparment("WING-A", 800);
		blg2.setAparment("WING-B", 750);
		blg2.setAparment("WING-C", 1100);
		
		System.out.println(l);
		
	}

}
/****Sample Output*****
*
*	LandLord's Entire Structure
*	---------------------------------------
*	LandLoad's Name: Group7
*	[BuidlingName->Mutasa MaintenanceCost->2500.0 Apartments->[BLOCK-A 1500.0, BLOCK-B 1300.0, BLOCK-C 1500.0]BuildingProfit->1800.0, BuidlingName->Mabirizi MaintenanceCost->1500.0 Apartments->[WING-A 800.0, WING-B 750.0, WING-C 1100.0]BuildingProfit->1150.0]
*	LandLord's Profit:2950.0
*
*
*/
