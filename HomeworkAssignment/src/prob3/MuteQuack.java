package prob3;

public interface MuteQuack extends QuackBehavior{

	public default void quack() {
		System.out.println("can not quack");
		
		
	}

}
