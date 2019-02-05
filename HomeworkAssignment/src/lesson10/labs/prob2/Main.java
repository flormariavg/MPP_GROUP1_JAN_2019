package lesson10.labs.prob2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
	
	/*
	 * Create a generic programming solution to the problem of finding the second
		smallest element in a list. In other words, devise a public static method
		secondSmallest so that it can handle the biggest possible range of types.
	 */
	
	public static <T> T  secondSmallest(List<T> list){
		if(list==null) return null;
		else return list.stream()
			.sorted()
			.skip(1)
			.findFirst().get();
	}
	
	public static void main(String[] args) {
	
		System.out.println("The second smallest element in the list is: "+secondSmallest(null));
		
		List<String> list= Arrays.asList("Jane","Ann","Flor");
		System.out.println("The second smallest element in the list is: "+secondSmallest(list));
		
		List<Integer> list2= Arrays.asList(9,5,3,1);
		System.out.println("The second smallest element in the list is: "+secondSmallest(list2));
	}

	/*
	 * OUTPUT SOLUTION:

		The second smallest element in the list is: null
		The second smallest element in the list is: Flor
		The second smallest element in the list is: 3

	 */
}
