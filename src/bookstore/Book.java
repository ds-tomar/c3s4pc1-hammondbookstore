package bookstore;

public class Book {
    int ISBNNumber;
    String title;
    String description;
    double price;
    Author author;

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN Number: " + ISBNNumber);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Author Name: " + author.authorName);
        System.out.println("Author Pen Name: " + author.authorPenName);
    }
}
