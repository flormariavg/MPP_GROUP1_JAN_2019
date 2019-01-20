package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.*;

public class Main {
	public static void main(String[] args) {
		
	Customer cust = CustomerOrderFactory.createCustomerOrder("Bob");
	Order order = CustomerOrderFactory.addNewOrder(cust,LocalDate.now());
	CustomerOrderFactory.addItem(order, "Shirt");
	CustomerOrderFactory.addItem(order, "Laptop");
	
	Order order1 = CustomerOrderFactory.addNewOrder(cust,LocalDate.now());
	CustomerOrderFactory.addItem(order1, "Pants");
	CustomerOrderFactory.addItem(order1, "Knife set");
	System.out.println(cust);
}
	
	/*
	 * OUTPUT SOLUTION:
	 * 
	 * Customer [name=Bob, orders=[2019-01-19: [Shirt, Laptop], 2019-01-19: [Pants, Knife set]]]
	 */
}

		
