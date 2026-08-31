package SOLID_principles.open_closed_principle;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Areacalculator {
    public double calculateArea(Shape s) {
        return s.calculateArea();
    }
}

public class ocp_without_violation {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 20);
        Areacalculator calculate = new Areacalculator();

        System.out.println("circle area" + calculate.calculateArea(circle));
        System.out.println("rectangle area" + calculate.calculateArea(rectangle));
    }
}
