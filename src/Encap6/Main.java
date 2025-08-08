package Encap6;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setCompany("Chevrolet");
		car.setModelName("Cruze");
		car.setYear(2050);
		//melege is not set using setters method
		
		String company_name = car.getCompanyName();
		String model_name = car.getModelName();
		int year = car.getYear();
		double miledge = car.getmileage();
		
		System.out.println("Company name: " + company_name);
		System.out.println("Model_name: " + model_name);
		System.out.println("Year: " + year);
		System.out.println("Miledge: " + miledge);
		
	}
	
}
