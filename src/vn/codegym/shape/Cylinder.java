package vn.codegym.shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;

    }

    @Override
    public double getPerimeter() {
        throw new RuntimeException("0 duoc phep");
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + super.toString() +
                "height=" + height +
                '}';
    }
}
