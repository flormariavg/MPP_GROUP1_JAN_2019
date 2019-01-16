package lesson2.labs.prob2B;

public class Main {
	
	public static void main(String[] args) {
		Order order= new Order(2, "01/16/2019");
		order.addOrderLine(1, 2, 100);
		order.addOrderLine(2, 4, 50);
		order.addOrderLine(3, 1, 200);
		
		System.out.println(order);
	}

	/*
	 * OUTPUT SOLUTION:

		Order Number: 2
		Order Date: 2019-01-16
		Order Lines:
		 [OrderLine [linenum=1, price=100.0, quantity=2], OrderLine [linenum=2, price=50.0, quantity=4], OrderLine [linenum=3, price=200.0, quantity=1]]
	 */
}
