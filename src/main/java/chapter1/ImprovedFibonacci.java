package chapter1;

public class ImprovedFibonacci {

    private static final int MAX_INDEX = 10;

    public static void main(String[] args) {
        int low = 1;
        int high = 1;
        int index = 3;
        System.out.println("1: 1");
        System.out.println("2: 1");


        while (index < MAX_INDEX) {
            high = low + high;
            low = high - low;
            System.out.println(String.format("%s: %s %s", index, high, high % 2 == 0 ? "*" : ""));
            index++;
        }
    }
}
