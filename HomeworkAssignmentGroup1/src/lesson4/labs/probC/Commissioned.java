package lesson4.labs.probC;


import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	
	private List<Order> orderList;
	
	public Commissioned(double baseSalary, double commission, int empId) {
		// TODO Auto-generated constructor stub
		super(empId);
		this.baseSalary = baseSalary;
		this.commission = commission;
		orderList= new ArrayList<>();
	}

	@Override
	public double calcGrossPay(int month, int year) {
		double grossPay=0;
		month=month-1;
		if(month==0) {
			month=12;
			year=year-1;
		}
		for (Order order : orderList) {
				
			if(month==order.getOrderDate().getMonthValue() && year==order.getOrderDate().getYear()) 
				grossPay= grossPay+ order.getOrderAmount();
			
		}
		return baseSalary+(commission*grossPay);
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	@Override
	public String toString() {
		return "Commissioned => commission = " + commission + " baseSalary= " + baseSalary;
	}
	
}
