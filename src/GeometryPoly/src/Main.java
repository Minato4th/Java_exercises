package GeometryPoly.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please insert 3 sides : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Side 1: ");
        int side1 = Integer.parseInt(reader.readLine());

        System.out.println("Side 2: ");
        int side2 = Integer.parseInt(reader.readLine());

        System.out.println("Side 3: ");
        int side3 = Integer.parseInt(reader.readLine());

        Square square = new Square(side1);
        Triangle triangle = new Triangle(side1, side2, side3);
        Circle circle = new Circle(side1);

        System.out.println("If it would be  Square it would have : ");
        System.out.println("Perimeter : " + square.perimeter() + "\n" + "Area : " + square.area() + "\n" + "Angle : " + square.angle());
        System.out.println();

        System.out.println("If it would be  Triangle it would have : ");
        System.out.println("Perimeter : " + triangle.perimeter() + "\n" + "Area : " + triangle.area() + "\n" + "Angle : " + triangle.angle());
        System.out.println();

        System.out.println("If it would be  Circle it would have : ");
        System.out.println("Perimeter : " + circle.perimeter() + "\n" + "Area : " + circle.area() + "\n" + "Angle : " + circle.angle());

    }
}
