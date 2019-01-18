package lesson4.labs.probC;

import java.time.LocalDate;


public class Order {
	
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	Order(int orderNo, LocalDate orderDate, int orderAmount) {
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
		this.orderNo = orderNo;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderDate=" + orderDate + ", orderAmount=" + orderAmount + "]";
	}

	
	
}
