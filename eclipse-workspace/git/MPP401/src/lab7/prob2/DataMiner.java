package lab7.prob2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();

	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(4, 9));
		dm.objects.add(new EquilateralTriangle(7));
		dm.objects.add(new Rectangle(3, 7));
		dm.objects.add(new Ellipse(5, 8));
		dm.objects.add(new Circle(6));
		System.out.println(dm.computeAveragePerimeter());
	}

	public double computeAveragePerimeter() {
		if (objects == null || objects.isEmpty())
			return 0.0;
		double sum = 0.0;
		for (int i = 0; i < objects.size(); ++i) {
			sum += objects.get(i).computePerimeter();
		}
		return sum / objects.size();
	}

}

/*Output
 * 52.9398223686155
 */
