package Encap4;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setEmployeeId(201);
		employee.setEmployeeName("Sumit");
		employee.setEmployeeSalary(243534.34);

		int id = employee.getEmployeeId();
		String name = employee.getEmployeeName();
		double salary =  employee.getEmployeeSalary();
		
		System.out.println("Employee ID:" + id);
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Salary:" + salary);

	}

}
