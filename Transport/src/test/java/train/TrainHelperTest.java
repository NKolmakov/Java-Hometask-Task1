package train;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import wagons.Wagon;
import wagons.WagonFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class TrainHelperTest {
    Train train;
    List<Wagon> wagons;
    WagonFactory wagonFactory;

    @Before
    public void setUp() throws Exception {
        train = new Train(new Locomotive(10));
        wagons = new ArrayList<Wagon>();
        wagonFactory = new WagonFactory();

        for (int i = 0; i < 10; i++) {
            wagons.add(wagonFactory.generateWagon());
        }

        train.addWagons(wagons);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCommonPassengerAmount() {
        int expectedPassengerAmount = 0;
        for(Wagon wagon:wagons){
            expectedPassengerAmount+=wagon.getAmountOfPassengers();
        }
        int actualPassengerAmount = TrainHelper.getCommonPassengerAmount(train);
        assertEquals(expectedPassengerAmount,actualPassengerAmount);
    }

    //don't know is this test required
    @Test
    public void getCommonPassengerAmount_EMPRY_LIST() {
        int expectedPassengerAmount = 0;
        List<Wagon> wagonList = new ArrayList<Wagon>();
        Train train1 = new Train(new Locomotive(10));
        for(Wagon wagon:wagonList){
            expectedPassengerAmount+=wagon.getAmountOfPassengers();
        }
        int actualPassengerAmount = TrainHelper.getCommonPassengerAmount(train1);
        assertEquals(expectedPassengerAmount,actualPassengerAmount);
    }

    @Test
    public void getCommonLuggageAmount() {
        int expected = 0;
        for (Wagon wagon:wagons){
            expected+=wagon.getAmountOfLuggage();
        }
        int actual = TrainHelper.getCommonLuggageAmount(train);
        assertEquals(expected,actual);
    }

    @Test
    public void findByPassengerAmount_CORRECT_ARGUMENTS() {
        List<Wagon> expected = new ArrayList<Wagon>();
        for (Wagon wagon:wagons){
            if(wagon.getAmountOfPassengers()>= 10 && wagon.getAmountOfPassengers()<=30)
                expected.add(wagon);

        }
        List<Wagon> actual = TrainHelper.findByPassengerAmount(10,30,train);
        assertEquals(expected,actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findByPassengerAmount_UNCORRECT_ARGUMENT_MIN() {
        List<Wagon> actual = TrainHelper.findByPassengerAmount(-1,30,train);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findByPassengerAmount_UNCORRECT_ARGUMENT_MAX() {
        List<Wagon> actual = TrainHelper.findByPassengerAmount(10,9,train);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findByPassengerAmount_UNCORRECT_RANGE() {
        List<Wagon> actual = TrainHelper.findByPassengerAmount(0,0,train);

    }


    //todo: make this test
    @Test
    public void sortWagonsByConvenience() {
        List<Wagon> expected = new ArrayList<Wagon>();
        List<Wagon> actual = new ArrayList<Wagon>();

    }

    @Test
    public void isContains() {
    }
}