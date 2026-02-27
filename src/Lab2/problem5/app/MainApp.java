package Lab2.problem5.app;

import Lab2.problem5.model.*;

public class MainApp {
    static void main() {
        Dog dog = new Dog("Blob", 1);
        Cat cat = new Cat("Murka", 2);

        Student s = new PhDStudent("Alexander", 20, "Computer Science", "Aboba", cat);
        Student s2 = new Student("John", 21, "CS", dog);
        PhDStudent p = new PhDStudent("Alex", 24, "CI", "ML");

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(s);
        registry.addPerson(s2);
        registry.addPerson(p);

        registry.print();

        registry.removePerson(p);

        registry.print();
    }
}
