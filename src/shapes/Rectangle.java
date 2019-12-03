package shapes;

public class Rectangle {
    protected static int length;
    protected static int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        int area = length * width;
        return area;
    }
    public int getPerimeter() {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }
}
