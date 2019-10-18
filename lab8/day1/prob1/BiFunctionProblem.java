package lab8.day1.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Double, Double, List<Double>> bf = (x,y) -> {
			List<Double> list = new ArrayList<>(); 
			list.add(Math.pow(x,y)); 
			list.add(x * y);
			return list;
			};
			
			System.out.println(bf.apply(2.0, 3.0));
	}

}
