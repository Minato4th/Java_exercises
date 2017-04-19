package Geometry.src;

public class Circle extends Figure {

    public Circle(int side1) {
        super(side1);
    }

    public double perimeterCircle(){
        return getSide1() * 2 * 3.14;
    }

    public double areaCircle(){
        return getSide2() * getSide1() * 3.14;
    }

    public double angleCircle(){
        return 360;
    }
}
