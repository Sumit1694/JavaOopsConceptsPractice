abstract class Car
{
	abstract public void fuelType();
	
	public void color()
	{
		System.out.println("Black color");
	}
}

class tata extends Car
{
	public void fuelType()
	{
		System.out.println("Diesel");
	}
}

public class Abstraction001 {

	public static void main(String[] args) {
		tata nexon=new tata();
		nexon.color();
		nexon.fuelType();
	}
}
