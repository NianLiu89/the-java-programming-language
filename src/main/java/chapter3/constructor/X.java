package chapter3.constructor;

public class X {
    protected int xMask = 0x00ff;
    protected int fullMask;

    public X() {
        System.out.printf("[X constructor] xMask: %x%n", xMask);
        fullMask = xMask;
        System.out.printf("[X constructor] fullMask: %x%n", fullMask);
    }

    public int mask(int orig) {
        System.out.println("(orig & fullMask): " + (orig & fullMask));
        return (orig & fullMask);
    }
}
