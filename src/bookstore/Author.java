package bookstore;

public class Author {
    String authorName;
    String authorPenName;

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorPenName='" + authorPenName + '\'' +
                '}';
    }
}
