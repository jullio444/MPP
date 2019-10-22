package lab9.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	
	
	public static void main(String[] args) {
		// Make three calls for the streamSection() method with different inputs
		// use nextStream() method to supply the Stream input as a first argument in streamSection() method
		System.out.println(streamSection(nextStream(), 1,4).collect(Collectors.toList()));
		System.out.println(streamSection(nextStream(), 0,5).collect(Collectors.toList()));
		System.out.println(streamSection(nextStream(), 6,8).collect(Collectors.toList()));
	}
	
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		// Implement the code
		return stream.skip(m).limit(n-m);
	}

	//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}

/**Sample output
 * 
[bbb, ccc, ddd, eee]
[aaa, bbb, ccc, ddd, eee, fff]
[ggg, hhh, iii]

*/