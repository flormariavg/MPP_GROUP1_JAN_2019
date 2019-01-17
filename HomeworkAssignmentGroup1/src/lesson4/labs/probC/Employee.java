package lesson4.labs.probC;

import java.util.List;

public abstract class Employee {
	
	private int empId;
	
	Employee(int empId) {
		
		this.empId = empId;
	}
	
	public void print() {
		
	}
	
	public PayCheck calcCompensation(List<Employee> employeeList, int month, int year) {
		if (employeeList == null)
			return null;
		
		for (Employee employee : employeeList) {
			
			if (employee instanceof Commissioned) {
				double total = ((Commissioned) employee).calcGrossPay() +  ((Commissioned) employee).getCommission()*((Commissioned)employee).getTotalAmountOrder(month, year);
			}
			
		}
		
		return null;
	}
	abstract public double calcGrossPay();

}

	