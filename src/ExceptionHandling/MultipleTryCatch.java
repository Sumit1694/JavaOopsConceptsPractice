package ExceptionHandling;

public class MultipleTryCatch {

	public static void main(String[] args) {
		
		try
		{
			int a=10,b=2,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Can't divide by zero");
		}
		
		try
		{
			int a[] = {10,20,30,40};
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Beyond the array limit");
		}
	}
	
}
