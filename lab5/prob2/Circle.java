package lab5.prob2;

final class Circle implements Figure{
	private final double radius;
	
	public Circle(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(getRadius(), 2);
	}
	@Override
	public String toString() {
		return "Area of Circle="+computeArea();
	}
}
