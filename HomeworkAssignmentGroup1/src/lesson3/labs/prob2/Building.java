package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Building {
	
	List<Apartment> apartments;
	private String name;
	private double maintenanceCost;
	private double profit;
	
	public Building(String name,double maintenanceCost) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.maintenanceCost=maintenanceCost;
		this.apartments= new ArrayList<>();
		profit=0;
	}

	public List<Apartment> getApartments() {
		
		return apartments;
	}

	public double getProfit() {
		for (Apartment apartment : apartments) {
			profit=profit+apartment.getRent();
		}
		profit=profit-maintenanceCost;
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Name: "+ name +" || Maintenance Cost:"+maintenanceCost+" || Profit: "+ profit + "\n  " +Arrays.toString(apartments.toArray())+"\n ";
	}

}
