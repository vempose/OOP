package Practice4.problem4.app;


import Practice4.problem4.models.NameComparator;
import Practice4.problem4.models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainApp {
    static void main() {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Willie", 2.5),
                new Student("Alexander", 2.2),
                new Student("Bob", 3.1),
                new Student("Citrus", 3.0)
        ));

        System.out.println("Sorting by gpa (comparable):");
        Collections.sort(students);
        students.forEach(s -> System.out.printf("%s: %.2f\n", s.getName(), s.getGpa()));

        System.out.println("\n-------------------\n");

        System.out.println("Sorting by name (comparator):");
        Collections.sort(students, new NameComparator());
        students.forEach(s -> System.out.printf("%s: %.2f\n", s.getName(), s.getGpa()));
    }
}
