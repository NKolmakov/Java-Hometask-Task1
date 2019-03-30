package train;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocomotiveTest {

    Locomotive locomotive;
    @Before()
    public void setUp(){
        locomotive = new Locomotive(10);
    }

    @Test
    public void getTractionPower() {
        int expected = 10;
        int actual = locomotive.getTractionPower();
        assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createLocomotive_fail(){
        Locomotive locomotive = new Locomotive(-5);
    }
}