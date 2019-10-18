package lab5.prob2;

final class Rectangle implements Figure {
	private final double width;
	private final double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return getLength()*getWidth();
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	@Override
	public String toString() {
		return "Area of Rectangle="+computeArea();
	}
}
