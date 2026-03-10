package Lab2.problem1.part2.app;

import Lab2.problem1.part2.model.Book;

public class MainApp {
    static void main() {
        Book book = new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866, 754);

        System.out.println(book);

        System.out.println("\nItem type: " + book.getItemType());
    }
}
