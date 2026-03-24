package Practice4.problem2.models;

import Practice4.problem2.interfaces.CanHavePizza;
import Practice4.problem2.interfaces.CanHaveRetake;
import Practice4.problem2.interfaces.Danceable;
import Practice4.problem2.interfaces.Movable;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable, Danceable {
    @Override
    public void eatPizza() {
        System.out.println("Student is eating a pizza... :P");
    }

    @Override
    public void retakeExam() {
        System.out.println("Student is retaking an exam... xO");
    }

    @Override
    public void move() {
        System.out.println("Student is moving... :|");
    }

    @Override
    public void dance() {
        System.out.println("Student is dancing... :D");
    }
}
