package codegym.bai19;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String input = "75-H1 9j99";
        String pattern = "75-[A-Z]\\d{1} \\d{4}";
        System.out.println(Pattern.matches(pattern, input));
    }
}
