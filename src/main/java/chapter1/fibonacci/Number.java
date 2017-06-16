package chapter1.fibonacci;

class Number {

    private int value;
    private boolean isEven;

    Number(int value) {
        this.value = value;
        this.isEven = value % 2 == 0;
    }

    int getValue() {
        return value;
    }

    boolean isEven() {
        return isEven;
    }

    static Number sum(Number nr1, Number nr2) {
        return new Number(nr1.getValue() + nr2.getValue());
    }

    @Override
    public String toString() {
        return String.format("%s %s", value, isEven ? "*" : "");
    }
}
