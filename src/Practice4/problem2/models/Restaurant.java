package Practice4.problem2.models;

import Practice4.problem2.interfaces.CanHavePizza;

public class Restaurant {
    public void servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person) {
            System.out.println("Processing payment...");
        }
    }
}
