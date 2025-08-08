package Encap6;

public class Desktop {

	private String brand;
	private String processor;
	private int ramSize;
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setProcessor(String processor)
	{
		this.processor=processor;
	}
	
	public String getProcessor()
	{
		return processor;
	}
	
	public void setramSize(int ramSize)
	{
		this.ramSize = ramSize;
	}
	
	public int getramSize()
	{
		return ramSize;
	}
	
	public void upgradeRam(int additionalRam)
	{
		if(additionalRam > 0)
		{
			this.ramSize=this.ramSize+additionalRam;
		}
	}
}
