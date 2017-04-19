package GeometryPoly.src;

public class Square extends Figure implements Calculation{

    public Square(int side1) {
        super(side1);
    }

    public double area(){
        return getSide1() * getSide1();
    }

    public double angle(){
        return 90;
    }

}

