package Practice4.problem2.model.classes;

import Practice4.problem2.model.interfaces.CanHavePizza;

public class Cat implements CanHavePizza {
    @Override
    public void eatPizza() {
        System.out.println("Cat is eating a pizza...");
    }
}
