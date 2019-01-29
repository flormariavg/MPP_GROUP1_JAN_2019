package lesson7.labs.prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck[] ducks = {new MallarDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		
		for (Duck duck : ducks) {
			System.out.println("\n\n" + duck.getClass().getSimpleName() + ":");
			duck.display();
			duck.fly();
			duck.quack();
			duck.swim();
		}

	}
	/*
	 * OUTPUT SOLUTION:

		MallarDuck:
		display
		Flying with wings
		quacking
		swimming
		
		
		DecoyDuck:
		display
		Can not fly
		can not quack
		swimming
		
		
		RedheadDuck:
		display
		Flying with wings
		quacking
		swimming
		
		
		RubberDuck:
		display
		Can not fly
		squeaking
		swimming
	 */

}