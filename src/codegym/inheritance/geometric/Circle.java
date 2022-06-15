package codegym.inheritance.geometric;

import java.io.Serializable;

public class Circle extends Shape implements Serializable {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "{" +
                "radius=" + radius +
                '}';
    }
}
