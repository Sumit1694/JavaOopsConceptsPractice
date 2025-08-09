package OopsConcept;

public class Book {
private String book_title;
private String book_author;
private String ISBN;

 public Book(String book_title, String book_author, String ISBN)
 {
	 this.book_title=book_title;
	 this.book_author=book_author;
	 this.ISBN=ISBN;
 }
 
 public String getTitle()
 {
	 return book_title;
 }
 
 public String getAuthor()
 {
	 return book_author;
 }
 
 public String getIsbn()
 {
	 return ISBN;
 }
 
 @Override
 public String toString() {
     return "Book [Title=" + book_title + ", Author=" + book_author + ", ISBN=" + ISBN + "]";
 }

}
