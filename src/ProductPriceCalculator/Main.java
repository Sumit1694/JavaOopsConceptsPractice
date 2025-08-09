package ProductPriceCalculator;

public class Main {

	public static void main(String[] args) {
		
	
	Product p1 = new Product("Laptop" , 50000);
	Product p2 = new Product("Phone" , 20000, 2);
	Product p3 = new Product("Headphones");
	
	p1.displayInfo();
	p2.displayInfo();
	p3.displayInfo();
	
	System.out.println("Laptop Total price: " + p1.calculateTotalPrice());
	System.out.println("Phone price after 10% discount: "+p2.calculateTotalPrice(10));
	System.out.println("Headphones price with extra fee 50 and 5% discount: " + p3.calculateTotalPrice(50 , 5));
	
	}
}
