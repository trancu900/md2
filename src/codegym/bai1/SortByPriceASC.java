package codegym.bai1;

import java.util.Comparator;

public class SortByPriceASC implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getAge() - o2.getAge();
        if (result == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return (result > 0 ? 1 : -1);
    }
}
