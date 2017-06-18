package chapter2.vehicle;

import lombok.ToString;

@ToString
public class Vehicle {

    int id;
    String ownerName;
    String brandName;

    int currentSpeed;
    int currentDirectionInDegree;

    public static Integer nextID = 0;

    public Vehicle() {
        this("UNKNOWN");
    }

    public Vehicle(String brandName) {
        this.id = nextID++;
        this.brandName = brandName;
    }

    public void print(String... msgs) {
        for (int i = 0; i < msgs.length; i++) {
            System.out.println(msgs[i]);
        }
    }
}
