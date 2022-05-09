package codegym.compare;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1L, "Anh Quynh", 0.8));
        list.add(new Person(2L, "QuynhAnh ", 0.1));
        list.add(new Person(3L, "QuynhAnh ", 0.17));
        list.add(new Person(10L, "ZuynhAnh ", 0.17));
        list.add(new Person(9L, "Ho", 1.2));
        list.add(new Person(4L, "HUo", 1.2));
        list.add(new Person(5L, "Ly", 1.6));
        list.sort(new SortByAgeAndFullName());
//D: 2,3,1,9,4,5
        //P: 2,3,10,1,4,9,5
        System.out.println(list);

        //      System.out.println(c1.compareTo(c2));

    }

}

