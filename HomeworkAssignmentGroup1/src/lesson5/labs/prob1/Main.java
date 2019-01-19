package lesson5.labs.prob1;

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

}
