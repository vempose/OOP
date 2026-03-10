package Lab2.problem1.part3.app;

import Lab2.problem1.part3.model.Animal;
import Lab2.problem1.part3.model.Cat;

import java.util.HashSet;

public class MainApp {
    static void main() {
        HashSet<Animal> animals = new HashSet<>();

        animals.add(new Animal("Bobik", 3));
        animals.add(new Animal("Bobik", 3));
        animals.add(new Animal("Sharik", 5));

        animals.add(new Cat("Murka", 2, "White"));
        animals.add(new Cat("Murka", 2, "White"));
        animals.add(new Cat("Murka", 2, "Black"));

        animals.forEach(System.out::println);

        System.out.println("HashSet size: " + animals.size());
    }
}
