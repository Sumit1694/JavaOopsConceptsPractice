package OOPS3;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new FullTimeEmployee(101, "John Doe", 50000);
		Employee e2 = new PartTimeEmployee(102, "Jane Smith", 300, 20);
		
		System.out.println("\n=== Full-Time Employee Details ===");
		e1.displayDetails();
		
		System.out.println("\n=== Part-Time Employee Details ===");
		e2.displayDetails();
		
	}
}
