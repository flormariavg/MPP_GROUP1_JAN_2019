package lesson9.labs.prob4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	
	/*
	 * 4. Implement a method
		public static void printSquares(int num)
		which creates an IntStream using the iterate method. The method prints to the console the first
		num squares. For instance, if num = 4, then your method would output 1, 4, 9, 16. Note: You will need to
		come up with a function to be used in the second argument of iterate
	 */
	
	public static void main(String[] args) {
		printSquares(4);
		
		/*
		 * OUTPUT SOLUTION:
		 * 
		 * 1, 4, 9, 16
		 */
	}
	public static void printSquares(int num) {
		
		String s= IntStream.iterate(1, x->x+1)
		.limit(num)
		.map(x->(int)Math.pow(x, 2))
		.mapToObj(Integer::toString)
		.collect(Collectors.joining(", "));
		
		System.out.println(s);
	}


}
