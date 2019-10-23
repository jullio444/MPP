package lab8.day1.prob2;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product p1, Product p2) {
		return Double.valueOf(p1.getPrice()).compareTo(p2.getPrice());
	}

}
