package OOPSCOncepts;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Franziska Walter", "HR Manager", 40000);
		Employee employee2 = new Employee("Hubertise Andrea", "Software engineer", 70000);
		
		System.out.println("\nEmployee Details:");
		
		employee1.printEmployeeDetails();
		employee2.printEmployeeDetails();
		
		employee1.raiseSalary(80);
		employee2.raiseSalary(12);
		
		System.out.println("\nAfter raising salary:");
		
		System.out.println("\n80% for Franziska Walter");
		employee1.printEmployeeDetails();
		System.out.println("\n12% for Hubertise Andrea");
		employee2.printEmployeeDetails();	
	}
	
}
