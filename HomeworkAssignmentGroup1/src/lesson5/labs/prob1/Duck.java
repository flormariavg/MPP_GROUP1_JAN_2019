package lesson5.labs.prob1;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void swim() {
		
		System.out.println("swimming");
		
	}
	public void fly() {
		flyBehavior.fly();
		
	}
	public void quack() {
		quackBehavior.quack();
	}
	public abstract void display();
	
}
