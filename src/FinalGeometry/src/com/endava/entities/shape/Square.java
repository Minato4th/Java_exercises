package FinalGeometry.src.com.endava.entities.shape;

import AnimalPlanet.src.util.Validator;
import FinalGeometry.src.com.endava.entities.Figure;
import FinalGeometry.src.com.endava.entities.interfaces.Calculation;
import FinalGeometry.src.com.endava.entities.interfaces.Resizable;



public class Square extends Figure implements Calculation, Resizable {
    Validator validator;
    public Square(int side1) {
        super(side1);
        validator = new Validator();
    }

    public void change(){

        setSide1(validator.convertToNumber());

    }

    public double perimeter(){
        return getSide1() + getSide1() + getSide1() + getSide1();
    }

    public double area(){
        return getSide1() * getSide1();
    }

    public double angle(){
        return 90;
    }

}

