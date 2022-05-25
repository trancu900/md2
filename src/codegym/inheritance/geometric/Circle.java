package codegym.inheritance.geometric;

public class Circle extends Shape {
    protected double radius;
    protected double PI;
//    public Circle() {
//        PI=3.14;
//        System.out.println("public Circle()");
//    }
    public Circle(double radius) {
        this.radius = radius;
        PI=3.14;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle{radius=%s,color=%s}",
                radius,
                getColor());

    }
}
