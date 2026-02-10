package Lab1;

import Practice2.Student;

import java.util.*;

public class Problem4 {
    static void main() {
        List<String> prerequisites = new ArrayList<String>(List.of("linear algebra", "calculus 1"));
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Alexander"));
        students.add(new Student("James"));
        students.add(new Student("Elena"));

        Course course = new Course("OOP", "Some good course", 4, prerequisites);

        GradeBook gradeBook = new GradeBook(course, students);
        System.out.println("Max: " + gradeBook.getMax().getValue() + "\nMin: " + gradeBook.getMin().getValue());
    }
}

class GradeBook {
    Course course;
    List<Student> students;
    Map<Student, Double> marks = new LinkedHashMap<>(); // to preserve order

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;

        Scanner in = new Scanner(System.in);
        System.out.println("Please, input grades for students:\n");
        for (Student student : students) {
            System.out.print(student.getName() + ": ");
            marks.put(student, in.nextDouble());
        }
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for CS101 Object-oriented Programming and Design!");
    }

    public double getAverage() {
        double sum = 0.0;
        int count = 0;

        for (double mark : marks.values()) {
            sum += mark;
            count++;
        }

        return sum / count;
    }

    public Map.Entry<Student, Double> getMax() {
        Map.Entry<Student, Double> maxEntry = null;

        for (Map.Entry<Student, Double> entry : marks.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        return maxEntry;
    }

    public Map.Entry<Student, Double> getMin() {
        Map.Entry<Student, Double> minEntry = null;

        for (Map.Entry<Student, Double> entry : marks.entrySet()) {
            if (minEntry == null || entry.getValue() < minEntry.getValue()) {
                minEntry = entry;
            }
        }

        return minEntry;
    }
}

class Course {
    private final String name;
    private final String description;
    private final int numOfCredits;
    private final List<String> prerequisites;

    public Course(String name, String description, int numOfCredits, List<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.numOfCredits = numOfCredits;
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return String.format(
                "Course name: %s\nDescription: %s\nNumber of credits: %d\nPrerequisites: %s",
                name, description, numOfCredits, String.join(", ", prerequisites)
        );
    }
}