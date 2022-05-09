package codegym.compare;

import java.util.Comparator;

public class SortByFullNameDESC implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getFullName().compareTo(o1.getFullName());
    }
}
