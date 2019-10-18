package lab7.prob4;

import java.util.Arrays;
import java.util.List;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(item->{
			System.out.println(item.toUpperCase());
		});
		
		
	}	
	//implement a Consumer
}