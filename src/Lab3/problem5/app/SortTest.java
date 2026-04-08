package Lab3.problem5.app;

import Lab3.problem4.models.Employee;
import Lab3.problem5.models.Chocolate;
import Lab3.problem5.models.Sort;
import Practice2.problem3.models.Time;

import java.time.LocalDate;

public class SortTest {
    public static void main(String[] args) {
        testChocolateSorting();
        testTimeSorting();
        testEmployeeSorting();
    }

    private static void testChocolateSorting() {
        Chocolate[] chocolatesForBubble = {
                new Chocolate(55.5, "Twix"),
                new Chocolate(43.0, "Mars"),
                new Chocolate(67.2, "Bounty"),
                new Chocolate(50.0, "Snickers")
        };

        Chocolate[] chocolatesForSelection = {
                new Chocolate(55.5, "Twix"),
                new Chocolate(43.0, "Mars"),
                new Chocolate(67.2, "Bounty"),
                new Chocolate(50.0, "Snickers")
        };

        System.out.println("Chocolates before bubble sort:");
        printChocolates(chocolatesForBubble);
        Sort.bubbleSort(chocolatesForBubble);
        System.out.println("Chocolates after bubble sort:");
        printChocolates(chocolatesForBubble);

        System.out.println("\nChocolates before selection sort:");
        printChocolates(chocolatesForSelection);
        Sort.selectionSort(chocolatesForSelection);
        System.out.println("Chocolates after selection sort:");
        printChocolates(chocolatesForSelection);
    }

    private static void testTimeSorting() {
        Time[] timesForBubble = {
                new Time(10, 15, 20),
                new Time(5, 5, 5),
                new Time(23, 0, 1),
                new Time(10, 15, 10)
        };

        Time[] timesForSelection = {
                new Time(10, 15, 20),
                new Time(5, 5, 5),
                new Time(23, 0, 1),
                new Time(10, 15, 10)
        };

        System.out.println("\nTimes before bubble sort:");
        printTimes(timesForBubble);
        Sort.bubbleSort(timesForBubble);
        System.out.println("Times after bubble sort:");
        printTimes(timesForBubble);

        System.out.println("\nTimes before selection sort:");
        printTimes(timesForSelection);
        Sort.selectionSort(timesForSelection);
        System.out.println("Times after selection sort:");
        printTimes(timesForSelection);
    }

    private static void testEmployeeSorting() {
        Employee[] employeesForBubble = {
                new Employee("Alice", 320000, LocalDate.of(2023, 2, 1), "A001"),
                new Employee("Bob", 280000, LocalDate.of(2022, 6, 10), "B002"),
                new Employee("Charlie", 410000, LocalDate.of(2024, 1, 5), "C003"),
                new Employee("Diana", 300000, LocalDate.of(2021, 11, 20), "D004")
        };

        Employee[] employeesForSelection = {
                new Employee("Alice", 320000, LocalDate.of(2023, 2, 1), "A001"),
                new Employee("Bob", 280000, LocalDate.of(2022, 6, 10), "B002"),
                new Employee("Charlie", 410000, LocalDate.of(2024, 1, 5), "C003"),
                new Employee("Diana", 300000, LocalDate.of(2021, 11, 20), "D004")
        };

        System.out.println("\nEmployees before bubble sort:");
        printEmployees(employeesForBubble);
        Sort.bubbleSort(employeesForBubble);
        System.out.println("Employees after bubble sort:");
        printEmployees(employeesForBubble);

        System.out.println("\nEmployees before selection sort:");
        printEmployees(employeesForSelection);
        Sort.selectionSort(employeesForSelection);
        System.out.println("Employees after selection sort:");
        printEmployees(employeesForSelection);
    }

    private static void printChocolates(Chocolate[] chocolates) {
        for (Chocolate chocolate : chocolates) {
            System.out.println(chocolate);
        }
    }

    private static void printTimes(Time[] times) {
        for (Time time : times) {
            System.out.println(time.toUniversal());
        }
    }

    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("%s - salary: %.1f%n", employee.getName(), employee.getSalary());
        }
    }
}
