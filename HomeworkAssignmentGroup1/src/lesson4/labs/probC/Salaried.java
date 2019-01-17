package lesson4.labs.probC;

public class Salaried extends Employee{

	private double salary;

	public Salaried(double salary) {
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	
	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
