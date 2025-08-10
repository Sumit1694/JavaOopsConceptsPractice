package ExceptionHandling;

public class FinallyUnderstanding {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Learn Coding");
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);
			System.out.println("Like share");
		}
		catch(NullPointerException a)
		{
			int x=20,y=0,z;
			z=x/y;
			System.out.println(z);
			System.out.println("Can't divide by zero");
		}
		finally
		{
			System.out.println("Subscribe");
		}
		System.out.println("Main method ended");

	}
}