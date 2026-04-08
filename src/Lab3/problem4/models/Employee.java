package Lab3.problem4.models;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private LocalDate hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, double salary, LocalDate hireDate, String nationalInsuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public Employee(Employee other) {
        this(
                other.getName(),
                other.salary,
                other.hireDate,
                other.nationalInsuranceNumber
        );
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "# Employee:\nName = %s\nSalary = %s\nHire Date = %s\nNational Insurance Number = %s"
                .formatted(getName(), getSalary(), getHireDate(), getNationalInsuranceNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0
                && Objects.equals(hireDate, employee.hireDate)
                && Objects.equals(nationalInsuranceNumber, employee.nationalInsuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, hireDate, nationalInsuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Employee clone() {
        return new Employee(this);
    }
}
