package lab3.prob3.composition;

public class Cylinder {
	private double height;
	private double radius;
	private Circle c;
	public Cylinder(double height, double rad){
		this.height = height;
		radius = rad;
		c = new Circle(radius);
	}
	public double getHeight() {
		return height;
	}
	
	public double calculateVolumeOfCylinder() {
		return Math.PI*radius*radius*height;
	}
	
	public Circle getCircleInfo() {
		return c;
	}

}
