package Practice4.problem4.models;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student anotherStudent) {
        return student.getName().compareTo(anotherStudent.getName());
    }
}
