package PolyMor13;

public class EmployeeTestMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee(50000);
		Manager mgr = new Manager(70000, 10000);
		Developer dev = new Developer(60000, 8000);
		
		System.out.println("Employee salary:" + emp.calculateSalary());
		System.out.println("Manager Salary: " + mgr.calculateSalary());
		System.out.println("Developer Salary: " + dev.calculateSalary());
		
		System.out.println("Employee salary with 10% bonus: " + emp.calculateSalary(10));
		System.out.println("Manager salary with 10% bonus: " + mgr.calculateSalary(10));
		System.out.println("Developer salary with 10% bonus: "+ dev.calculateSalary(10));
		
	}
}