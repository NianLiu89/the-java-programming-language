package chapter2.vehicle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Generic vehicle ==================");

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


        System.out.println();
        System.out.println("Passenger vehicle ==================");
        PassengerVehicle man = new PassengerVehicle(40, "MAN");
        man.occupy(20);
        System.out.println(man);
        System.out.printf("capacity: %d, available: %d, occupied: %d%n", man.getCapacity(), man.getAvailableAmount(), man.getOccupiedAmount());


        PassengerVehicle yaris = new PassengerVehicle(5, "yaris");
        yaris.occupy(2);
        System.out.println(yaris);
        System.out.printf("capacity: %d, available: %d, occupied: %d%n", yaris.getCapacity(), yaris.getAvailableAmount(), yaris.getOccupiedAmount());

        PassengerVehicle farari = new PassengerVehicle(2, "Farari");
        farari.occupy(2);
        System.out.println(farari);
        System.out.printf("capacity: %d, available: %d, occupied: %d%n", farari.getCapacity(), farari.getAvailableAmount(), farari.getOccupiedAmount());
    }
}
