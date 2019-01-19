package lesson5.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		double sum=0;
		Figure circle= new Circle(2);
		Figure rectangle = new Rectangle(10, 20);
		Figure triangle= new Triangle(50, 100);
		
		Figure circle2= new Circle(10);
		Figure rectangle2 = new Rectangle(5,6 );
		Figure triangle2= new Triangle(3, 2);
		
		List<Figure> figures= new ArrayList<>();
		
		figures.add(circle);
		figures.add(circle2);
		figures.add(rectangle);
		figures.add(rectangle2);
		figures.add(triangle);
		figures.add(triangle2);
		
		for (Figure figure : figures) {
			sum= sum+figure.computeArea();
		}
		
		System.out.println("Sum of Areas: "+sum);
		
	}
	
	/*
	 * OUTPUT SOLUTION:
	 * Sum of Areas: 556.7256359733385
	 */

}
