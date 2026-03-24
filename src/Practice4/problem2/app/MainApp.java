package Practice4.problem2.app;

import Practice4.problem2.model.classes.Cat;
import Practice4.problem2.model.classes.Person;
import Practice4.problem2.model.classes.Student;
import Practice4.problem2.services.Restaurant;

public class MainApp {
    static void main() {
        Person person = new Person();
        Student student = new Student();
        Cat cat = new Cat();
        Restaurant restaurant = new Restaurant();

//        This will not work, because, by requirements, Person does not implement 'CanHavePizza' interface
//        restaurant.servePizza(person);

        restaurant.servePizza(student); // with 'Student', however, this would work
        restaurant.servePizza(cat);
    }
}
