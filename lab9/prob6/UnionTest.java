package lab9.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> list = new ArrayList<>();
				list.add(new HashSet<String>(Arrays.asList("A", "B")));
				list.add(new HashSet<String>(Arrays.asList("D"))); 
				list.add(new HashSet<String>(Arrays.asList("1", "3", "5")));
				
				System.out.println(list);

				System.out.println(union(list));
	}
	public static Set<String> union(List<Set<String>> sets){
        // The result of the reduce() method is 
        // an Optional because the list on which 
        // reduce() is called may be empty. 
		return sets.stream().reduce((a,b)->{ 
			a.addAll(b);
			return a;
		}).orElse(Collections.emptySet());
	
	}
}
