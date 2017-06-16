package chapter1.lookup;

public class Main {

    public static void main(String[] args) {
        Lookup lookup = new SimpleLookup();
        System.out.println("original");
        lookup.print();

        lookup.remove(1);
        System.out.println("after removing");
        lookup.print();

        lookup.add(1, "N", "念");
        System.out.println("after adding");
        lookup.print();
    }
}
