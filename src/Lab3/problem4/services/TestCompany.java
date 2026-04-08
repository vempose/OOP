package Lab3.problem4.services;

import Lab3.problem4.models.Employee;
import Lab3.problem4.models.EmployeeHireDateComparator;
import Lab3.problem4.models.EmployeeNameComparator;
import Lab3.problem4.models.Manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompany {
    void main() {
        Employee e1 = new Employee(
                "Alice Brown",
                45000,
                LocalDate.of(2020, 1, 10),
                "NI1001"
        );

        Employee e2 = new Employee(
                "Bob Smith",
                52000,
                LocalDate.of(2019, 3, 3),
                "NI1002"
        );

        Employee e3 = new Employee(
                "Alice Brown",
                45000,
                LocalDate.of(2020, 1, 10),
                "NI1001"
        );

        Manager m1 = new Manager(
                "Carol White",
                70000,
                LocalDate.of(2018, 6, 1),
                "NI2001",
                8000
        );

        m1.addTeamMember(e1);
        m1.addTeamMember(e2);

        Manager m2 = new Manager(
                "David Green",
                70000,
                LocalDate.of(2017, 4, 15),
                "NI2002",
                12000
        );

        System.out.println("=== toString() test ===");
        System.out.println(e1);
        System.out.println(m1);

        System.out.println("\n=== equals() test ===");
        System.out.println("e1 equals e3: " + e1.equals(e3));
        System.out.println("e1 equals e2: " + e1.equals(e2));
        System.out.println("m1 equals m2: " + m1.equals(m2));

        System.out.println("\n=== compareTo() test ===");
        System.out.println("e2 compared to e1: " + e2.compareTo(e1));
        System.out.println("m1 compared to m2 (same salary, compare bonus): " + m1.compareTo(m2));

        System.out.println("\n=== Sorting test ===");
        List<Employee> staff = new ArrayList<>();
        staff.add(e1);
        staff.add(e2);
        staff.add(m1);
        staff.add(m2);

        System.out.println("Original list:");
        for (Employee e : staff) {
            System.out.println(e);
        }

        Collections.sort(staff);
        System.out.println("\nSorted by natural order (salary, then bonus for managers):");
        for (Employee e : staff) {
            System.out.println(e);
        }

        staff.sort(new EmployeeNameComparator());
        System.out.println("\nSorted by name:");
        for (Employee e : staff) {
            System.out.println(e);
        }

        staff.sort(new EmployeeHireDateComparator());
        System.out.println("\nSorted by hire date:");
        for (Employee e : staff) {
            System.out.println(e);
        }

        System.out.println("\n=== clone() test ===");
        Employee clonedEmployee = e1.clone();
        System.out.println("Original employee: " + e1);
        System.out.println("Cloned employee:   " + clonedEmployee);
        System.out.println("Same object? " + (e1 == clonedEmployee));
        System.out.println("Equal objects? " + e1.equals(clonedEmployee));

        Manager clonedManager = m1.clone();
        System.out.println("\nOriginal manager: " + m1);
        System.out.println("Cloned manager:   " + clonedManager);
        System.out.println("Same object? " + (m1 == clonedManager));
        System.out.println("Equal objects? " + m1.equals(clonedManager));

        clonedManager.setBonus(15000);
        clonedManager.addTeamMember(new Employee(
                "Eva Black",
                40000,
                LocalDate.of(2022, 9, 20),
                "NI3001"
        ));

        System.out.println("\nAfter changing the cloned manager:");
        System.out.println("Original manager team size: " + m1.getTeam().size());
        System.out.println("Cloned manager team size:   " + clonedManager.getTeam().size());
        System.out.println("Original manager bonus: " + m1.getBonus());
        System.out.println("Cloned manager bonus:   " + clonedManager.getBonus());
    }
}
