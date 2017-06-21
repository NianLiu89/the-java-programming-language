package chapter3.clone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        SharedIntegerStack sharedFirst = new SharedIntegerStack(3);
        sharedFirst.push(1);
        sharedFirst.push(2);
        SharedIntegerStack sharedSecond = sharedFirst.clone();
        sharedFirst.push(3);

        sharedFirst.print();
        sharedSecond.print();

        IndependentIntegerStack indeFirst = new IndependentIntegerStack(3);
        indeFirst.push(4);
        indeFirst.push(5);
        IndependentIntegerStack indeSecond = indeFirst.clone();
        indeFirst.push(6);

        indeFirst.print();
        indeSecond.print();
    }
}
