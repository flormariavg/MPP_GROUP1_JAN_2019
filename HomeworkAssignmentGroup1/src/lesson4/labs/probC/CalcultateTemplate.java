package lesson4.labs.probC;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CalcultateTemplate {

	
	List<Employee> employeeList;
	List<Order> orderList;
	
	CalcultateTemplate(){
		
		
	}
	
	public  void reportEmployeeSalary(int month, int year) {
		
		createEmployeeList();
		
		for (Employee employee : employeeList) {
			System.out.println("EmployeeID = " + employee.getempId() + "  " + employee.toString());
			PayCheck payCheck = employee.calcCompensation(11, 2018);
			payCheck.getNetPay();
			payCheck.print();
		}
		
	}
	
	public void createEmployeeList() {
	
		employeeList = new ArrayList<Employee>();
		Employee e = new Hourly(15, 20, 1);
		Employee e2 = new Hourly(12, 20, 2);
		Employee e3 = new Salaried(2000, 3);
		Employee e4 = new Salaried(4000, 4);
		Commissioned e5 = new Commissioned(1500, 0.1, 5);
		Commissioned e6= new Commissioned(2000, 0.15, 6);
		e5.setOrderList(createOrder());
		
		employeeList.add(e);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
	    employeeList.add(e6);
		
		
	}
	
	public List<Order> createOrder() {
		
		orderList = new ArrayList<Order>();
		
		LocalDate orderDate = LocalDate.of(2018, Month.OCTOBER, 29);
		Order order = new Order(1, orderDate, 500);
		//orderDate = LocalDate.of(2018, Month.OCTOBER, 28);
		//Order order1 = new Order(2, orderDate, 300);
		
		orderList.add(order);
		//orderList.add(order1);

		return orderList;
	}
	
	public static void main(String []args) {
		
		CalcultateTemplate cal = new CalcultateTemplate();
		cal.reportEmployeeSalary(10, 2018);
		
	}
	
}

