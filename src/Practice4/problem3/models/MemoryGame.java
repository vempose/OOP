package Practice4.problem3.models;

import Practice4.problem3.interfaces.IGame;

public class MemoryGame implements IGame {
    @Override
    public void a() {
        System.out.println("It was a good day...");
    }

    @Override
    public void b() {
        System.out.println("Wait, you call him B-Rabbit too?..");
    }

    @Override
    public void c() {
        System.out.println("Some crazy dude named Ice Cube...");
    }

    @Override
    public void d() {
        System.out.println("Lost in transition... DOUBLE LINE!");
    }
}
