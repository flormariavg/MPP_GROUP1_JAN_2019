package prob3;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack{
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		CannotFly.super.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		MuteQuack.super.quack();
	}

}
