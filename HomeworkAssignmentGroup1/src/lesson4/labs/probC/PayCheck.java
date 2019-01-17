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
		
	}
	private double getNetPercent() {
		return  (this.fica + this.state + this.local + this.medicare + this.socialSecurity)/100;
	}
	public double getNetPay() {
		
		return grossPay - (grossPay* getNetPercent());
	}
	
	

}
