package lesson4.labs.probC;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CalcultateTemplate {

	
	List<Employee> employeeList;
	
	Commissioned commissioned;
	
	public Commissioned createCommissioned(double baseSalary, double commission, int empId) {
		commissioned = new Commissioned(baseSalary, commission, empId);
		return commissioned;
		
	}
	public void createOrder(int orderNo, LocalDate orderDate, int orderAmount) {
		Order order= new Order(orderNo, orderDate, orderAmount);
		commissioned.getOrderList().add(order);
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
	
		CalcultateTemplate calcultateTemplate = new CalcultateTemplate();
		Commissioned commissioned = calcultateTemplate.createCommissioned(1500, 0.1, 5);
		calcultateTemplate.createOrder(10, LocalDate.now(), 100);
		calcultateTemplate.createOrder(1, LocalDate.of(2018, Month.OCTOBER, 29), 500);
		calcultateTemplate.createOrder(2, LocalDate.of(2018, Month.OCTOBER, 29), 300);
		calcultateTemplate.createOrder(3, LocalDate.of(2018, Month.OCTOBER, 28),400);
		
		Commissioned commissioned2 = calcultateTemplate.createCommissioned(2000, 0.15, 6);
		calcultateTemplate.createOrder(10, LocalDate.now(), 100);
		calcultateTemplate.createOrder(1, LocalDate.of(2018, Month.OCTOBER, 29), 500);
		calcultateTemplate.createOrder(2, LocalDate.of(2018, Month.OCTOBER, 29), 300);
		calcultateTemplate.createOrder(3, LocalDate.of(2018, Month.OCTOBER, 28),400);
		
		
		
		
		employeeList = new ArrayList<Employee>();
		Employee e = new Hourly(15, 20, 1);
		Employee e2 = new Hourly(12, 20, 2);
		Employee e3 = new Salaried(2000, 3);
		Employee e4 = new Salaried(4000, 4);
		
		
		employeeList.add(e);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(commissioned);
	    employeeList.add(commissioned2);
		
		
	}
	
	
	public static void main(String []args) {
		
		CalcultateTemplate cal = new CalcultateTemplate();
		cal.reportEmployeeSalary(10, 2018);
		
	}
	
	/*
	 * OUTPUT SOLUTION:
	 * 
	 * 	EmployeeID = 1  Hourly => hourlyWage = 15.0 hoursPerWeek= 20.0
		Month/Year Report: 11/2018
		grossPay = 1200.0 netPay = 725.9999999999999
		EmployeeID = 2  Hourly => hourlyWage = 12.0 hoursPerWeek= 20.0
		Month/Year Report: 11/2018
		grossPay = 960.0 netPay = 580.8
		EmployeeID = 3  Salaried -> salary = 2000.0
		Month/Year Report: 11/2018
		grossPay = 2000.0 netPay = 1210.0
		EmployeeID = 4  Salaried -> salary = 4000.0
		Month/Year Report: 11/2018
		grossPay = 4000.0 netPay = 2420.0
		EmployeeID = 5  Commissioned => commission = 0.1 baseSalary= 1500.0
		Month/Year Report: 11/2018
		grossPay = 1620.0 netPay = 980.0999999999999
		EmployeeID = 6  Commissioned => commission = 0.15 baseSalary= 2000.0
		Month/Year Report: 11/2018
		grossPay = 2180.0 netPay = 1318.8999999999999
	 */
	
}

