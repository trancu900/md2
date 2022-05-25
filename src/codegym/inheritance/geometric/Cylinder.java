package codegym.inheritance.geometric;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
    }

    public double getHeight() {
        return height;
    }



    public double getVolume() {
        return super.getArea() * this.height;
    }


}
