package lab5.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figure> figures = new ArrayList<Figure>();
		
		Figure fig1 = new Circle(3.5);
		Figure  fig2 = new Triangle(2.5,4);	
		Figure fig3 = new Rectangle(6.5, 8);
		
		figures.add(fig1);
		figures.add(fig2);
		figures.add(fig3);
		
		double sumArea = 0;
		for(Figure r: figures) {
			System.out.println(r);
			sumArea+=r.computeArea();
		}
		System.out.println("Sum of Areas="+sumArea);
	}

}
