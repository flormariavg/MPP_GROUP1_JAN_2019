package lesson8.labs.prob6;

import java.util.Arrays;

public class SortNames {
	
	public static void main(String[] args) {
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY", "Flor"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, (n1, n2)-> n1.compareToIgnoreCase(n2));
		System.out.println(Arrays.toString(names));
		
	}
	
	/*
	 * OUTPUT SOLUTION
	 * [Alexis, Flor, KRISTY, Kyleen, Tim]
		[Alexis, Flor, KRISTY, Kyleen, Tim]
	 */

}
