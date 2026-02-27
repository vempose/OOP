package Lab2.problem5.model;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    List<Person> members = new ArrayList<>();

    public void addPerson(Person person) {
        members.add(person);
    }

    public void removePerson(Person person) {
        members.remove(person);
    }

    public void print() {
        members.forEach(person -> {
            System.out.printf("%s: %s\n",
                    person.getName(),
                    person.getPet() != null ? person.getPet() : "No pet");
        });
    }

    public List<Person> getMembersWithPet() {
        return members
                .stream()
                .filter(person -> person.getPet() != null)
                .toList();
    }

    public List<Person> getMembersWithoutPet() {
        return members
                .stream()
                .filter(person -> person.getPet() == null)
                .toList();
    }
}
