package OOPS7;

public class Vehicle {

	 String brand;
	 double speed;
	
	 public Vehicle(String brand, double speed)
	 {
		 this.brand=brand;
		 this.speed=speed;
	 }
	 
	public void displayInfo()
	{
		System.out.println("Brand: " + brand + ", Speed:" + speed + " km/hr");
	}
	
	public double maxSpeed()
	{
		return 120;
	}
	
}
