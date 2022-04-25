package codegym.dequy;

public class Dequy {
    public static void main(String[] args) {
        System.out.println(sum(9));
    }

    private static int sum(int number) {
        if (number == 1)
            return 1;
        return number - sum(number - 1);
    }
}
