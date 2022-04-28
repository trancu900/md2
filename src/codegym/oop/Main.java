package codegym.oop;

import codegym.oop.shape.Circle;
import codegym.oop.shape.Cylinder;
import codegym.oop.shape.Rectangle;
import codegym.oop.shape.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.3, 3.4, "Red");
        System.out.println(cylinder.getVolume());
        Scanner scanner=new Scanner(System.in);
      String username=scanner.nextLine();
     // scanner.nextDouble()
      float a=  Float.parseFloat(scanner.nextLine());
      double b=  Double.parseDouble(scanner.nextLine());
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
