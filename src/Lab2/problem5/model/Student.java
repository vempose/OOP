package Lab2.problem5.model;

import java.util.Objects;

public class Student extends Person {
    private final String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public Student(String name, int age, String major, Animal pet) {
        super(name, age, pet);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    String getOccupation() {
        return "The main field of study is " + getMajor();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getMajor(), student.getMajor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMajor());
    }
}
