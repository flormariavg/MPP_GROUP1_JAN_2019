package lesson3.labs.prob1B;

public class Main {
	public static void main(String[] args) {

		Person p2 = new Person("Joe");
		PersonWithJob p1 = new PersonWithJob(new Person("Joe"), 30000.00);
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.person.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1.person));

	}
	
	/*
	 * OUTPUT SOLUTION:
	 * 	p1.equals(p2)? true
		p2.equals(p1)? true
	 */

}
