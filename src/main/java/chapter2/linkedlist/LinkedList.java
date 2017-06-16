package chapter2.linkedlist;

import lombok.ToString;

@ToString
public class LinkedList {
    private Object object;
    private LinkedList next;

    public LinkedList(Object object) {
        this.object = object;
    }

    public LinkedList(Object object, LinkedList next) {
        this.object = object;
        this.next = next;
    }


    public void print() {
        System.out.println(object);
        if (next != null) {
            next.print();
        }
    }
}
