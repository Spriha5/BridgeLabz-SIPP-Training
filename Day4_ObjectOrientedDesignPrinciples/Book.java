package Day4_ObjectOrientedDesignPrinciples;

import java.util.*;

public class Book {
    String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showDetails() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

class Library {
    String name;
    List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.showDetails();
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("abc", "mno");
        Book b2 = new Book("cde Concepts", "opq");
        Book b3 = new Book("efg", "rst");

        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Community Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b3);
        lib2.addBook(b1); // Shared book, showing aggregation

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}