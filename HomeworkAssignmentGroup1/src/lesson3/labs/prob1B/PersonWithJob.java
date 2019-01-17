package lesson3.labs.prob1B;

import java.util.Objects;

public class PersonWithJob{
private double salary;
public Person person;
	public double getSalary() {
		return salary;
	}
	PersonWithJob(Person  p, double s) {
	   person=p;
		salary = s;
	}
	
@Override
public boolean equals(Object aPerson) {
	if(aPerson == null) return false; 
	if(!(aPerson instanceof PersonWithJob)) return false;
	PersonWithJob p = (PersonWithJob)aPerson;
	
if (this.person.getName().equals(p.person.getName())&& this.getSalary()==p.getSalary()) { return true;}
			;
	return false;
	}

@Override
public int hashCode() {
	return Objects.hash(person,salary);
}
	
}