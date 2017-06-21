package chapter3.clone;

/**
 * The reference to the buffer is shared between the original object and the cloned object.
 */
public class SharedIntegerStack implements Cloneable {

    private int[] buffer;
    private int top;

    public SharedIntegerStack(int maxContents) {
        buffer = new int[maxContents];
        top = -1;
    }

    public void push(int val) {
        buffer[++top] = val;
    }

    public int pop() {
        return buffer[top--];
    }

    protected SharedIntegerStack clone() throws CloneNotSupportedException {
        try {
            return (SharedIntegerStack) super.clone();
        } catch (CloneNotSupportedException e) {
            // Cannot happen -- we support clone
            throw new InternalError(e.toString());
        }
    }

    public final void print() {
        for (int i : buffer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
