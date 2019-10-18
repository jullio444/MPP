package lab8.day2.prob4;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println("After Sorting:" +Arrays.asList(names));
	}

}
/** Sample output
 *
 
After Sorting:[Alexis, KRISTY, Kyleen, Tim]
*/