package Practice3.animal.model;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.printf("Animal \"%s\" is making sounds...\n", getName());
    }

    public void eat() {
        System.out.printf("Animal \"%s\" is eating...\n", getName());
    }

    public void eat(String food) {
        System.out.printf("Animal \"%s\" is eating delicious \"%s\"...\n", getName(), food);
    }

    public void getInfo() {
        System.out.printf("-- INFO --\nName: %s\nAge: %d\n", getName(), getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
