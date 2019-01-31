package lesson8.labs.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		
		BiFunction<Double, Double, List<Double>> bf= new BiFunction<Double, Double, List<Double>>(){
			public List<Double> apply(Double x, Double y) {
				List<Double> list = new ArrayList<>();
				list.add(Math.pow(x,y));
				list.add(x * y);
				return list;
			}
		};
		System.out.println(bf.apply(2.0, 3.0));
	}
	
	/*
	 * OUTPUT SOLUTION
	 * 
	 * [8.0, 6.0]
	 */
}
