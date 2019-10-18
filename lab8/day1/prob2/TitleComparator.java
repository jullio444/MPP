package lab8.day1.prob2;

import java.util.Comparator;

public class TitleComparator implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getTitle().toUpperCase().compareTo(p2.getTitle().toUpperCase());
	}
}
