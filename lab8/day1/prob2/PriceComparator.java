package lab8.day1.prob2;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product p1, Product p2) {
		return Double.valueOf(p1.getPrice()).compareTo(p2.getPrice());
	}

}

/***Sample output
[
 Smart watch : 50.5 : 2, 
 Book : 150.0 : 10, 
 Book : 350.0 : 8, 
 Phone : 1200.25 : 1, 
 Laptop : 1500.5 : 5, 
 Car : 1600.55 : 3, 
 Grian : 2000.55 : 3]

[
 Book : 150.0 : 10, 
 Book : 350.0 : 8, 
 Car : 1600.55 : 3, 
 Grian : 2000.55 : 3, 
 Laptop : 1500.5 : 5, 
 Phone : 1200.25 : 1, 
 Smart watch : 50.5 : 2]

[
 Smart watch : 50.5 : 2, 
 Book : 150.0 : 10, 
 Book : 350.0 : 8, 
 Phone : 1200.25 : 1, 
 Laptop : 1500.5 : 5, 
 Car : 1600.55 : 3, 
 Grian : 2000.55 : 3]
[
 Book : 150.0 : 10, 
 Book : 350.0 : 8, 
 Car : 1600.55 : 3, 
 Grian : 2000.55 : 3, 
 Laptop : 1500.5 : 5, 
 Phone : 1200.25 : 1, 
 Smart watch : 50.5 : 2]

[
 Book : 350.0 : 8, 
 Book : 150.0 : 10, 
 Car : 1600.55 : 3, 
 Grian : 2000.55 : 3, 
 Laptop : 1500.5 : 5, 
 Phone : 1200.25 : 1, 
 Smart watch : 50.5 : 2]


*/