package lesson2.labs.prob2B;

public class OrderLine {
	private int linenum;
	private double price;
	private int quantity;
	private Order order;

	public OrderLine(int linenum, Order order, int quantity, double price) {
		this.linenum = linenum;
		this.quantity = quantity;
		this.price = price;
		this.order = order;
		
	}

	public int getLinenum() {
		return linenum;
	}

	public Order getOrder() {
		return order;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "OrderLine [linenum=" + linenum + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
}
