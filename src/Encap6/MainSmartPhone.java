package Encap6;

public class MainSmartPhone {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		
		phone.setBrand("SmartMobile");
		phone.setModel("W10000");
		phone.setStorageCapacity(60);
		
		phone.increaseStorage(30);
		
		System.out.println("Brand: " + phone.getBrand());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Storage capacity: " + phone.getStorageCapacity() + "GB");
		
	}
	
}
