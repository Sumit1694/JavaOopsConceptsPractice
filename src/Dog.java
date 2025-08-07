
public class Dog {

	private String name;
	private String color;
	
	public Dog(String name, String color)
	{
		this.name=name;
		this.color=color;
	}
	
	public static void main(String[] args) {
		
		Dog d=new Dog("Sumit", "White");
		System.out.println(d.name);
		System.out.println(d.color);
		
	}
	
}
