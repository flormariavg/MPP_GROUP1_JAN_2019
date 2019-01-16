package lesson3.labs.prob3B;


public class Main {
	
	public static void main(String[] arg) {
		
		Cylinder cylinder = new Cylinder(20, 30);
		
		System.out.println("cylinder with height = " + cylinder.getHeight() + " and radius = " + cylinder.circle.getRadius());
		System.out.println("computeVolume = " + cylinder.computeVolume());
		System.out.println("computeArea = " + cylinder.circle.computeArea());
		
	}

}
