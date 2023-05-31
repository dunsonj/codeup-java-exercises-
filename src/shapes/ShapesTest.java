package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        /*


        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area: "+ box1.getArea());
        System.out.println("Perimeter : "+ box1.getParameter());

        Rectangle box2 = new Square(5);
        System.out.println("Area: "+ box2.getArea());
        System.out.println("Perimeter : "+ box2.getParameter());


         */

        Measurable myShape;
        myShape = new Rectangle(5.0,4.0);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

//        myShape.getL



    }
}
