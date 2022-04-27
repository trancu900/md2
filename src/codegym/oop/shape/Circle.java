package codegym.oop.shape;

public class Circle extends Shape {
    private double radius;


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        System.out.println("Area Circle");
        return Math.PI * radius * radius;
    }

//    @Override
//    public String toString() {
//        return "Circle{" +
//                "radius=" + radius + ", color=" + color +
//                '}';
//    }
}
