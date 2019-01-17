package lesson4.labs.probC;

public abstract class Employee {
	
	private int empId;
	
	public void print() {
		
	}
	
	public PayCheck calcCompensation() {
		
		return new PayCheck();
	}
	
	abstract public double calcGrossPay();

}
