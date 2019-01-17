package lesson4.labs.probC;

import java.util.ArrayList;
import java.util.List;

public class CalcultateTemplate {

	
	List<Employee> employeeList;
	
	CalcultateTemplate(){
		
		
	}
	
	public void reportEmployeeSalary() {
		
		createEmployeeList();
		
		
	}
	
	public void createEmployeeList() {
	
		employeeList = new ArrayList<Employee>();
		Employee e = new Hourly(15, 20, 1);
		Employee e2 = new Hourly(12, 20, 2);
		Employee e3 = new Salaried(2000, 3);
		Employee e4 = new Salaried(4000, 4);
		Employee e5 = new Commissioned(1500, 0.1, 5);
		Employee e6= new Commissioned(2000, 0.15, 6);
		
		employeeList.add(e);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		
		
	}
	
	
	
}

