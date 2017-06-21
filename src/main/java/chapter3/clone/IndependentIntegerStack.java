package chapter3.clone;

/**
 * The reference to the buffer is NOT shared between the original object and the cloned object.
 */
public class IndependentIntegerStack implements Cloneable {

    private int[] buffer;
    private int top;

    public IndependentIntegerStack(int maxContents) {
        buffer = new int[maxContents];
        top = -1;
    }

    public void push(int val) {
        buffer[++top] = val;
    }

    public int pop() {
        return buffer[top--];
    }

    protected IndependentIntegerStack clone() throws CloneNotSupportedException {
        try {
            IndependentIntegerStack nObj = (IndependentIntegerStack) super.clone();
            nObj.buffer = buffer.clone();
            return nObj;
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
