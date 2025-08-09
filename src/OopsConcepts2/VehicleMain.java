package OopsConcepts2;

public class VehicleMain {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		mycar.displaySpeed();
		mycar.displaySpeed(150);
		mycar.displaySpeed(200);
		mycar.displaySpeed(100, true);
		
		System.out.println("---------------------");
		
		Bike myBike = new Bike();
        myBike.displaySpeed();
        myBike.displaySpeed(100); // Within limit
        myBike.displaySpeed(150); // Above limit
        myBike.displaySpeed(60, true); // mph converted
		
	}
	
}
