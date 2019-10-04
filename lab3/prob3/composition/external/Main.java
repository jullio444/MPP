package lab3.prob3.composition.external;

import lab3.prob3.composition.Cylinder;

public class Main {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(6,3);
		System.out.println("AreaOfCylinder:" +c.calculateVolumeOfCylinder());
		System.out.println(c.getCircleInfo());
	}
}

/***Sample Output****
*
*	AreaOfCylinder:169.64600329384882
*
*	Circle Information
*	--------------------------------
*	Radius: 3.0
*	AreaOfCircle: 28.274333882308138
*
*/