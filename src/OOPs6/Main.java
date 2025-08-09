package OOPs6;

public class Main {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new FullTimeEmployee("Alice", 101, 50500);
		employees[1] = new PartTimeEmployee("Charlie", 102, 68000, 4);
		employees[2] = new FullTimeEmployee("Charlie", 103, 70000);
		
		for(Employee emp: employees)
		{
			emp.displayDetails();
			System.out.println("Salary: " + emp.calculateSalary());
			System.out.println("--------------------");
		}
		
	}
}
