package lesson9.labs.prob10;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

/*
 * 10. In prob10 folder there is ConstructorReference.java file. Three queries are available in the main
	method. Implement those.
 */
public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	System.out.println("Query 1  : Print only Female canditates names\n");
		Arrays.asList(list).stream()
		.filter(x->x.getGender().equals("Female"))
		.forEach(x->System.out.println(x));

    // Query 2 : Create an objecy by choosing suitable Interface to the specified constructors
	// (Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status 
		System.out.println("****************************************************************************");
		System.out.println("Query 2 : Create an objecy by choosing suitable Interface to the specified constructors\n");
		MyFunction<Human> myFunction= Human::new;
		Human human1 = myFunction.apply();
		
		System.out.println(human1);
		
		Function<String, Human>  function1 = Human::new;
		Human human2 = function1.apply("Flor");
		
		System.out.println(human2);
		
		BiFunction<String, Integer, Human> biFunction= Human::new;
		Human human3= biFunction.apply("Ann", 25);
		
		System.out.println(human3);
		
		TriFunction<String, Integer, String, Human> triFunction= Human::new;
		Human human4= triFunction.apply("Jhon", 32, "Male");
		
		System.out.println(human4);
		
	// Query 3 : Count the male candidates whose age is more than 30
		
		long maleCandidate= Arrays.asList(list).stream()
		.filter(x->x.getGender().equals("Male") && x.getAge()>30)
		.count();
		
		System.out.println("****************************************************************************");
		System.out.println("Query 3 : Count the male candidates whose age is more than 30");
		System.out.println(maleCandidate);
    
   }
/*
 * OUTPUT SOLUTION:

	Query 1  : Print only Female canditates names
	
	Human [name=Jane, age=45, gender=Female]
	****************************************************************************
	Query 2 : Create an objecy by choosing suitable Interface to the specified constructors
	
	Human [name=null, age=0, gender=null]
	Human [name=Flor, age=0, gender=null]
	Human [name=Ann, age=25, gender=null]
	Human [name=Jhon, age=32, gender=Male]
	****************************************************************************
	Query 3 : Count the male candidates whose age is more than 30
	1
 */

}
