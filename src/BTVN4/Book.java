package BTVN4;

public class Book {
    String title;
    String[] author;

    public Book(String title, String[] author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String[] author) {
        this.author = author;
    }
// Method
    public String getTitle() {
        return this.title;
    }

    public String[] getAuthor() {
        return this.author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }
}
