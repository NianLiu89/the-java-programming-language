package chapter1.lookup;

public class SimpleLookup implements Lookup {

    private String[] names;
    private Object[] values;

    public SimpleLookup() {
        names = new String[]{"a", "b", "c"};
        values = new Object[]{1, "二", "three"};
    }

    public Object find(String name) {
        for (int i = 0; i < names.length; i++) {
            if (name != null && name.equals(names[i])) {
                return values[i];
            }
        }
        return null;
    }

    public void add(int index, String name, Object value) {
        names[index] = name;
        values[index] = value;
    }

    public void remove(int index) {
        names[index] = null;
        values[index] = null;
    }

    public void print() {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("[%02d] %-5s %-10s%n", i, names[i], values[i]);
        }
    }

}
