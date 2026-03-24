package Practice4.problem3.model.classes;

import Practice4.problem3.model.interfaces.Game;

public class LogicGame implements Game {
    @Override
    public void a() {
        System.out.println("Stop hittin' me A's please, I don't wanna be friends");
    }

    @Override
    public void b() {
        System.out.println("I barely hang out with the B ones that I have");
    }

    @Override
    public void c() {
        System.out.println("Can't go to the C areas and get peaches no more");
    }
}
