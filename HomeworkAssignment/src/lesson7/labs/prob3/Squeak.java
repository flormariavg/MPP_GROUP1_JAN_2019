package lesson7.labs.prob3;

public interface Squeak extends QuackBehavior{

	public default void quack() {
		System.out.println("squeaking");
		
	}
	

}
