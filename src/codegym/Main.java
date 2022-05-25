package codegym;

import codegym.inheritance.animal.Crocodile;
import codegym.inheritance.geometric.Circle;
import codegym.inheritance.geometric.Cylinder;
import codegym.inheritance.geometric.Rectangle;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1, 45);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());

    }
}