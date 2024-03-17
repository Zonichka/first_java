package lab2;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.width = length;
    }

    public double calculateSquare(double length, double width) {
        return length*width;
    }

    public double calculatePerimeter(double length, double width) {
        return 2*(length+width);
    }
}
