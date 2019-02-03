package lesson9.labs.prob9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	/*
	 * 9. In prob9 folder you have a one class called Dish and it has a List menu. In that class implement some
		static methods to decide the following with help of Optional, anyMatch(), allMatch(),
		noneMatch(),findAny(), findFirst() operations from stream.
		a. Is there any Vegetarian meal available ( return type boolean)
		b. Is there any healthy menu have calories less than 1000 ( return type boolean)
		c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
		d. find and return the first item for the type of MEAT( return type Optional<Dish>)
		e. calculateTotalCalories() in the menu using reduce. (return int)
		f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
		e. Implement a main method to test.
	 */

	public static void main(String[] args) {
		// a. Is there any Vegetarian meal available ( return type boolean)
		Predicate<Dish> predicate;
		Function<Dish, String> function;
		predicate=x -> x.isVegetarian();
		System.out.println("a. Is there any Vegetarian meal available ( return type boolean)\n");
		System.out.println(Dish.isThereAny(predicate));
		System.out.println("********************************************************");
		//b. Is there any healthy menu have calories less than 1000 ( return type boolean)
		
		System.out.println("b. Is there any healthy menu have calories less than 1000 ( return type boolean)\n");
		predicate=x->x.getCalories()<1000;
		System.out.println(Dish.isThereAny(predicate));
		System.out.println("********************************************************");
		
		//c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
		System.out.println("c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)\n");
		predicate= x->x.getCalories()>1000;
		System.out.println(Dish.isThereAny(predicate));
		System.out.println("********************************************************");
		
		//d. find and return the first item for the type of MEAT( return type Optional<Dish>)
		System.out.println("d. find and return the first item for the type of MEAT( return type Optional<Dish>)\n");
		predicate= x->x.getType().equals(Dish.Type.MEAT);
		System.out.println(firstItem(predicate));
		System.out.println("********************************************************");

		//e. calculateTotalCalories() in the menu using reduce. (return int)
		System.out.println("e. calculateTotalCalories() in the menu using reduce. (return int)\n");
		System.out.println(calculateTotalCalories());
		System.out.println("********************************************************");
		//f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
		
		System.out.println("f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)");
		System.out.println(calculateTotalCalories());
		System.out.println("********************************************************");
	}
	//a,b,c
	public static boolean isThereAny(Predicate<Dish> predicate) {
		return menu.stream().anyMatch(predicate);
	}
	//d. find and return the first item for the type of MEAT( return type Optional<Dish>)
	public static Optional<Dish> firstItem(Predicate<Dish> predicate) {
		return menu.stream()
		.filter(predicate)
		.findFirst();
	}
	//e. calculateTotalCalories() in the menu using reduce. (return int)
	
	public static int calculateTotalCalories() {
		return menu.stream()
		.map(x->x.getCalories())
		.reduce(0,(x,y)->x+y);
	}
	//f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
	public static int calculateTotalCaloriesMethodReference() {
		return menu.stream()
		.map(x->x.getCalories())
		.reduce(0,Integer::sum);
	}
	
	
	
	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
}