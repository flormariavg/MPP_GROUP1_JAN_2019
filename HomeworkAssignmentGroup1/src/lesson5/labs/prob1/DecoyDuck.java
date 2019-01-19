package lesson5.labs.prob1;

public class DecoyDuck  extends Duck{
	
	DecoyDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("display");
		
	}

}
