package Lab2.problem5.model;

import java.util.Objects;

public class PhDStudent extends Student {
    private final String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    public PhDStudent(String name, int age, String major, String researchTopic, Animal pet) {
        if (pet instanceof Dog) {
            throw new IllegalArgumentException("PhD Student can't have a dog as a pet!");
        }

        super(name, age, major, pet);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    public void setPet(Animal pet) {
        if (pet instanceof Dog) {
            throw new IllegalArgumentException("PhD Student can't have a dog as a pet!");
        }

        super.setPet(pet);
    }

    @Override
    String getOccupation() {
        return String.format("The research topic is: %s (in the field of %s)", getResearchTopic(), getMajor());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PhDStudent that = (PhDStudent) o;
        return Objects.equals(getResearchTopic(), that.getResearchTopic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getResearchTopic());
    }
}
