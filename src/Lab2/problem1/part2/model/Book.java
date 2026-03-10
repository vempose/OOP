package Lab2.problem1.part2.model;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    public String getCategoryByPages() {
        if (numberOfPages <= 4) return "Flash Fiction";
        if (numberOfPages <= 39) return "Short Story";
        if (numberOfPages <= 79) return "Novelette";
        if (numberOfPages <= 199) return "Novella";
        return "Novel";
    }

    @Override
    public String toString() {
        return String.format("-- %s --\n%s\nCategory: %s", getItemType(), super.toString(), getCategoryByPages());
    }
}
