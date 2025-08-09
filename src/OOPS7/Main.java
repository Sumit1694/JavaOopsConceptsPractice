package OOPS7;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car = new Car("Nexon", 150);
		Vehicle bike = new Bike("Yamaha", 80);
		
		car.displayInfo();
		System.out.println("Car's max speed: " + car.maxSpeed() + "km/hr");
		
		bike.displayInfo();
		System.out.println("Bike's max speed: " + bike.maxSpeed() + "km/hr");
	}
	
}
