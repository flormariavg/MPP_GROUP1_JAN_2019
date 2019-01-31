package lesson8.labs.prob3;

import java.util.function.Predicate;

public class MyClass {
	
	private String name;
	private int salary;
	
	
	public MyClass(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}


	public static void main(String[] args) {
		
		MyClass class1 = new MyClass("Flor", 9);
		MyClass class2 = new MyClass("Flor", 9);
		
		System.out.println(class1+ " is " + class1.myMethod(class2)+ " "+class2);
		
	}
	
	
	public boolean  myMethod(MyClass cl) {
		Predicate<Object> p= this::equals;
		return p.test(cl);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) return false;
		if(!(obj instanceof MyClass)) return false;
		MyClass myClass= (MyClass)obj;
		return myClass.getName().equals(this.getName()) && myClass.getSalary()==this.getSalary();
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+ " "+ salary;
	}
	
	/*
	 * OUTPUT SOLUTION

 		Flor 9 is true Flor 9
	 */
	

}
