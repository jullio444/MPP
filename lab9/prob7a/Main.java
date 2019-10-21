package lab9.prob7a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		 String streamPipe =  list.stream().filter(s->s.getSalary()>100000 && s.getLastName()
				 .toLowerCase().charAt(0)>'m')
				.map(name->name.getFullname()).sorted().collect(Collectors.joining(", "));
		 System.out.println(streamPipe);
	}

}
/**Output
 * 
 * Alice Richards, Joe Stevens, John Sims, Steven Walters
 *
 */
