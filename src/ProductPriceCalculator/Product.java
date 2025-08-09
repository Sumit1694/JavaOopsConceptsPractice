package ProductPriceCalculator;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	
	public Product(String name, double price, int quantity)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public Product(String name)
	{
		this.name=name;
		this.price=100.0;
		this.quantity = 1;
	}
	
	public double calculateTotalPrice()
	{
		return price*quantity;
	}
	
	public double calculateTotalPrice(double discountPercentage)
	{
		double total = price * quantity;
		return total - (total*discountPercentage/100);
	}
	
	public double calculateTotalPrice(double extraFee, double discountPercentage)
	{
		double total = (price*quantity) + extraFee;
		return total - (total*discountPercentage/100);
	}
	
	public void displayInfo()
	{
		System.out.println("Product: " + name + ", price: " + price + ", Quantity: " + quantity);
	}
	
}
