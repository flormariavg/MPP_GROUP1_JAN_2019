package lesson9.labs.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 2. You have a Stream of Integers called myIntStream and you need to output both the
				maximum and minimum values. Write compact code that efficiently accomplishes this.
		 */
		Stream<Integer> myIntStream= Stream.of(7,9,3,5,1);
		
		IntSummaryStatistics intSummaryStatistics= myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Maximum value: " + intSummaryStatistics.getMax());
		System.out.println("Minimum value: " + intSummaryStatistics.getMin());
		
		/*
		 * OUTPUT SOLUTION:
		 * 
		 *  Maximum value: 9
			Minimum value: 1
		 */
		
		
	}

}
