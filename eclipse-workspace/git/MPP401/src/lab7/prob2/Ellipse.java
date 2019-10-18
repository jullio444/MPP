package lab7.prob2;

public class Ellipse implements ClosedCurve {
	private double semiMajorAxis;
	private double semiMinorAxis;

	public Ellipse(double sma, double eie) {
		semiMajorAxis = sma;
		semiMinorAxis = eie;
	}

	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * semiMinorAxis;
	}

}
