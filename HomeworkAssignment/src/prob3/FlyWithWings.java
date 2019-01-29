package prob3;

public interface FlyWithWings extends FlyBehavior{

	public default void fly() {
		System.out.println("Flying with wings");
		
	}

}
