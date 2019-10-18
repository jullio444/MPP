package lab8.day1.prob2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test {
	
	static enum sortMethod{TITLE, PRICE, MODEL};	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = Arrays.asList(new Product("Phone",1200.25, 1),
				new Product("Smart watch", 50.5, 2),
				new Product("Laptop", 1500.5, 5),
				new Product("Car", 1600.55, 3),
				new Product("Book", 150.0, 10),
				new Product("Book", 350.0, 8),
				new Product("Grian", 2000.55, 3));
				
		Collections.sort(products, new PriceComparator());	
		System.out.println(products);
		System.out.println();
		
		Collections.sort(products, new TitleComparator());
		System.out.println(products);
		System.out.println();

		System.out.println(sort(products, sortMethod.PRICE));
		System.out.println(sort(products, sortMethod.TITLE));
		System.out.println();

		//If the title is same use model as another attribute to sort using Lambda
		Collections.sort(products, (p1,p2)->{
			if(p1.getTitle().equals(p2.getTitle())) {
				return Integer.valueOf(p1.getModel()).compareTo(p2.getModel());
			}else {
				return p2.getTitle().compareTo(p2.getTitle());
			}
		});
		
		System.out.println(products);
		System.out.println();

	}
	  
	  
	static public List<Product> sort(List<Product> p, final sortMethod method) {
		class sortCheck implements Comparator<Product>{

			@Override
			public int compare(Product p1, Product p2) {
				if(method == sortMethod.PRICE) {
					return Double.valueOf(p1.getPrice()).compareTo(p2.getPrice());
				}else if(method == sortMethod.TITLE){
					return p1.getTitle().compareTo(p2.getTitle()); 
				}
				return 0;
			}
		}
		Collections.sort(p, new sortCheck());
		return p;
	}

}
/**Sample Output
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
