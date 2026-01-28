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
        if (width <= 0) {
            throw new IllegalArgumentException("Width should be positive and non-zero!");
        }
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[*]");

        for (int i = 2; i <= width; i++) {
            string.append("\n").append("[*]".repeat(i));
        }

        return string.toString();
    }
}
