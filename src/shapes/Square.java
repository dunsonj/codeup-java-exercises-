package shapes;
/*
public class Square extends Rectangle{

    protected int side;

    public Square(int side){
        super(side, side);
    }

    @Override
    public int getArea() {
        System.out.println("This is the area: ");
        return side * side;
    }

    @Override
    public int getParameter() {
        System.out.println("This is the parameter: ");
        return 4 * side;
    }
}
*/

public class Square extends Quadrilateral{

    protected double side;
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side *side;
    }

    public Square(double side){
        super(side,side);
        this.side = side;
    }
}