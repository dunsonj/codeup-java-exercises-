package shapes;

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
