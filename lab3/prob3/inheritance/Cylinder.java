package lab3.prob3.inheritance;

public class Cylinder {
	private double radius;
	private double height;

	public Cylinder(double radius, double height) {
		this.height = height;
		this.radius = height;
	}

	public double computeVolume() {
		return Math.PI * (radius * radius) * height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
