package Practice2;

import java.time.LocalDate;

public class Problem1 {
    static void main() {
        Student student = new Student("Alexander", 2025);
        System.out.println("Name:                   " + student.getName());
        System.out.println("ID:                     " + student.getId());
        System.out.println("Year:                   " + student.getYear());
        student.incrementYear();
        System.out.println("Year (after increment): " + student.getYear());
    }
}

class Student {
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
        year += 1;
    }

    public void incrementYear(int i) {
        year += i;
    }
}
