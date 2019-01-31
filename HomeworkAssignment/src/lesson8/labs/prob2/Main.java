package lesson8.labs.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	static enum SortProduct{PRICE,TILE;}
	
	public static List<Product> sort(List<Product> products, final SortProduct sp) {
		
		class ComparatorProduct implements Comparator<Product>{
			
			public int compare(Product p1, Product p2) {
				if(sp.equals("PRICE")) {
					if(p1.getPrice()>p1.getPrice()) return 1;
					else if (p1.getPrice()<p1.getPrice()) return -1;
					else return 0;
					
				}else
					return p1.getTitle().compareTo(p2.getTitle());
			}
		}
		Collections.sort(products, new ComparatorProduct());
		
		return products;
		
	}
	public static void main(String[] args) {
		Product p1= new Product("P1", 50.0, 11);
		Product p2= new Product("P5", 300.0, 131);
		Product p3= new Product("P2", 240.0, 114);
		Product p4= new Product("P8", 140.0, 511);
		Product p5= new Product("P1", 590.0, 811);
		
		List<Product> products= new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		System.out.println("List with out sort: ");
		System.out.println(products.toString());
		
		/*
		 * a. Sort by implementing a comparator for price attribute and print product list
		 */
		System.out.println("********************************************************");
		System.out.println("\na. Sort by implementing a comparator for price attribute and print product list ");
		Collections.sort(products, new CompatatorPrice());
		System.out.println(products.toString());
		
		/*
		 * Sort by implementing a comparator for title attribute and print product list.
		 */
		System.out.println("********************************************************");
		System.out.println("\nb. Sort by implementing a comparator for title attribute and print product list ");
		Collections.sort(products, new ComparatorTitle());
		System.out.println(products);
		
		/*
		 * c. Implement the sort method so that only one type of Comparator is used for the task a & b in a
			Java 7 Way using closure
		 */
		System.out.println("********************************************************");
		System.out.println("\nc. Implement the sort method so that only one type of Comparator is used for the task a & b in a Java 7 Way using closure ");
		List<Product> productsSortPrice= Main.sort(products,SortProduct.PRICE );
		List<Product> productsSortTitle= Main.sort(products,SortProduct.TILE );
		System.out.println("\nSort list by price using closure: ");
		System.out.println(productsSortPrice.toString());
		System.out.println("\nSort list by title using closure: ");
		System.out.println(productsSortTitle.toString());
		
		/*
		 * . If the title is same use model as another attribute to sort. Do this by using lambdas.(Java 8 Way)
		 */
		System.out.println("********************************************************");
		System.out.println("\nd. If the title is same use model as another attribute to sort. Do this by using lambdas  ");
		
		Collections.sort(products, 
				(p8,p9)-> 
				{
					if(p8.getTitle().compareTo(p9.getTitle())!=0) return p8.getTitle().compareTo(p9.getTitle());
					else {
						if(p8.getModel()>p9.getModel()) return 1;
						else if (p8.getModel()<p9.getModel()) return -1;
						else return 0;
						}
				
				}
					
				
		);
		 
		System.out.println(products);
	}
	
	/*
	 *SOLUTION OUTPUT:
	 * 
	 * List with out sort: 
		[
		 P1 : 50.0 : 11, 
		 P5 : 300.0 : 131, 
		 P2 : 240.0 : 114, 
		 P8 : 140.0 : 511, 
		 P1 : 590.0 : 811]
		********************************************************
		
		a. Sort by implementing a comparator for price attribute and print product list 
		[
		 P1 : 50.0 : 11, 
		 P8 : 140.0 : 511, 
		 P2 : 240.0 : 114, 
		 P5 : 300.0 : 131, 
		 P1 : 590.0 : 811]
		********************************************************
		
		b. Sort by implementing a comparator for title attribute and print product list 
		[
		 P1 : 50.0 : 11, 
		 P1 : 590.0 : 811, 
		 P2 : 240.0 : 114, 
		 P5 : 300.0 : 131, 
		 P8 : 140.0 : 511]
		********************************************************
		
		c. Implement the sort method so that only one type of Comparator is used for the task a & b in a Java 7 Way using closure 
		
		Sort list by price using closure: 
		[
		 P1 : 50.0 : 11, 
		 P1 : 590.0 : 811, 
		 P2 : 240.0 : 114, 
		 P5 : 300.0 : 131, 
		 P8 : 140.0 : 511]
		
		Sort list by title using closure: 
		[
		 P1 : 50.0 : 11, 
		 P1 : 590.0 : 811, 
		 P2 : 240.0 : 114, 
		 P5 : 300.0 : 131, 
		 P8 : 140.0 : 511]
		********************************************************
		
		d. If the title is same use model as another attribute to sort. Do this by using lambdas  
		[
		 P1 : 50.0 : 11, 
		 P1 : 590.0 : 811, 
		 P2 : 240.0 : 114, 
		 P5 : 300.0 : 131, 
		 P8 : 140.0 : 511]

	 */

}
