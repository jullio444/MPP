package lab8.day2.prob2;

import java.util.Random;
import java.util.function.Supplier;

public class MyRandom {

	class MyRandomDouble implements Supplier<Double> {
		@Override
		public Double get() {
			Double n = new Random().nextDouble();
			return n;
		}
	}

	public static void main(String[] args) {

		// using method reference to generate 5 random double numbers
		System.out.println("Using method reference\n-----------------------");
		Supplier<Double> random = Math::random;
		for (int i = 1; i <= 5; i++) {
			System.out.println(random.get());
		}
		System.out.println();
		System.out.println("Using Lambda\n-----------------------");
		
		// Using Lambda to generate 5 random double numbers
		Supplier<Double> randomDouble = () -> Math.random();
		for (int i = 1; i < 5; i++) {
			System.out.println(randomDouble.get());
		}
		
		//Using inner Class
		//MyRandom.MyRandomDouble mrd = new MyRandom().new MyRandomDouble();
		System.out.println();
		System.out.println("Using inner Class\n-----------------------");
		for (int i = 1; i < 5; i++) {
			System.out.println(new MyRandom().new MyRandomDouble().get());
		}
	}

}
/**Sample output**

Using method reference
-----------------------
0.5855646832969724
0.10760047461766697
0.9833057750551722
0.13496119945360585
0.8818155312644731

Using Lambda
-----------------------
0.5195726005855866
0.2220979222172711
0.8583068581265062
0.3835858379496705

Using inner Class
-----------------------
0.4569600328206741
0.6925789523020291
0.7173671636367236
0.3918779571218465
*/