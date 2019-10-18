package lab8.day2.prob3;

import java.util.Arrays;
import java.util.List;

public class ForEachPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");

		//Using Lambdas
		System.out.println("Using lambda\n-----------------------");		
		fruits.forEach(x-> System.out.println(x));

		//Using method reference
		System.out.println("Using method reference\n-----------------------");		
		fruits.forEach(System.out::println);
	}

}

/** Sample output

Using lambda
-----------------------
Apple
Banana
Orange
Cherries
blums
Using method reference
-----------------------
Apple
Banana
Orange
Cherries
blums
*/