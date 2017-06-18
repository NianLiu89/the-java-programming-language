package chapter2.vehicle;

public class PassengerVehicle extends Vehicle {

    private final int capacity;
    private int occupiedAmount;

    public PassengerVehicle(int capacity) {
        super();
        this.capacity = capacity;
    }

    public PassengerVehicle(int capacity, String brand) {
        super(brand);
        this.capacity = capacity;
    }

    public void occupy(int amount) {
        if (amount > capacity) {
            throw new IllegalArgumentException("Occupied amount of seat cannot be bigger than the capacity!");
        }
        occupiedAmount = amount;
    }

    public int getOccupiedAmount() {
        return occupiedAmount;
    }

    public int getAvailableAmount() {
        return capacity - occupiedAmount;
    }

    public int getCapacity() {
        return capacity;
    }

}
