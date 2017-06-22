package chapter3.sort;

abstract class SortDouble {

    private double[] values;
    private final SortMetrics metrics = new SortMetrics();

    public final SortMetrics sort(double[] data) {
        values = data;
        metrics.init();
        doSort();
        return getMetrics();
    }

    protected final SortMetrics getMetrics() {
        return metrics.clone();
    }

    protected final int getDataLength() {
        return values.length;
    }

    protected final double probe(int i) {
        metrics.probeCnt++;
        return values[i];
    }

    protected final int compare(int i, int j) {
        metrics.compareCnt++;
        double d1 = values[i];
        double d2 = values[j];
        if (d1 == d2) {
            return 0;
        } else {
            return d1 < d2 ? 1 : -1;
        }
    }

    protected final void swap(int i, int j) {
        metrics.swapCnt++;
        double tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }

    protected abstract void doSort();

}
