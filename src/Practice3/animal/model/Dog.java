package Practice3.animal.model;

public class Dog extends Animal {
    private final String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.printf("Dog \"%s\" is barking...\n", getName());
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.printf("Breed: %s\n", getBreed());
    }
}