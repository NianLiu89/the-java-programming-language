package chapter1;

public class Fibonacci {

    private static int MAX = 50;

    public static void main(String[] args) {
        int low = 1;
        int high = 1;

        System.out.println(low);

        while (high < MAX) {
            System.out.println(high);
            high = low + high;
            low = high - low;
        }
    }
}
