package lab9.prob4;

import java.util.stream.Stream;

public class PrintSquares {

	public static void main(String[] args) {
		printSquares(7);
	}

	public static void printSquares(int num) {
		Stream.iterate(1, n->n+1)
		.map(n->n*n)
		.limit(num)
		.forEach(System.out::println);
	}
}

/***
*
1
4
9
16
25
36
49
*/