package lab9.prob3;

import java.util.Arrays;
import java.util.List;

public class CountWordsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = Arrays.asList("Julius", "Purchase", "Grinding");
		System.out.println("Number of Words:"+countWords(str, 'c', 'j', 8));
	}

	public static int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream().filter(w -> w.length() == len 
				&& w.contains(""+c)
				&& !w.contains(""+d)).count();
	}

}
/***Sample output
 * 
 Number of Words:1
*/