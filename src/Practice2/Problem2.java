package Practice2;

public class Problem2 {
    static void main() {
        StarTriangle small = new StarTriangle(3);
        System.out.println(small);
    }
}

class StarTriangle {
    final private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder repr = new StringBuilder("[*]");

        for (int i = 2; i <= width; i++) {
            repr.append("\n").append("[*]".repeat(i));
        }

        return repr.toString();
    }
}
