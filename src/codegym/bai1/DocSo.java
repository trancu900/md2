package codegym.bai1;

public class DocSo {

    public static void main(String[] args) {
        int number = 6;
        int first = number / 100;//2
        int second = (number % 100) / 10;//7
        int third ;//Tu lam
        String result = null;
        //if number < 10
        if (number < 10) {

          //return;
        }
        if (number >= 10 && number < 20) {

        }
        if (number > 19 && number < 100) {

        }
        if (number > 99) {

        }
    }

    public static String _20_to_99(int number) {
        String second = null;
        switch (number) {
            case 2:
                second = "Twenty";
                break;
            case 3:
                second = "Thirty";
                break;
            case 4:
                second = "Forty";
                break;
            case 5:
                second = "Fifty";
                break;
            case 6:
                second = "Sixty";
                break;
            case 7:
                second = "Seventy";
                break;
            case 8:
                second = "Eighty";
                break;
            case 9:
                second = "Ninety";
                break;
        }

        return second;
    }

    public static String _10_to_19(int number) {
        String special = null;
        switch (number) {
            case 0:
                special = "Ten";
                break;
            case 1:
                special = "Eleven";
                break;
            case 2:
                special = "Twelve";
                break;
            case 3:
                special = "Thirteen";
                break;
            case 4:
                special = "Fourteen";
                break;
            case 5:
                special = "Fifteen";
                break;
            case 6:
                special = "Sixteen";
                break;
            case 7:
                special = "Seventeen";
                break;
            case 8:
                special = "Eighteen";
                break;
            case 9:
                special = "Nineteen";
                break;
        }
        return special;
    }

    public static String one2Nine(int number) {
        String donviStr = null;
        switch (number) {
            case 0:
                donviStr = "Zero";
                break;
            case 1:
                donviStr = "One";
                break;
            case 2:
                donviStr = "Two";
                break;
            case 3:
                donviStr = "Three";
                break;
            case 4:
                donviStr = "Four";
                break;
            case 5:
                donviStr = "Five";
                break;
            case 6:
                donviStr = "Six";
                break;
            case 7:
                donviStr = "Seven";
                break;
            case 8:
                donviStr = "Eight";
                break;
            case 9:
                donviStr = "Nine";
                break;
        }
        return donviStr;
    }
}
