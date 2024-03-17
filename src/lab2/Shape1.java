package lab2;

public class Shape1 {
    public double calculateArea() {
        return 0.0; // Площадь общей фигуры
    }

    public double calculatePerimeter() {
        return 0.0; // Периметр общей фигуры
    }

    public static void main(String[] args) {
        Circle1 circle = new Circle1(5);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());

        Square1 square = new Square1(4);
        System.out.println("Площадь квадрата: " + square.calculateArea());
        System.out.println("Периметр квадрата: " + square.calculatePerimeter());

        Triangle1 triangle = new Triangle1(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
    }
}

// Подкласс Circle (круга)
class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Подкласс Square (квадрат)
class Square1 extends Shape1 {
    private double side;

    public Square1(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Подкласс Triangle (треугольник)
class Triangle1 extends Shape1 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
