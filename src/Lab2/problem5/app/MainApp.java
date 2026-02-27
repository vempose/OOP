package Lab2.problem5.app;

import Lab2.problem5.model.*;

public class MainApp {
    static void main() {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);
        john.setPet(murka); // John owns Murka
        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(john);
        registry.addPerson(alice);

        // John goes on vacation and leaves Murka with Alice
        john.leavePetWith(alice);
        // Registry reflects that Alice is taking care of Murka
        System.out.println(registry);
        // John returns from vacation and retrieves Murka
        john.retrievePetFrom(alice);
        // Registry reflects that John has his dog back
        System.out.println(registry);
    }
}
