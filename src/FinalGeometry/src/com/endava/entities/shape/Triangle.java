package FinalGeometry.src.com.endava.entities.shape;

import AnimalPlanet.src.util.Validator;
import FinalGeometry.src.com.endava.entities.Figure;
import FinalGeometry.src.com.endava.entities.interfaces.*;


public class Triangle extends Figure implements Calculation, Resizable {
    Validator validator;
    public Triangle(int side1, int side2, int side3) {
        super(side1, side2, side3);
        validator = new Validator();
    }

    public void change(){
        setSide1(validator.convertToNumber());
        setSide2(validator.convertToNumber());
        setSide3(validator.convertToNumber());

    }

    public double perimeter(){
        return getSide1() + getSide2() + getSide3();

    }

    public double area(){
        double p = 0.5 * (getSide1() + getSide2() + getSide3());
        double h = 2 * Math.sqrt(p * (p-getSide1()) * (p-getSide2()) * (p-getSide3())) / getSide1();

        return 0.5 * getSide1() * h;
    }

    public double angle(){
        return 170;
    }
}
