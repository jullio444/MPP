package lab5.prob2;

final class Triangle implements Figure {
	private final double base;
	private final double height;

	public Triangle(double b, double h) {
		base = b;
		height = h;
	}

	public double getBase() {
		return base;
	}


	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return getHeight()*getBase()/2;
	}
	
	@Override
	public String toString() {
		return "Area of Triangle="+computeArea();
	}

}
