package Lab2.problem5.model;

import java.util.Objects;

public class Employee extends Person {
    private final String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int age, String jobTitle, Animal pet) {
        super(name, age, pet);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    String getOccupation() {
        return "The field of work is " + getJobTitle();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getJobTitle(), employee.getJobTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getJobTitle());
    }
}
