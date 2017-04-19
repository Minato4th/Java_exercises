package Geometry.src;

public class Square extends Figure {

    public Square(int side1) {
        super(side1);
    }

    public double perimeterSquare(){
        return getSide1() + getSide1() + getSide1() + getSide1();
    }

    public double areaSquare(){
        return getSide1() * getSide1();
    }

    public double angleSquare(){
        return 90;
    }
}

