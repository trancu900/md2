package codegym;

import codegym.inheritance.animal.Crocodile;
import codegym.inheritance.geometric.Circle;
import codegym.inheritance.geometric.Cylinder;
import codegym.inheritance.geometric.Rectangle;
import codegym.inheritance.geometric.Shape;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1, 45);
        showArea(cylinder);
        Circle circle = new Circle(1, "Red");
        showArea(circle);
        Rectangle rectangle = new Rectangle(1, 3);
        showArea(rectangle);
//        System.out.println(cylinder);
//        System.out.println(cylinder.getArea());
        //  Shape shape = new Shape();

    }

    public static void showArea(Shape shape) {
        System.out.println(shape.getArea());
    }
}