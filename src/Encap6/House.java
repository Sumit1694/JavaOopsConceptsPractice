package Encap6;

public class House {

	private String address;
	private int NumberOfRooms;
	private double area;
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setNumberOfRooms(int NumberOfRooms)
	{
		this.NumberOfRooms = NumberOfRooms;
	}
	
	public int getNumberOfRooms()
	{
		return NumberOfRooms;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public double calculatePrice(double pricePerSquareMeter)
	{
		return this.area * pricePerSquareMeter;
	}
	
}
