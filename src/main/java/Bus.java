import java.util.ArrayList;

public class Bus {

    private ArrayList<Person> passengers;
    private String destination;
    private int capacity;

    public Bus(String destination, int capacity){
        this.passengers = new ArrayList<Person>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.capacity > this.passengerCount()) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void removeAllPassenegers() {
        this.passengers.clear();
    }

    public void pickUpPassengerFromQueue(BusStop busStop) {
        Person person = busStop.removePassenger();
        this.addPassenger(person);

    }
}
