package chapter2.vehicle;

public class Main {

    public static void main(String[] args) {
        System.out.println("amount of args " + args.length);

        Vehicle toyota = new Vehicle("toyota");
        toyota.currentDirectionInDegree = 20;
        toyota.currentSpeed = 120;
        System.out.println(toyota);
        System.out.println("The next vehicle id will be " + Vehicle.nextID);

        Vehicle honda = new Vehicle("honda");
        System.out.println(honda);
        System.out.println("The next vehicle id will be " + Vehicle.nextID);

        Vehicle volvo = new Vehicle("volvo");
        System.out.println(volvo);
        System.out.println("The next vehicle id will be " + Vehicle.nextID);

        volvo.print("b", "d", "NL");
    }
}
