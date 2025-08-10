package ExceptionHandling;

public class NumberFormatExceptionDemo {
/*if there is no exception in try block then catch block will not going to execute
 * if we declare any other exceptiontype in catch block pgoram will terminate abnormal
 * if there is exception in try block then catch block will execute and rest of the program will still run
 */
	public static void main(String[] args) {
		
    String str = "ankush";
  try
  {
    int a=Integer.parseInt(str);
    System.out.println(a);
  }
  catch(ArithmeticException n)
  {
	  System.out.println("String " + str +" Can't be converted to Integer");
  }
  System.out.println("Main method ended");
  }
	
}
