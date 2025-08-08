package Encap6;

public class SmartPhone {

	private String brand;
	private String model;
	private int storageCapacity;
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setStorageCapacity(int storageCapacity)
	{
		this.storageCapacity=storageCapacity;
	}
	
	public int getStorageCapacity()
	{
		return storageCapacity;
	}
	
	public void increaseStorage(int additionalStorage)
	{
		if(additionalStorage > 0)
		{
			this.storageCapacity = this.storageCapacity + additionalStorage;
		}
	}
	
	
	
}
