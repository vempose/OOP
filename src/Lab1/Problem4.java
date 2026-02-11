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
        System.out.println(gradeBook);
    }
}

class GradeBook {
    Course course;
    List<GradeBookEntry> entries;

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        entries = new ArrayList<GradeBookEntry>();

        displayMessage();

        System.out.println("Please, enter mark for the following students:");
        for (Student student : students) {
            double mark = getValidatedMark(student.getName());
            GradeBookEntry entry = new GradeBookEntry(student, mark);
            entries.add(entry);
        }
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!\n\n", course.getName());
    }

    private double getValidatedMark(String studentName) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print(studentName + ": ");
            String input = in.next();

            double mark;
            try {
                mark = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Enter valid number! Try again.");
                continue;
            }

            return mark;
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        entries.forEach(entry -> output.append(String.format("ID:\t\t\t\t%d\nName:\t\t\t%s\nMark:\t\t\t%.2f\n",
                entry.getId(), entry.getStudentName(), entry.getMark()))
        );

        return output.toString();
    }

    public double getAverage() {
        return entries.stream()
                .mapToDouble(GradeBookEntry::getMark)
                .average()
                .orElse(0.0);
    }

    public GradeBookEntry getMaxEntry() {
        return entries.stream()
                .max(Comparator.comparing(GradeBookEntry::getMark))
                .orElseThrow(NoSuchElementException::new);
    }

    public GradeBookEntry getMinEntry() {
        return entries.stream()
                .min(Comparator.comparing(GradeBookEntry::getMark))
                .orElseThrow(NoSuchElementException::new);
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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumOfCredits() {
        return numOfCredits;
    }
}

class GradeBookEntry {
    private final Student student;
    private final double mark;

    public GradeBookEntry(Student student, double mark) {
        this.student = student;
        this.mark = mark;
    }

    public int getId() {
        return student.getId();
    }

    public String getStudentName() {
        return student.getName();
    }

    public double getMark() {
        return mark;
    }
}