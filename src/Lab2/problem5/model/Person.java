package Lab2.problem5.model;

import java.util.Objects;

public abstract class Person {
    private final String name;
    private final int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Animal pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        setPet(null);
    }

    public boolean hasPet() {
        return pet != null;
    }

    abstract String getOccupation();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(String.format("%s, %d (%s). %s.",
                getName(), getAge(), this.getClass().getSimpleName(), getOccupation()));
        if (hasPet()) {
            result.append(" Has a pet: ").append(getPet());
        }

        return result.toString();
    }
}
