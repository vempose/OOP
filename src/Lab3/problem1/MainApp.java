package Lab3.problem1;


public class MainApp {
    static void main() {
        String explanation = """
We use interfaces to just define the behavior of objects without implementing it (contracts).
With abstract classes, in other hand, we can also provide some default behavior.

Interfaces are exceptionally useful when we want to implement multiple behaviors. Interfaces allows us to do such thing.
Abstract classes allows only one behavior, so, in case of multiple behaviors, we need to use cascade inheritance, which
is not very convenient. Abstract classes are also more complex.

When there're two identical behaviors, we can use interfaces (they'll be merged, which is possible because
interfaces defines only signature of the method, not it's realization). With abstract classes, we'll get an error.

But! Abstract classes are good when we want to provide some default behavior. Also, we can use abstract methods which are
similar to interfaces.
                """;

        System.out.println(explanation);
    }
}

// Interface example
interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

class Bird implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming!");
    }
}


// Abstract class example
abstract class LivingBeing {
    abstract void eat(String food);
}

abstract class Animal extends LivingBeing {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void breathe();
};

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void breathe() {
        System.out.println("Cat is breathing...");
    }

    @Override
    void eat(String food) {
        System.out.println("Cat is eating " + food);
    }
}