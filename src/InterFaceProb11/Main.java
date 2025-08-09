package InterFaceProb11;

public class Main {

	public static void main(String[] args) {
		
		Vehicle electricCar = new ElectricCar();
		Vehicle motorbike = new Motorbike();
		
		electricCar.start();
		electricCar.service();
		
		motorbike.start();
		motorbike.service();
		
		Vehicle.checkBattery();
		
		
	}
	
}
