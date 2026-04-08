package Lab3.problem4.models;

import java.time.LocalDate;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements Cloneable {
    private List<Employee> team;
    private double bonus;

    public Manager(String name, double salary, LocalDate hireDate, String nationalInsuranceNumber, double bonus) {
        this(name, salary, hireDate, nationalInsuranceNumber, bonus, new ArrayList<>());
    }

    public Manager(String name, double salary, LocalDate hireDate, String nationalInsuranceNumber,
                   double bonus, List<Employee> team) {
        super(name, salary, hireDate, nationalInsuranceNumber);
        this.bonus = bonus;
        this.team = new ArrayList<>();

        for (Employee employee : team) {
            this.team.add(employee.clone());
        }
    }

    public Manager(Manager other) {
        this(other.getName(), other.getSalary(), other.getHireDate(),
                other.getNationalInsuranceNumber(), other.bonus, other.team);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public List<Employee> getTeam() {
        List<Employee> copy = new ArrayList<>();
        for (Employee employee : team) {
            copy.add(employee.clone());
        }
        return copy;
    }

    public String getTeamNames() {
        return team
                .stream()
                .map(Employee::getName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("");
    }

    public void setTeam(List<Employee> team) {
        this.team = new ArrayList<>();
        for (Employee employee : team) {
            this.team.add(employee.clone());
        }
    }

    public void addTeamMember(Employee employee) {
        team.add(employee);
    }

    public boolean removeTeamMember(Employee employee) {
        return team.remove(employee);
    }

    @Override
    public String toString() {
        return "# Manager:\nName = %s\nSalary = %s\nHire Date = %s\nNational Insurance Number = %s\nBonus = %s\nTeam Size = %d\nTeam = %s"
                .formatted(getName(), getSalary(), getHireDate(), getNationalInsuranceNumber(), getBonus(), team.size(), getTeamNames());
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
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0
                && Objects.equals(team, manager.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, bonus);
    }

    @Override
    public int compareTo(Employee other) {
        int salaryComparison = super.compareTo(other);
        if (salaryComparison != 0) {
            return salaryComparison;
        }

        if (other instanceof Manager manager) {
            return Double.compare(this.bonus, manager.bonus);
        }

        return 0;
    }

    @Override
    public Manager clone() {
        return new Manager(this); // deep clone
    }
}
