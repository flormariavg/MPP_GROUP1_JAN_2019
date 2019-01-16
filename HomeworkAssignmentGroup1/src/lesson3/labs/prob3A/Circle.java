package lesson3.labs.prob3A;

// π r2
public class Circle extends Cylinder{
	private double radius;

	public Circle(double radius, double height) {
		super(radius, height);
		this.radius = radius;
	}
	public Circle(double radius) {
		super(radius, 0);
		this.radius = radius;
	} 

	public double getRadius() {
		
		return radius;
	}
	
	public double computeArea() {
		
		return Math.PI*radius*radius;
	}
}
