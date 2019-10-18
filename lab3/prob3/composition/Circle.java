package lab3.prob3.composition;

public class Circle {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double computeVolume(double radius) {
		return Math.PI*radius*radius;
	}
	
	@Override
	public String toString() {
		return "\nCircle Information\n--------------------------------\n"
				+ "Radius: "+radius+"\nAreaOfCircle: "+computeVolume(radius);
	}
}
