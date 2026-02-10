package Practice2;

import java.time.LocalDate;

public class Problem1 {
    static void main() {
        Student student = new Student("Alexander", 2025);
        System.out.printf("%-35s %s\n", "Name", student.getName());
        System.out.printf("%-35s %s\n", "ID:", student.getId());
        System.out.printf("%-35s %s\n", "Year:", student.getYear());
        student.incrementYear();
        System.out.printf("%-35s %s\n", "Year (after increment):", student.getYear());
    }
}