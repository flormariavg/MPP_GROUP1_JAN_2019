package lesson4.labs.probC;


public abstract class Employee {
	
	private int empId;
	
	Employee(int empId) {
		
		this.empId = empId;
	}
	
	public void print(int month, int year) {
		
		System.out.println("Month/Year Report: " +  month + "/" + year);
		//System.out.println("Current date" + LocalDateTime.now().getMonthValue() + "/"+ LocalDateTime.now().getYear());
		
	}
	public PayCheck calcCompensation(int month, int year) {
		
		double grossPay = this.calcGrossPay(month, year);
		print(month, year);
		PayCheck payCheck = new PayCheck(grossPay, 0.23, 0.05, 0.01, 0.03, 0.075);
		return payCheck;
	}
	
	public int getempId() {
		return empId;
	}
	
	abstract public double calcGrossPay(int month, int year);

}

	