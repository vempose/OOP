package Practice5.Library.model;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private transient int visitCount;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.visitCount = 0;
    }

    public Book(String title, String author, int visitCount) {
        this(title, author);
        this.visitCount = visitCount;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %d visits", title, author, visitCount);
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
