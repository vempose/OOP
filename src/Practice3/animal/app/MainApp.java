package Practice3.animal.app;

import Practice3.animal.model.Animal;
import Practice3.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    static void main() {
        Animal animal = new Animal("Jessica", 5);
        Dog dog1 = new Dog("Molly", 6, "Golden Retriever");
        Dog dog2 = new Dog("Bullet", 8, "German Shepherd");

        List<Animal> animals = new ArrayList<Animal>(List.of(animal, dog1, dog2));

        for (Animal it : animals) {
            it.makeSound();
            it.eat();
            it.eat("Salami");
            it.getInfo();
            System.out.println();
        }
    }
}
