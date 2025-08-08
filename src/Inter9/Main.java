package Inter9;

public class Main {

	public static void main(String[] args) {
		
		Searchable document = new Document("This is a sample document");
		
		 boolean documentContainsKeyword = document.search("Sample"); 
		 System.out.println(documentContainsKeyword);
		 
		 Searchable webPage = new WebPage("https://www.google.com/", "This is sample");
		 boolean WebPageContiansKeyword =webPage.search("webPage");
		 System.out.println(WebPageContiansKeyword);
		 
	}
	
}
