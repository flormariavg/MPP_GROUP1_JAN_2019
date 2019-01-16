package lesson3.labs.prob3A;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] arg) {
		
		List<Cylinder> a = new ArrayList<>();
		a.add(new Cylinder(10, 20));
		a.add(new Circle(10));
		a.add(new Circle(10, 20));
		
		for (Cylinder cylinder : a) {
			System.out.println("Compute = " + cylinder.computeVolume());
			
		}
		
	}

}
