package InterfaceProblem12;

public class MainPrintable {

	public static void main(String[] args) {
		
		Printable pdfDocuments = new PDFDocument();
		Printable wordDocument = new WordDocument();
		pdfDocuments.print();
		pdfDocuments.printHeader();
		wordDocument.print();
		wordDocument.printHeader();
		
	}
	
}
