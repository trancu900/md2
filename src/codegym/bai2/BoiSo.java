package codegym.bai2;

import java.util.Scanner;

public class BoiSo {
    public static void main(String[] args) {
        BCNN2S();
        BCNN3S();
    }

    public static void BCNN3S() {
        //input 3 numbers
        int num1 = 3;
        int num2 = 8;
        int num3 = 2;

        //create variables for the loops
        int result;
        int i = 1;
        int j = 1;

        //use a while loop to get the first LCM of the first 2 numbers
        while (true) {
            if ((num1 * i) % num2 != 0) {
                i++;
                continue;
            }
            //use another while loop to get the LCM of the 3 numbers
            while (true) {
                if (((num1 * i) * j) % num3 != 0) {
                    j++;
                    continue;
                }
                result = num1 * i * j;
                break;
                //every infinite loop needs a break
            }
            break;
            //another break for the first loop

        }
        //print your final result
        System.out.println("Your LCM is: " + result);
    }

    public static void BCNN2S() {
        int a = 8;
        int b = 9;
        int i = 1;
        while (true) {
            if ((a * i) % b != 0) {
                i++;
                System.out.println(i);
                continue;
            }
            System.out.println(a * i + " là bội số chung nhỏ nhất của a và b");
            break;
        }
    }
}
