package Polimorphism1;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1=new Manager("Sumit rane", 7500.0,2500.3);
		Employee emp2=new Programmer("Suresh bhatt", 45000.0, 230.38);
		
		System.out.println("Manager:" + emp1.getName() +"\nRole: " +emp1.getRole() +"\nSalary: $" + emp1.calculateSalary());
		
		System.out.println("Programmer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());
		
	}
}
