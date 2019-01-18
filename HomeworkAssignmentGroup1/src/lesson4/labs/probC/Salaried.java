package lesson4.labs.probC;

public class Salaried extends Employee{

	private double salary;

	public Salaried(double salary, int empId) {
		// TODO Auto-generated constructor stub
		super(empId);
		this.salary = salary;
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return this.salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Salaried -> salary = " + salary;
	}
	
	
}
