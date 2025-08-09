package OOPs6;

public class Calculator_Main {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Sum of 2 and 3 = " + cal.add(2, 3));
        System.out.println("Sum of 1, 2 and 3 = " + cal.add(1, 2, 3));
        System.out.println("Sum of 4.5 and 3.2 = " + cal.add(4.5, 3.2));

		int [] arr = {1,2,3,4,5};
		System.out.println("Sum of array elements: " +cal.add(arr));
	}
	
}
