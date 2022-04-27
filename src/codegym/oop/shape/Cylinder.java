package codegym.oop.shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        System.out.println("getVolume()");
        return height * getArea();
    }
}
