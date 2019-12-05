package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Measurable myShape;
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(5, 8);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

}
}
