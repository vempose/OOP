package Practice4.problem1;

public class MainApp {
    public static void answer(String question, String answer) {
        System.out.println("Q:   " + question);
        System.out.println("A:   " + answer);
        System.out.println("-----------");
    }

    static void main() {
        answer(
                "What is the core difference between a class and an interface?",
                "Class defines data and concrete behavior, whilst interface just tells us what need to be" +
                        "implemented but not how it should work, so it is just a contract. Class can extend only one" +
                        "class and implement many interfaces."
        );
        answer(
                "Can interfaces have fields? If yes, what are the implicit modifiers for them?",
                "Yep, but there're always constants. Modifiers: public static final."
        );
        answer(
                "Can a class implement multiple interfaces? Explain why this is useful.",
                "Yes. It's useful when we need to define complex, composite behavior. With classes, there're" +
                        "might be collision of methods, so that's why we can extend only one class, but because interfaces" +
                        "do not define the working logic of the methods, they can overlap"
        );
    }
}
