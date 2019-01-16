package lesson2.labs.prob2B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
	private int ordernum;
	private LocalDate orderDate;
	private List<OrderLine> orderlines;
	

	public Order(int orderNum, String orderDate) {
		this.ordernum = orderNum;
		this.orderlines = new ArrayList<>();
		this.orderDate = LocalDate.parse(orderDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	}

	public void addOrderLine(int linenum, int quantity, double price) {
		
		orderlines.add(new OrderLine(linenum, this, quantity, price));
	}
	
	public int getOrderNum() {
		return ordernum;
	}

	public List<OrderLine> getorderLine() {
		return orderlines;
	}

	public String getOrderDate() {
		return orderDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order Number: "+ordernum+"\n"+"Order Date: "+orderDate+"\n"+"Order Lines:\n "+Arrays.toString(orderlines.toArray());
	}
}
