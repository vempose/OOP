package Lab2.problem5.app;

import Lab2.problem5.model.Cat;
import Lab2.problem5.model.Fish;
import Lab2.problem5.model.Student;

public class MainApp {
    static void main() {
        Fish cat = new Fish("Blob", 1);
        Student s = new Student("Alexander", 20, "Computer Science", cat);

        System.out.println(s);
        System.out.println(s.getPet().getSound());
    }
}
