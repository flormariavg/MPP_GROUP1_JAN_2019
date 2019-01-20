package lesson5.labs.prob4;

import java.time.LocalDate;
public class CustomerOrderFactory {

	private CustomerOrderFactory() {
		
	}
	 
	public static Customer createCustomerOrder(String custName) {
		Customer customer=new Customer(custName);	
		return customer;		
	}
	public static Order addNewOrder(Customer customer,LocalDate orderDate ) {
		Order order= Order.newOrder(customer,orderDate);
		return order ;
	}
	
	public static Item addItem(Order o,String itemName) {
		Item i= new Item(itemName);
		o.addItem(itemName);
		return i;
	}

}
