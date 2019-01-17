package lesson4.labs.probC;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	
	private List<Order> orderList;
	
	public Commissioned(double baseSalary, double commission, int empId) {
		// TODO Auto-generated constructor stub
		super(empId);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double calcGrossPay() {
		
		return getBaseSalary();
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
	
	public double getTotalAmountOrder(int month, int year) {
		
		if (month == 1) {
			month = month -1;
			year = year -1;
		}
		
		double total = 0.0;
		if (orderList != null) {
			
			for (Order order : orderList) {
				if ( order.getOrderDate().getMonth().getValue() == month && order.getOrderDate().getYear() == year) {
					total += order.getOrderAmount();
				}
				
			}
			
		} 
		return total;

	}
	
	
}
