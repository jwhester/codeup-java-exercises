package shapes;

public class Square extends Rectangle {
    int side;
    public Square(int side) {
        super(side, side);
    }
    @Override
    public int getArea() {
        int area = side ^ 2;
        return area;
    }
    public int getPerimeter() {
        int perimeter = 4 * side;
        return perimeter;
    }
}
