package Practice4.problem2.models;

import Practice4.problem2.interfaces.CanHavePizza;

public class Cat implements CanHavePizza {
    @Override
    public void eatPizza() {
        System.out.println("Cat is eating a pizza...");
    }
}
