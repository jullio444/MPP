package lab10.prob2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestElement {
	
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list){
		T secondSmallest =  list.stream().sorted((a,b)->a.compareTo(b))
				        .skip(1).limit(1).collect(Collectors.toList()).get(0);
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Food", "Meat", "Drinks", "Punches", "Venue");
		System.out.println("Second Smallest element String List: "+SmallestElement.secondSmallest(list));

		List<Double> list2 = Arrays.asList(37.0, 29.3, 103.2, 16.5, 48.8);
		System.out.println("Second Smallest element in Integer List: "+SmallestElement.secondSmallest(list2));
		
		//convert String to LocalDate
        	LocalDate localDate1 = LocalDate.parse("2019-09-21");
		LocalDate localDate2 = LocalDate.parse("2019-07-21");


		List<LocalDate> list3 = Arrays.asList(LocalDate.now(), localDate1, localDate2);
		System.out.println("Second Smallest element in Date List: "+SmallestElement.secondSmallest(list3));
		//System.out.println(LocalDate.now());
	}
}
/***
 * 
Second Smallest element String List: Food
Second Smallest element in Integer List: 29.3
Second Smallest element in Date List: 2019-09-21
*/
