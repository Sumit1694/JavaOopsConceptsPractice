package OopsConcepts2;

import java.time.LocalDate;

public class EmployeeMain {

	public static void main(String[] args) {
		
	
	
	Employee employee1 = new Employee("Charles martin" , 12000, LocalDate.parse("2015-04-01"));
	Employee employee2 = new Employee("Loyd Blair", 35000, LocalDate.parse("2014-04-01"));
	Employee employee3 = new Employee("Maglad cliar", 45000, LocalDate.parse("2011-01-15"));
	
	employee1.printEmployeeDetails();
	System.out.println("Years of Service: " + employee1.getYearsOfService());
	
	employee2.printEmployeeDetails();
	System.out.println("Years of Service: " + employee2.getYearsOfService());
	employee3.printEmployeeDetails();
	System.out.println("Years of Service: " + employee3.getYearsOfService());
	
	}	
}
