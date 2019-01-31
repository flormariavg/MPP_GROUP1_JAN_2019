package lesson8.labs.prob4;

import java.util.function.Supplier;

public class LambdaRandom {
	public static void main(String[] args) {
		Supplier<Double> random = ()->{
			return Math.random();
		};
		System.out.println(random.get());
	}
}
