package library; //location cannot be access by those file not on same location

public class Book {
    private String title;   // Title of the book
    private Author author;  // Author of the book
    private int year;       // Publication year of the book

    // Constructor to initialize the book's properties
    public Book(String title, Author author, int year) {
        this.title = title;     // Set the title of the book
        this.author = author;   // Set the author of the book
        this.year = year;       // Set the publication year of the book
    }

    // Override the toString() method to display book details
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author.getName() + " (" + year + ")";
        // Return a formatted string representing book details
    }
}
