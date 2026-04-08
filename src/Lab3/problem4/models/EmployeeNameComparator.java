package Lab3.problem4.models;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int result = e1.getName().compareToIgnoreCase(e2.getName());
        if (result != 0) {
            return result;
        }
        return e1.getName().compareTo(e2.getName());
    }
}
