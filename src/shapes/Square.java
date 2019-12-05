package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    void setLength(int num) {
        this.length = num;
    }

    void setWidth(int num) {
        this.width = num;
    }

    public int getPerimeter() {
        return (4*length);
    }

    public int getArea() {
        return width * width;
    }
}
