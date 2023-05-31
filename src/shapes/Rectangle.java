package shapes;
/*
public class Rectangle {
    protected int length;
    protected int width;
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
public int getArea(){
        return length * width;
}
public int getParameter(){
        return (2 * length) + (2 * width);
}

    public static void main(String[] args) {
        Rectangle nRec = new Rectangle(5,6);
        System.out.println(nRec.getArea());
        System.out.println(nRec.getParameter());
    }



}
*/

public class Rectangle extends Quadrilateral {
    protected double length;
    protected double width;



    @Override
    public double getArea() {
        return length* width;
    }

    public Rectangle(double length, double width){
        super(length,width);
        this.length = length;
        this.width = width;
    }
}