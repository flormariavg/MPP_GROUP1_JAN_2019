package lesson5.labs.prob2;

public final class Triangle implements Figure{

	private final double base;
	private final double height;
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}
	
	@Override
	public double computeArea() {
		return 1/2 *base*height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

}
