package codegym.inheritance.geometric;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        super.color = "Orange";
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return String.format(
                "Cylinder{height=%s,radius=%s,color=%s}",
                height,
                radius,
                getColor());

    }
}
