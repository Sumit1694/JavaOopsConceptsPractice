
public class Book {

	private String title;
	private String author;
	private double price;

	public Book()
	{
		this.title="Unknown";
		this.author="Unknown";
		this.price=0.0;
	}
	
	public Book(String title, String author)
	{
		this.title=title;
		this.author=author;
		this.price=0.0;
	}
	
	public Book(String title, String author, double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public static void main(String[] args) {
		
		Book book1=new Book();
		
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.price);
		
		Book book2=new Book("Ambika", "Kevin tedrick");
		System.out.println(book2.title);
		System.out.println(book2.author);
		
		
		Book book3=new Book("Ambika shewale", "Kevin tedrick", 18.99);
		System.out.println(book3.title);
		System.out.println(book3.author);
		System.out.println(book3.price);
		
	}
}
