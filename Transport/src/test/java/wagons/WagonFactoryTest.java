package wagons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WagonFactoryTest {

    WagonFactory wagonFactory;

    @Before
    public void setUp() throws Exception {
        wagonFactory = new WagonFactory();
    }

    @Test
    public void createWagon() throws IllegalAccessException{
        Wagon wagon = wagonFactory.createWagon(40,30,50,40);
        assertEquals(40,wagon.getLuggageCapacity());
    }
}