package GeometryPoly.src;

public class Circle extends Figure implements Calculation {

    public Circle(int side1) {
        super(side1);
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
