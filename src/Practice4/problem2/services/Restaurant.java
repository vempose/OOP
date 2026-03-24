package Practice4.problem2.services;

import Practice4.problem2.model.classes.Person;
import Practice4.problem2.model.interfaces.CanHavePizza;

public class Restaurant {
    public void servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person) {
            System.out.println("Processing payment...");
        }
    }
}
