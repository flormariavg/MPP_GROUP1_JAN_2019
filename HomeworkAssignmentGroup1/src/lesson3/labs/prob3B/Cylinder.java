package lesson3.labs.prob3B;

import lesson3.labs.prob3A.Circle;

public class Cylinder {
	
	private double height;
	private double radius;
	public Circle circle;
	public Cylinder(double radius, double height) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
		this.height = height;
		circle = new Circle(radius);
	} 
	
	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		
		return 2*Math.PI*radius*radius + height*(2*Math.PI*radius);
	}
	
}
