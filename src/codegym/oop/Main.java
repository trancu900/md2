package codegym.oop;

import codegym.oop.shape.Circle;
import codegym.oop.shape.Cylinder;
import codegym.oop.shape.Rectangle;
import codegym.oop.shape.Shape;

public class Main {
    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder(2.3, 3.4, "Red");
//        Rectangle rectangle = new Rectangle(2.0, 3.0);
        Circle mCircle = new Circle(3.4, "Red");
       //v System.out.println(circle);
//        showArea(rectangle);
//        showArea(circle);
//        showArea(cylinder);
    }

    public static void showArea(Shape shape) {
        if (shape instanceof Rectangle) {
            double area = ((Rectangle) shape).getArea();
            System.out.println(area);
        }

        if (shape instanceof Circle) {
            double area = ((Circle) shape).getArea();
            System.out.println(area);
        }

        if (shape instanceof Cylinder) {
            double volume = ((Cylinder) shape).getVolume();
            System.out.println(volume);
        }

    }
}
