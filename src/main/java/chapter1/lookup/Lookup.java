package chapter1.lookup;

public interface Lookup {

    Object find(String name);

    void add(int index, String name, Object value);

    void remove(int index);

    void print();
}
