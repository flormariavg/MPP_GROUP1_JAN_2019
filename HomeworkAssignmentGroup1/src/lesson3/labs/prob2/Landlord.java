package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Landlord {
	String name;
	List<Building> buildings;
	private double totalProfit;
	
	public Landlord(String name) {
		// TODO Auto-generated constructor stub
		this.buildings=new ArrayList<>();
		this.name=name;
		this.totalProfit=0;
	}
	
	public double getTotalProfit() {
		
		for (Building building : buildings) {
			totalProfit= totalProfit+building.getProfit();
		}
		return totalProfit;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" || Total profit: "+totalProfit+"\n"+Arrays.toString(buildings.toArray())+"\n";
	}

}
