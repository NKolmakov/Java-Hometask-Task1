package train;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import wagons.Wagon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;
import static wagons.RandomFinalWagonFactory.*;

public class TrainHelperTest {
    Train train;
    List<Wagon> wagons;

    @Before
    public void setUp() throws Exception {
        train = new Train(new Locomotive(40));
        wagons = new ArrayList<Wagon>();

        for (int i = 0; i < train.getLocomotive().getTractionPower(); i++) {
            wagons.add(generateWagon());
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
        List<Wagon> expected = wagons;
        List<Wagon> actual = new ArrayList<Wagon>();
        Collections.sort(expected,new Comparator<Wagon>() {

            public int compare(Wagon o1, Wagon o2) {
                int var1 = o1.getConvenience();
                int var2 = o2.getConvenience();
                if (var1 < var2) {
                    return 1;
                } else if (var1 > var2) {
                    return -1;
                } else return 0;
            }
        });

        TrainHelper.sortWagonsByConvenience(train);
        actual = train.getWagons();
        assertEquals(expected,actual);
    }

    @Test
    public void isContains() {
        Wagon wagon = wagons.get(1);
        boolean isContains = false;
        isContains = TrainHelper.isContains(train.getWagons(),wagon);
        assertEquals(true,isContains);
    }
}