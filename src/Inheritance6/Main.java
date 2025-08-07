package Inheritance6;

import Inheritance2.main;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("Kortney", "Rosale", 4451, "HR Manager");
		
		System.out.println(employee1.getFirstName() + " " +employee1.getLastName() + "(" + employee1.getEmployeeId() +")");
		
		Employee employee2 = new Employee("Junior", "Philipia", 4452, "Software Manager");
		
		System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "(" + employee2.getEmployeeId() +")");
		
	}
	
	
}
