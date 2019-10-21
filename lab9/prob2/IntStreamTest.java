package lab9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> myIntStream = Stream.of(34,76,18,89,10,38,78,100,378,12);

		IntSummaryStatistics stats = myIntStream
				.collect(Collectors.summarizingInt(Integer::intValue));
		
		System.out.println("MinValue:"+stats.getMin());
		System.out.println("MaxValue:"+ stats.getMax());

	}

}
/**Sample output
*
MinValue:10
MaxValue:378
*/