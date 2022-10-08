package bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthorName("Rhonda Byrne");
        author.setAuthorPenName("Byrne");
        Book book = new Book();
        book.setTitle("The Secret");
        book.setPrice(399.0);
        book.setISBNNumber(978);
        book.setDescription("It's secret :)");
        book.setAuthor(author);
        book.displayBookDetails();
    }
}
