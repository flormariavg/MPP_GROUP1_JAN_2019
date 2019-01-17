package lesson3.labs.prob1B;

import java.util.Objects;

public  class Person {
	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}

	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}
	@Override 
	public int hashCode() {
		return Objects.hash(name);
	}
}