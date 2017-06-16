package chapter2.linkedlist;

import chapter2.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle toyota = new Vehicle("toyota");

        Vehicle honda = new Vehicle("honda");
        Vehicle volvo = new Vehicle("volvo");


        LinkedList list = new LinkedList(honda, new LinkedList(volvo, new LinkedList(toyota)));
        list.print();
    }
}
