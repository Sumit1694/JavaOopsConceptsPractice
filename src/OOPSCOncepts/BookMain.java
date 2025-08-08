package OOPSCOncepts;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		
		Book book1 = new Book("The C programming language", "Dennis Ritche, Brian kwenighan", "2435674332");
		
		Book book2 = new Book("Th java programming", "Guido", "2435674343");
		
		Book.add_Book(book1);
		Book.add_Book(book2);
		
		ArrayList<Book> bookCollection = Book.get_BookCollection();
		
		for(Book book:bookCollection)
		{
			System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
		}
		
		Book.remove_Book(book1);
		
System.out.println("\nAfter removing " + book1.get_Title() + ":");
        
        // Print a heading for the updated list of books
        System.out.println("List of books:");
        
        // Iterate over each book in the bookCollection
        for (Book book : bookCollection) {
            // Print the title, author, and ISBN of each book
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
	}
	
}
