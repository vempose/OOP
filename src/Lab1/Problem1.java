package Lab1;

import java.util.Scanner;

public class Problem1 {
    static void main() {
        Analyzer analyzer = new Analyzer();
        analyzer.run();
    }
}

class Data {
    private double sum;
    private double largest;
    private int count;

    public Data() {
        this.sum = 0;
        this.count = 0;
        this.largest = 0;
    }

    public void addValue(double value) {
        if (count == 0) {
            largest = value;
        } else {
            if (value > largest) {
                largest = value;
            }
        }
        sum += value;
        count++;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getLargest() {
        return largest;
    }
}

class Analyzer {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.printf("Average = %.1f\n", data.getAverage());
        System.out.printf("Maximum = %.1f\n", data.getLargest());

        scanner.close();
    }
}