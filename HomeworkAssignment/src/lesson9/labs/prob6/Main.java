package lesson9.labs.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	/*
	 * 6. Implement a method
		public Set<String> union(List<Set<String>> sets)
		by creating a stream pipeline that transforms a list of sets (of type String) into the union of those
		sets. Make use of the reduce method for streams.
		Example: The union method should transform the list  to the set
		,

	 */
	public Main() {
		// TODO Auto-generated constructor stub
		Set<String> set1= new HashSet<>();
		set1.addAll(Arrays.asList("A","B"));
		
		Set<String> set2= new HashSet<>();
		set2.addAll(Arrays.asList("D"));
		
		Set<String> set3= new HashSet<>();
		set3.addAll(Arrays.asList("1","3","5"));
		
		List<Set<String>> list= new ArrayList<>();
		list.add(set1);
		list.add(set2);
		list.add(set3);
		
		Set<String> set= union(list);
		String s= set.stream().collect(Collectors.joining(",", "{", "}"));
		System.out.println(s);
		
		/*
		 * OUTPUT SOLUTION:

			{A,1,B,3,D,5}
		 */
		
	}
	public static void main(String[] args) {
		new Main();
	}
	public Set<String> union(List<Set<String>> sets){
		
		Set<String> set= sets.stream()
		.reduce((a,b)->Stream.concat(a.stream(), b.stream())
				.collect(Collectors.toSet())).get();
		return set;
	}

}
