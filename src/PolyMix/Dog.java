package PolyMix;

public class Dog extends Animal {

	void makeSound()
	{
		System.out.println("******** Dog Bark *******");
	}
	
	public void makeSound(int times)
	{
		for(int i=0;i<times;i++)
		{
			System.out.print("Bark ");
		} 
		System.out.println();
	}
}
