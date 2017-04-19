package FinalGeometry.src.com.endava.service;


import FinalGeometry.src.com.endava.entities.*;
import FinalGeometry.src.com.endava.entities.shape.*;
import FinalGeometry.src.com.endava.util.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {

    private BufferedReader reader;
    private int side1;
    private int side2;
    private int side3;
    private int side4;
    Validator validator;

    public Menu() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.validator =  new Validator();
        startMenu();
    }

    public void startMenu()  {
        System.out.println("Please insert 4 sides : ");

        System.out.println("Side 1: ");
        side1 = validator.convertToNumber();

        System.out.println("Side 2: ");
        side2 = validator.convertToNumber();

        System.out.println("Side 3: ");
        side3 = validator.convertToNumber();

        System.out.println("Side 4: ");
        side4 = validator.convertToNumber();


        for (int i = 0; i < 3; i++) {
            Text.BASE.getText();

            int choice = validator.convertToNumber();

            if (choice == Numbers.ONE.getNumber()){
                showData("Square", new Square(this.side1));
            }else if (choice == Numbers.TWO.getNumber()){
                showData("Rhombus", new Rhombus(this.side1));
            }else if (choice == Numbers.THREE.getNumber()){
                System.out.println("We need additional size :");
                showData("Rectangle", new Rectangle(this.side1, this.side4));
            }else if (choice == Numbers.FOUR.getNumber()){
                showData("Triangle", new Triangle(this.side1, this.side2, this.side3));
            }else if (choice == Numbers.FIVE.getNumber()){
                showData("EquilateralTriangle", new EquilateralTriangle(this.side1, this.side2, this.side3));
            }else if (choice == Numbers.SIX.getNumber()){
                showData("IsoscelesTriangle", new IsoscelesTriangle(this.side1, this.side2, this.side3));
            }else if (choice == Numbers.SEVEN.getNumber()){
                showData("Circle", new Circle(this.side4));
            }else if (choice == Numbers.EIGHTH.getNumber()){
                showData("Ellipse", new Ellipse(this.side4));
            }else if (choice == Numbers.NINE.getNumber()){
                showData("ResizableCircle", new ResizableCircle(this.side4));
            }else if (choice > Numbers.TEN.getNumber()) {
                Text.INCORRECT.getText();
                i += 2;
            }
            else if (choice == Numbers.TEN.getNumber()) {
                Text.BYE.getText();
                i = 5;
            }

            i--;
        }
    }

    public void showData(String name, Figure fig){
        System.out.println("If it would be " + name +" it would have : ");
        System.out.println("Perimeter : " + fig.perimeter() + "\n" + "Area : " + fig.area() + "\n" + "Angle : " + fig.angle());
        System.out.println();
    }

}
