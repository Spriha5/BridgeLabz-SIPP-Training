package Day3_FinalKeyWord;

public class Book {
	static String libraryName = "Central Library";
   
    String title;
     String author;
     final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " +libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " +title);
            System.out.println("Author: " +author);
            System.out.println("ISBN: " +isbn);
        } else {
            System.out.println("Not a valid book object.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("acb", "abcc", "ISBN001");
        Book book2 = new Book("xyz", "cde", "ISBN002");

        displayLibraryName();
        System.out.println();
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}
