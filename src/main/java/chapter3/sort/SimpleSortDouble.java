package chapter3.sort;

public class SimpleSortDouble extends SortDouble {

    protected void doSort() {
        for (int i = 0; i < getDataLength(); i++) {
            for (int j = i; j < getDataLength(); j++) {
                if (compare(i,j) < 0) {
                    swap(i,j);
                }
            }
        }

    }
}
