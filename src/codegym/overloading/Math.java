package codegym.overloading;

public class Math {
    public static void main(String[] args) {
        int key = 1;
        switch (key) {
            case 1:
                break;
            case 2:
                System.out.println("Ok");
                break;
            default:
                break;
        }
        System.out.println();
    }

    public static double sum(int a,
                             int b) {
        return a + b;
    }

    public static double sum(double a,
                             double b) {
        return a + b;
    }

    public static double sum(double a,
                             double b,
                             double c) {
        return a + b + c;
    }
}
