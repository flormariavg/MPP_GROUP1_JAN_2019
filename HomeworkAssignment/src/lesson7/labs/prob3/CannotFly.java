package lesson7.labs.prob3;

public interface CannotFly extends FlyBehavior {

	public default void fly() {
		System.out.println("Can not fly");
		
	}

}
