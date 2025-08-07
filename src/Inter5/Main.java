package Inter5;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(100, 150);
		rectangle.printsize();
		rectangle.resizeHeight(200);
		rectangle.resizeWidth(150);
		rectangle.printsize();
	}
}
