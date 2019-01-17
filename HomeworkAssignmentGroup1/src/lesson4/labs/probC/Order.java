package lesson4.labs.probC;

import java.time.LocalDateTime;

public class Order {

	
	private int orderNo;
	private LocalDateTime orderDate;
	private double orderAmount;
	
	Order(int orderNo, LocalDateTime orderDate, int orderAmount) {
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
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	
	
	
}
