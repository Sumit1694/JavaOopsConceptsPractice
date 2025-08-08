package Encap6;

public class HouseMain {

	public static void main(String[] args) {
		
		House house = new House();
		
		house.setAddress("ABC Main rd.");
		house.setNumberOfRooms(5);
		house.setArea(130.5);
		
		double price = house.calculatePrice(2000);
		
		System.out.println("Address: " + house.getAddress());
		System.out.println("Number of rooms: " + house.getNumberOfRooms());
		System.out.println("Area: " + house.getArea() + "sq meters");
		System.out.println("Price: $" + price);
		
	}
	
}
