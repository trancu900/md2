package codegym.bai3;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLanXuatHien {
    //    public static void main(String[] args) {
//        String khaibao = "Khai bao mot chuoi và gan cho no mot gia tri";
//        Scanner scanner = new Scanner(System.in);
//        String input;
//        System.out.println("Moi Nhap:");
//        while ((input = scanner.nextLine()).length() != 1) {
//            System.out.println("Moi Nhap lai");
//        }
//        char ch = input.charAt(0);
//        int count = 0;
//        for (int i = 0; i < khaibao.length(); i++) {
//            if (ch == khaibao.charAt(i))
//                count++;
//        }
//        System.out.printf("so lan xuat hien ki tu %s la:%s", ch, count);
//
//    }
    public static void main(String[] args) {
        int[] a = {1, 9, 3, 2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
