package lesson7.labs.prob3;

public interface Quack extends QuackBehavior{

	public default void quack() {
		// TODO Auto-generated method stub
		System.out.println("quacking");
	}

}
