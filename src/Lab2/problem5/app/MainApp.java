package Lab2.problem5.app;

import Lab2.problem5.model.*;

public class MainApp {
    static void main() {
        Dog dog = new Dog("Blob", 1);
        Cat cat = new Cat("Murka", 2);
        Student s = new PhDStudent("Alexander", 20, "Computer Science", "Aboba", cat);

        s.setPet(dog);

        System.out.println(s);
    }
}
