package lab7.prob2;

public interface Polygon extends ClosedCurve {
	public double[] getLengths();

	@Override
	default double computePerimeter() {
		double[] lengths = getLengths();
		double sum = 0.0;
		for (double len : lengths) {
			sum += len;
		}
		return sum;
	}
}
