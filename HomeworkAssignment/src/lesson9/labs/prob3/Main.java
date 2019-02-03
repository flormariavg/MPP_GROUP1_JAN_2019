package lesson9.labs.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	/*
	 * 3. Implement a given method requirement using Lambdas and streams in a Java 8 way.
		public int countWords(List<String> words, char c, char d, int len)
		which counts the number of words in the input list words that have length equal to 
		len, that
		contain the character c, and that do not contain the character d.
		(see package lesson8.lecture.filter) – Describes to provide Good, Better and advanced solution using
		Streams and lambda.
		Requirement of this Problem: Solve the above problem by giving advanced solution in which there
		is just one lambda expression.

	 */
	
	public Main() {
		// TODO Auto-generated constructor stub
		List<String> words= Arrays.asList("Flor","Juan","Jhon");
		System.out.println("Number words: "+countWords(words, 'J', 'r', 4));
		
		/*
		 * OUTPUT SOLUTION:
		 * 
		 * 1, 4, 9, 16, 
		 */
	}
	public static void main(String[] args) {
		new Main();
	}
	
	public int countWords(List<String> words, char c, char d, int len) {
		
		long countWords = words.stream()
				.filter(x-> x.length()==len && x.indexOf(c)>-1 && x.indexOf(d)==-1)
				.count();
		return (int) countWords;
	}

}
