package lesson3.labs.prob1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		boolean isEqual = false;
		if((aPerson instanceof PersonWithJob)) {
			PersonWithJob p = (PersonWithJob)aPerson;
			 isEqual = this.person.getName().equals(p.person.getName()) &&
					this.getSalary()==p.getSalary();
		}
		else return false;
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe",30000);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		
		System.out.println("p1.equals(p2)? " + p1.person.equals(p2.person));
		System.out.println("p2.equals(p1)? " + p2.person.equals(p1.person));
	}


}
