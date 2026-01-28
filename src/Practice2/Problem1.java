package Practice2;

import java.time.LocalDate;

public class Problem1 {
    static void main() {
        Student student = new Student("Alexander", 2025);
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getYear());
        student.incrementYear();
        System.out.println(student.getYear());
    }
}

class Student {
    private String name;
    private int id;
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
        nextId += 1;
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
