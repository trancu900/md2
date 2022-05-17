package codegym.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Baoooooooooooo SiOnh".toLowerCase();
        String input = scanner.nextLine().toLowerCase();
        if (input.length() != 1) {
            System.out.println("Tối đa và tối thiểu là 1 kí tự");
            return;
        }
        char ch=input.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count += 1;
        }
        System.out.printf("Số lần kí tự xuất hiện là %d", count);

    }
}
