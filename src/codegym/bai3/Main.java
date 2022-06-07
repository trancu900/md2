package codegym.bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sResult = sum(1, 5);
        sResult = sum(3.4, 1);
        double dResult = sum(3.4, 1.0);
     //   System.out.println();
        System.out.println(2);
        System.out.println(2.0);
    }

    public static int sum(int a, int b) {
        System.out.println("sum(int a, int b)");
        return a + b;
    }
    public static double sum(double a, double b) {
        System.out.println("sum(double a, double b)");
        return a + b;
    }
    public static int sum(double a, int b) {
        System.out.println("sum(double a, int b)");
        return (int) (a + b);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
