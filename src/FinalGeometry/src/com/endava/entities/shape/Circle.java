package FinalGeometry.src.com.endava.entities.shape;

import AnimalPlanet.src.util.Validator;
import FinalGeometry.src.com.endava.entities.Figure;
import FinalGeometry.src.com.endava.entities.interfaces.Calculation;
import FinalGeometry.src.com.endava.entities.interfaces.Resizable;

public  class Circle extends Figure implements Calculation, Resizable {

    Validator validator;
    public Circle(int side1) {
        super(side1);
        validator = new Validator();
    }

    public void change(){
        setSide1(validator.convertToNumber());
        setSide2(getSide1());
        setSide3(getSide1());
        setSide4(getSide1());

    }

    public double perimeter(){
        return getSide1() * 2 * 3.14;
    }

    public double area(){
        return getSide2() * getSide1() * 3.14;
    }

    public double angle(){
        return 360;
    }
}
