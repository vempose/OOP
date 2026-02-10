package Practice2;

import java.time.LocalDate;

public class Student {
    final private String name;
    final private int id;
    private int year;
    private static int nextId = 0;

    public Student(String name) {
        this.name = name;
        this.year = LocalDate.now().getYear();
        id = nextId;
        nextId++;
    }

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void incrementYear() {
        year++;
    }

    public void incrementYear(int i) {
        year += i;
    }
}
