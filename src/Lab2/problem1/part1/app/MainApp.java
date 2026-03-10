package Lab2.problem1.part1.app;

import Lab2.problem1.part1.model.Cube;
import Lab2.problem1.part1.model.Cylinder;
import Lab2.problem1.part1.model.Shape3D;
import Lab2.problem1.part1.model.Sphere;

public class MainApp {
    static void main() {
        Shape3D cylinder = new Cylinder(3, 5);
        Shape3D sphere = new Sphere(4);
        Shape3D cube = new Cube(2);

        System.out.printf("Cylinder volume = %.2f\n", cylinder.volume());
        System.out.printf("Cylinder surface area = %.2f\n", cylinder.surfaceArea());

        System.out.printf("Sphere volume = %.2f\n", sphere.volume());
        System.out.printf("Sphere surface area = %.2f\n", sphere.surfaceArea());

        System.out.printf("Cube volume = %.2f\n", cube.volume());
        System.out.printf("Cube surface area = %.2f\n", cube.surfaceArea());
    }
}
