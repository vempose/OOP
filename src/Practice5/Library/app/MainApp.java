package Practice5.Library.app;

import Practice5.Library.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    static void main() {
        List<Book> books = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("library.dat"))) {
            while (true) {
                try {
                    Book book = (Book) ois.readObject();
                    books.add(book);
                } catch (EOFException e) {
                    // If read all objects - exit the reading loop
                    System.out.println("All books are restored!");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error with class: " + e.getMessage());
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Select option: (l)ist books, (a)dd book, (q)uit: ");
            String input = in.nextLine().strip().toLowerCase();

            switch (input) {
                case "q":
                    saveBooks(books);
                    System.out.println("All books are saved. Bye!");
                    System.exit(0);
                case "l":
                    if (!books.isEmpty()) books.forEach(book -> {
                        book.setVisitCount(book.getVisitCount() + 1);
                        System.out.println(book);
                    });
                    else System.out.println("No books yet.");
                    continue;
                case "a":
                    String title;
                    String author;

                    while (true) {
                        try {
                            System.out.print("Type in name of the book: ");
                            title = in.nextLine();
                            System.out.print("Type in author's name: ");
                            author = in.nextLine();
                        } catch (Exception e) {
                            System.out.println("Something wrong has happened. Try again.");
                            continue;
                        }

                        books.add(new Book(title, author));
                        break;
                    }
                    continue;
                default:
                    System.out.println("Wrong option. Try again.");
            }
        }
    }

    public static void saveBooks(List<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
            for (Book book : books) {
                try {
                    oos.writeObject(book);
                } catch (IOException e) {
                    System.err.println("Error while saving a book: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error while writing to the file: " + e.getMessage());
        }
    }
}

