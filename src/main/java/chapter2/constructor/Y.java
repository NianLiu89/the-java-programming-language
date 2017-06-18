package chapter2.constructor;

public class Y extends X {
    protected int yMask = 0xff00;

    public Y() {
        System.out.printf("[Y constructor] yMask: %x%n", yMask);
        fullMask |= yMask;
        System.out.printf("[Y constructor] fullMask: %x%n", fullMask);
    }
}
