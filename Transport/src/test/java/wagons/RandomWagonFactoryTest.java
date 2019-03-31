package wagons;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static wagons.RandomWagonFactory.*;

public class RandomWagonFactoryTest {

    @Test
    public void generateWagon_checkWagonInstanse() {
        Wagon wagon = RandomWagonFactory.generateWagon();
        boolean expected = true;
        boolean actual = false;
        if(wagon instanceof CompartmentWagon || wagon instanceof ReservedSeatWagon || wagon instanceof SedentaryWagon){
            actual = true;
        }
        assertEquals(expected,actual);

    }
}