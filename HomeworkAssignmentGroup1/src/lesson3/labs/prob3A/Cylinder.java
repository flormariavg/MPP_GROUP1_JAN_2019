package lesson3.labs.prob3A;

public class Cylinder {
	
	private double height;
	private double radius;

	public Cylinder(double radius, double height) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
		this.height = height;

	} 
	
	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		
		return 2*Math.PI*radius*radius + height*(2*Math.PI*radius);
	}
	
}
