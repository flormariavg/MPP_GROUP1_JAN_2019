package lesson10.labs.prob3;
import java.util.*;
import java.util.function.*;


public class Main {
	//could return list.contains(s), but this does not generalize
	

	public static <T> boolean contains(List<? extends T> list, T e, 
				BiPredicate<? super T,? super T> pred2) {
			for(T emp: list) {
				if(emp == null && e == null) return true;
				if(emp == null || e == null) continue;
				if(pred2.test(emp, e)) return true;
			}
			return false;	
		}
	public static boolean contains1(List<String> list, String s) {
		for(String x: list) {
			if(x == null && s == null) return true;
			if(s == null || x == null) continue;
			if(x.equals(s)) return true;
		}
		return false;	
	}
	
	public static boolean contains2(List<Employee> list, Employee e, 
			BiPredicate<Employee,Employee> pred2) {
		for(Employee emp: list) {
			if(emp == null && e == null) return true;
			if(emp == null || e == null) continue;
			if(pred2.test(emp, e)) return true;
		}
		return false;	
	}
	
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		Employee e = new Employee(1001, "Joe", 50000);
		boolean foundIt = Main.contains2(list, e, (e1,e2) -> e1.getId()==e2.getId());
		System.out.println(foundIt);		
	}
	
	public static void test3() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 50000, 500);
		boolean foundIt = Main.contains(list, m, 
				(Employee e1, Employee e2) -> e1.getId()==e2.getId());
		System.out.println(foundIt);		
	}
	
	public static void test4() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 50000, 500);
		boolean foundIt = Main.contains(list, m, 
			(Employee e, Person p) -> e.getName().equals(p.getName()));
		System.out.println(foundIt);		
	}
	
	public static void test5() {
		List<CheckingAccount> list = new ArrayList<>();
		list.add(new CheckingAccount(1001, 25.00));
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1003, 125.00));
		
		Account a = new CheckingAccount(1002, 35.00);
		boolean foundIt = Main.contains(list, a, 
			(Account a1, Account a2) -> a1.getAcctId()==a2.getAcctId());
		System.out.println(foundIt);		
	}
	
	
	
	public static void main(String[] args) {
		System.out.print("Test 1: ");
		test1();
		System.out.print("\nTest 2: ");
		test2();
		System.out.print("\nTest 3: ");
		test3();
		System.out.print("\nTest 4: ");
		test4();
		System.out.print("\nTest 5: ");
		test5();
	}	
		
	/*
	 * OUTPUT SOLUTION:

		Test 1: true
		
		Test 2: true
		
		Test 3: true
		
		Test 4: true
		
		Test 5: true
	 */
	
}