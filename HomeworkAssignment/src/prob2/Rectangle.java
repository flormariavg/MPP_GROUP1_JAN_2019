package prob2;

public class Rectangle implements Polygon {
	
	private double length, width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		double sides[]= {length,width,length,width};
		return sides;
	}
}
