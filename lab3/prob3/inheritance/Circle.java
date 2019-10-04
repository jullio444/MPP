package lab3.prob3.inheritance;

public class Circle extends Cylinder {
	private double radius;

	public Circle(double radius) {
		super(radius, radius);
		this.radius = radius;

	}

	public double computeArea() {
		return radius * radius * Math.PI;
	}

	public double getradius(double radius) {
		return radius;

	}
}
