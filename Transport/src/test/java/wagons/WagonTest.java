package wagons;

import org.junit.Before;
import org.junit.Test;
import train.Locomotive;
import train.Train;

import static org.junit.Assert.*;

public class WagonTest {

    Wagon wagon;
    WagonFactory wagonFactory;
    @Before
    public void setUp() throws Exception {
        wagon = new ReservedSeatWagon(40,30,40,30);
    }

    @Test
    public void setNumber() {
        wagon.setNumber(1);
        int expected = 1;
        int actual = wagon.getNumber();
        assertEquals(expected,actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void wagonConstructor_fail_getIllegalArgumentException() throws IllegalAccessException{
        Wagon wagon = new CompartmentWagon(10,20,30,50);
    }

    @Test
    public void getLuggageCapacity() {
        assertEquals(40,wagon.getLuggageCapacity());
    }

    @Test
    public void getNumber() {
        Train train = new Train(new Locomotive(1));
        train.addWagon(wagon); // wagon gets number when it added to train
        int actual = train.getWagons().get(0).getNumber();

        assertEquals(1,actual);
    }

    @Test
    public void getAmountOfSeats() {
        assertEquals(40,wagon.getAmountOfSeats());
    }

    @Test
    public void getAmountOfPassengers() {
        assertEquals(30,wagon.getAmountOfPassengers());
    }

    @Test
    public void getAmountOfLuggage() {
        assertEquals(30,wagon.getAmountOfLuggage());
    }

    @Test
    public void getConvenience() {
        assertEquals(2,wagon.getConvenience());
    }

    @Test
    public void getType() {
        assertEquals("ReservedSeat",wagon.getType());
    }

}