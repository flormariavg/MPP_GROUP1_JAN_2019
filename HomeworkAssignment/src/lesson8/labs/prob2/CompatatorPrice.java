package lesson8.labs.prob2;

import java.util.Comparator;

public class CompatatorPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice()>o2.getPrice()) return 1;
		else if(o1.getPrice()<o2.getPrice()) return -1;
		else return 0;
	}
	
	

}
