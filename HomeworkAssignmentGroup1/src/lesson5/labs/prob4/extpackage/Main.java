package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.*;

public class Main {
	public static void main(String[] args) {
	Customer cust = CustomerOrderFactory.createCustomerOrder("Bob");
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust);
	}
	
	/*
	 * OUTPUT SOLUTION:
	 * 
	 * Customer [name=Bob, orders=[2019-01-19: [Shirt, Laptop], 2019-01-19: [Pants, Knife set]]]
	 */
}

		
