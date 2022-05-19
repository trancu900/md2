package codegym.datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {


    public static void main(String[] args) {

        Map<Integer, User> map = new HashMap<>() {{
            put(45, new User(45, "quynhanh", 45));
            put(90, new User(90, "bui di hoc", 45));
            put(56, new User(56, "thien", 67));
            put(34, new User(34, "tiebip", 67));
            put(33, new User(32, "quynhanh", 45));
            put(31, new User(32, "quynhanh", 45));
            put(36, new User(32, "quynhanh", 45));
            put(37, new User(32, "quynhanh", 45));
            put(78, new User(32, "quynhanh", 45));
            put(76, new User(32, "quynhanh", 45));
            put(374, new User(32, "quynhanh", 45));
            put(90878, new User(32, "quynhanh", 45));
            put(92, new User(32, "quynhanh", 45));
            put(94, new User(32, "quynhanh", 45));
            put(95, new User(32, "quynhanh", 45));
            put(3662, new User(32, "quynhanh", 45));
            put(3212, new User(32, "quynhanh", 45));
            put(3323562, new User(32, "quynhanh", 45));
            put(35432, new User(32, "quynhanh", 45));
            put(32345, new User(32, "quynhanh", 45));
            put(3456542, new User(32, "quynhanh", 45));
            put(36562, new User(32, "quynhanh", 45));
            put(32768, new User(32, "quynhanh", 45));
            put(343672, new User(32, "quynhanh", 45));
            put(326758, new User(32, "quynhanh", 45));
            put(3895682, new User(32, "quynhanh", 45));
            put(3276956, new User(32, "quynhanh", 45));
            put(3267878, new User(32, "quynhanh", 45));
            put(309872, new User(32, "quynhanh", 45));
            put(32657, new User(32, "quynhanh", 45));

        }};
        long currentTimeMillis = System.currentTimeMillis();
     //   map.get(35432);

        Integer[] keys = new Integer[map.keySet().size()];
        map.keySet().toArray(keys);
        System.out.println(Arrays.toString(keys));
        bubbleSort(keys);
        System.out.println(Arrays.toString(keys));

        int index = binarySearch(keys, 35432);
        int key = keys[index];

        User user = map.get(key);
        System.out.println(System.currentTimeMillis() - currentTimeMillis);
        //  System.out.println(user);
    }

    public static int binarySearch(Object[] keys, int x) {
        int left = 0;
        int right = keys.length;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if ((int) keys[mid] == x)
                return mid;
            if (x > (int) keys[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void bubbleSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //if (array[j].compareTo(array[j + 1]) < 0) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }
}
