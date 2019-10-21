package lab9.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final TriFunction<List<Employee>, Integer, Character, String> FILTERED_NAMES = 
			(list, salary, charCheck) -> list.stream()
			.filter(e->e.getSalary()>salary && e.getLastName().toLowerCase()
		    .charAt(0)>Character.toLowerCase(charCheck))
			.map(emp->emp.getFirstName()+" "+emp.getLastName()).collect(Collectors.joining(", "));
}
