package vn.codegym.shape;

public class Main {
    public static void main(String[] args) {
        //  Shape shape1 =new Circle(2) ;
        //   Shape shape2 = new Rectangle(2, 3);
        test(new Circle(2));
        test(new Rectangle(2, 3));
    }

    private static void test(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println(circle.getArea());
            System.out.println(circle);
        }
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.getArea());
            System.out.println(rectangle);
        }
        //  ((Circle) shape).getArea();

    }
}
