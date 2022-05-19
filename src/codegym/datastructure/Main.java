package codegym.datastructure;


import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        User[] users = new User[]{
                new User(1, "quynhanh", 45),
                new User(2, "bui di hoc", 45),
                new User(4, "tienbip", 67),
                new User(6, "thien", 67),
                new User(7, "tiebip", 67)
        };
        for (User u : users) {
            System.out.println(u);
        }
//bui, quyunh,thien, tiebip,tienbip
        //q,b, tiebip,thien,tienbip,
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        bubbleSort(users);
        System.out.println(Arrays.toString(users));
    }

    public static void bubbleSort(User[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                //  if (array[j]>array[j + 1]) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    User x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }
}
