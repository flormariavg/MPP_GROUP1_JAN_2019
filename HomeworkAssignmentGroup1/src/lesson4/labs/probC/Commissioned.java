package lesson4.labs.probC;

import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	
	private List<Order> orderList;
	
	public Commissioned(double baseSalary) {
		// TODO Auto-generated constructor stub
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return 0;
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
	
	
}
