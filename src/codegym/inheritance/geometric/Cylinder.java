package codegym.inheritance.geometric;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
    }

    public double getHeight() {
        return height;
    }

    //Liskov
    @Override
    public double getPerimeter() {
       throw new RuntimeException("Cylinder can't get perimeter");
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}
