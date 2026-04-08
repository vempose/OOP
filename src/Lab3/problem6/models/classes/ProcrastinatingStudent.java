package Lab3.problem6.models.classes;

import Lab2.problem5.model.Animal;
import Lab2.problem5.model.Student;
import Lab3.problem6.models.interfaces.PetCaregiver;

public class ProcrastinatingStudent extends Student implements Comparable<ProcrastinatingStudent>, Cloneable, PetCaregiver {
    public ProcrastinatingStudent(String name, int age, String major) {
        super(name, age, major);
    }

    public ProcrastinatingStudent(String name, int age, String major, Animal pet) {
        super(name, age, major, pet);
    }

    @Override
    public String feedPet() {
        if (!hasPet()) {
            return "%s does not have a pet to feed.".formatted(getName());
        }

        return "%s keeps saying they will feed %s after one more break."
                .formatted(getName(), getPet().getName());
    }

    @Override
    public String spendTimeWithPet() {
        if (!hasPet()) {
            return "%s has no pet to spend time with.".formatted(getName());
        }

        return "%s procrastinates by hanging out with %s and hears \"%s\"."
                .formatted(getName(), getPet().getName(), getPet().getSound());
    }

    @Override
    public int compareTo(ProcrastinatingStudent other) {
        int ageComparison = Integer.compare(this.getAge(), other.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }

        return this.getName().compareTo(other.getName());
    }

    @Override
    public ProcrastinatingStudent clone() {
        Animal petCopy = null;
        if (getPet() instanceof SmartDog smartDog) {
            petCopy = smartDog.clone();
        }

        return new ProcrastinatingStudent(getName(), getAge(), getMajor(), petCopy);
    }
}
