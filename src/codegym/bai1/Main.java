package codegym.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sinh", -300, -0));
        people.add(new Person("Phong", 23, 60));
        people.add(new Person("DTri", 23, 100));
        people.add(new Person("Phuoc", 23, 1000));
        people.add(new Person("Ngan", 23, Double.MAX_VALUE));

        SortByPriceASC sortByPriceASC = new SortByPriceASC();
        people.sort(sortByPriceASC);
        System.out.print(people);

        //DTri, Ngan, Phuoc, Phong ,Sinh
        //DTri, Ngan, Phong ,Phuoc ,Sinh
    }
}
