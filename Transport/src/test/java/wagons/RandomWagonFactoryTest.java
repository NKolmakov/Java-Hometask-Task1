package wagons;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;
import static wagons.Wagon.logger;

public class RandomWagonFactoryTest {

    WagonFactory wagonFactory;
    @Before
    public void setUp() throws Exception {
        wagonFactory = new WagonFactory();

    }

    @Test
    public void generateWagon_NOT_NULL() {
        Wagon wagon = wagonFactory.generateWagon();
        assertNotNull(wagon);
    }
}