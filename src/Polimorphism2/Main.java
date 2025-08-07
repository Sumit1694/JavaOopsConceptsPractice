package Polimorphism2;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Manager("Sumit rane", 57000.43, 2323.32);
		Employee emp2 = new Programmer("Komal adani", 2435.42, 23453.34);
		
		System.out.println("Manager:" + emp1.getName() + "\nRole:" + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
		System.out.println("Programmer:" + emp2.getName() + "\nRole:" + emp2.getRole() + "\nSalary: $"+ emp2.calculateSalary());
	}
}
