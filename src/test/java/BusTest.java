import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Moscow", 5);
        person = new Person();
        busStop = new BusStop("Codeclan");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantAddPassengerWhenBusFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemoveAllPassengers(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removeAllPassenegers();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickPassengerFromQueue(){
        busStop.addPassenger(person);
        bus.pickUpPassengerFromQueue(busStop);
        assertEquals(1, bus.passengerCount());
    }

}
