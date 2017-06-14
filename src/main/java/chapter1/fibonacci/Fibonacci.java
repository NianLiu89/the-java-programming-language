package chapter1.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int low = 1;
        int high = 1;

        System.out.println(low);

        while (high < 50) {
            System.out.println(high);
            high = low + high;
            low = high - low;
        }
    }
}
