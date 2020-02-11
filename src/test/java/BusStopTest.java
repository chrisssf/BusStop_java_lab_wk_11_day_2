import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        person = new Person();
        busStop = new BusStop("Codeclan");
    }

    @Test
    public void busStopShouldStartEmpty(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPassengerToQueue(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePassengerFromQueue(){
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.removePassenger();
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemoveAllPassengersFromQueue(){
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.removeAll();
        assertEquals(0, busStop.queueCount());
    }
}
