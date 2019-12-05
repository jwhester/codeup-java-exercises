package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(int length, int width) {
        super(length, width);
    }

    public int getPerimeter() {
        return (2*length)+(2*width);
    }

    public int getArea() {
        return length * width;
    }

    void setLength(int num) {
        this.length = num;
    }

    void setWidth(int num) {
        this.width = num;
    }
}
