package Practice5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Sensor {
    static void main() {
        Random random = new Random();

        // Write some values to the file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("sensor.bin"))) {
            for (int i = 0; i < 60; i++) {
                double value = 15.0 + (35.0 - 15.0) * random.nextDouble();
                dos.writeDouble(value);
            }
        }   catch (IOException e) {
            System.err.println("Something wrong: " + e.getMessage());
        }

        // Change 30th temperature
        try (RandomAccessFile raf = new RandomAccessFile("sensor.bin", "rw")) {
            raf.seek(29 * 8L);
            raf.writeDouble(999.9);
        } catch (IOException e) {
            System.err.println("Something wrong: " + e.getMessage());
        }

        // Now reading again
        double sum = 0.0;
        double max = Double.NEGATIVE_INFINITY;

        try (DataInputStream dis = new DataInputStream(new FileInputStream("sensor.bin"))) {
            while (true) {
                double value = dis.readDouble();
                sum += value;
                if (value > max) {
                    max = value;
                }
            }
        } catch (EOFException e) {
            System.out.println("Computational process has finished.");
        } catch (IOException e) {
            System.err.println("Error while reading sensor data: " + e.getMessage());
        }

        System.out.printf("Average temperature: %.2f\n", sum / 60);
        System.out.println("Max temperature: " + max);
    }
}
