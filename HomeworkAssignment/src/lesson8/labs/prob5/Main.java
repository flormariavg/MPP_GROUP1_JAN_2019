package lesson8.labs.prob5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		//a. Print the given list using forEach with Lambdas
		fruits.forEach(f->System.out.println(f));
		
		System.out.println("\n*********************************");
		
		//b. Print the given list using method reference
		fruits.forEach(System.out::println);
	}
	
	/*
	 * OUTPUT SOLUTION
	 * 
	 * Apple
		Banana
		Orange
		Cherries
		blums
		
		*********************************
		Apple
		Banana
		Orange
		Cherries
		blums

	 */
}
