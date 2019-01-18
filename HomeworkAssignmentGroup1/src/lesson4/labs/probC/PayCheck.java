package lesson4.labs.probC;

final public class PayCheck {
	
	private double grossPay = 23;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	

	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		
	}
	public void print() {
		
		System.out.println("grossPay = " + grossPay + " netPay = " + getNetPay());
		
	}
	private double getNetPercent() {
		return  (this.fica + this.state + this.local + this.medicare + this.socialSecurity);
	}
	public double getNetPay() {
		
		return grossPay - (grossPay* getNetPercent());
	}
	
	

}
