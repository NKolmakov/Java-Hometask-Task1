package wagons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WagonTest {

    Wagon wagon;
    @Before
    public void setUp() throws Exception {
        WagonFactory wagonFactory = new WagonFactory();
        wagon = wagonFactory.generateWagon();
    }

    @Test
    public void setNumber() {
        wagon.setNumber(1);
        int expected = 1;
        int actual = wagon.getNumber();
        assertEquals(expected,actual);

    }
}