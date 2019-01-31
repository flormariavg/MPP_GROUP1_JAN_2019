package lesson8.labs.prob4;

import java.util.function.Supplier;

public class MethodExpRandom {
	
	public static void main(String[] args) {
		Supplier<Double> random = Math::random;
		System.out.println(random.get());
	}
	
	/*
	 * OUTPUT SOLUTION
	 * 0.9272214554874091
	 */

}
