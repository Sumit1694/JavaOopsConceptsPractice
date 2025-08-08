package Encap6;

public class DesktopMain {

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		desktop.setBrand("ComputerMaster");
		desktop.setProcessor("Intel Core i7");
		desktop.setramSize(32);
		
		desktop.upgradeRam(32);
		
		System.out.println("Brand: " + desktop.getBrand());
		System.out.println("Processor: " + desktop.getProcessor());
		System.out.println("Ram Size: " + desktop.getramSize() + "GB");
		
	}
	
}
