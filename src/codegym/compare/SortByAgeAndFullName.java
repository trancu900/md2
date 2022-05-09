package codegym.compare;

import java.util.Comparator;

public class SortByAgeAndFullName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        double result = o1.getAge() - o2.getAge();
        if (result == 0) {
            return o1.getFullName().compareTo(o2.getFullName());
        }
        return result > 0 ? 1 : -1;
    }
}
