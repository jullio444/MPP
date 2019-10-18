package lab3.prob3.inheritance;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("##.00");
		Circle cy = new Circle(5.0);		
		System.out.println(format.format(cy.computeArea())); //Expected value is 78.54 which is correct 
		cy.setRadius(9.0); 
		System.out.println(format.format(cy.computeArea())); //Expected value is 254.47 but result is different
		
	}
}
