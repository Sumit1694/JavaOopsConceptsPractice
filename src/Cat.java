
public class Cat {

	private String name;
	private int age;
	
	public Cat()
	{
		this.name="unknown";
		this.age=0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		
		System.out.println("Cat name is:" + myCat.getName());
		System.out.println("Cat age is:" + myCat.getAge());
		
	}
	
}
