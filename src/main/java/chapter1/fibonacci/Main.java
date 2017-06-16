package chapter1.fibonacci;

public class Main {

    private static final int MAX_SIZE = 20;

    public static void main(String[] args) {
        Number[] array = new Number[MAX_SIZE];
        array[0] = new Number(1);
        array[1] = new Number(1);

        for (int i = 2; i < array.length; i++) {
            array[i] = Number.sum(array[i - 2], array[i - 1]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%2s] %s%n", i, array[i]);
        }
    }
}
