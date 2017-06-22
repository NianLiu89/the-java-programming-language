package chapter3.sort;

import lombok.ToString;

@ToString
public class SortMetrics implements Cloneable {

    public long probeCnt,   // simple data probes
            compareCnt,     // comparing two elements
            swapCnt;        // swapping two elements

    public void init() {
        probeCnt = compareCnt = swapCnt = 0;
    }

    public SortMetrics clone() {
        try {
            return (SortMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            // can't happen: this and Object both clone
            throw new InternalError(e.toString());
        }
    }
}
