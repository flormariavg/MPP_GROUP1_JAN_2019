package lesson5.labs.prob1;

public class MallarDuck  extends Duck {
	
	MallarDuck () {
		
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

}
