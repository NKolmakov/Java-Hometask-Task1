package train;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import wagonFactory.AbstractWagon;
import wagonFactory.RandomWagonFactory;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TrainTest {
    Train train;
    List<AbstractWagon> wagons;
    public static final Logger logger = Logger.getLogger(TrainTest.class);

    @Before
    public void setUp() throws Exception {
    //    PropertyConfigurator.configure("log4j.properties");
       train = new Train(new Locomotive(10));
       wagons = new ArrayList<AbstractWagon>();
        RandomWagonFactory randomWagonFactory = new RandomWagonFactory();

        for (int i = 0; i < 10; i++) {
            wagons.add(randomWagonFactory.generateWagon());
        }

        train.addWagons(wagons);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeWagon() {
        wagons.remove(5);
        List<AbstractWagon> expected = wagons;
        train.removeWagon(train.getWagons().get(5));
        List<AbstractWagon> actual = train.getWagons();
        assertEquals(expected,actual);
    }

    @Test
    public void removeWagons() {
        List<AbstractWagon> lis4Delete = new ArrayList<AbstractWagon>();
        lis4Delete.add(train.getWagons().get(1));
        lis4Delete.add(train.getWagons().get(5));
        wagons.remove(lis4Delete.get(0));
        wagons.remove(lis4Delete.get(1));
        List<AbstractWagon> expected = wagons;
        train.removeWagons(lis4Delete);
        List<AbstractWagon> actual = train.getWagons();
        assertEquals(expected,actual);
    }

    @Test
    public void getWagons() {
        List<AbstractWagon> expected = new ArrayList<AbstractWagon>();
        List<AbstractWagon> actual = new ArrayList<AbstractWagon>();

        expected = wagons;
        actual = train.getWagons();

        assertEquals(expected,actual);
    }

    @Test
    public void addWagon() {
        AbstractWagon wagon = wagons.get(1);
        Train train1 = new Train(new Locomotive(10));
        train1.addWagon(wagon);
        List<AbstractWagon> expected = new ArrayList<AbstractWagon>();
        expected.add(wagon);
        List<AbstractWagon> actual = train1.getWagons();

        assertEquals(expected,actual);
    }

    @Test()
    public void addWagons() {
        AbstractWagon wagon = wagons.get(1);
        AbstractWagon wagon1 = wagons.get(2);
        AbstractWagon wagon2 = wagons.get(3);
        List<AbstractWagon> addedWagons = new ArrayList<AbstractWagon>();
        addedWagons.add(wagon);
        addedWagons.add(wagon1);
        addedWagons.add(wagon2);
        Train train1 = new Train(new Locomotive(10));
        train1.addWagons(addedWagons);
        List<AbstractWagon> expected = new ArrayList<AbstractWagon>();
        expected.add(wagon);
        expected.add(wagon1);
        expected.add(wagon2);
        List<AbstractWagon> actual = train1.getWagons();

        assertEquals(expected,actual);
    }

//    @Test
//    public void addWagons() {
//        AbstractWagon wagon = wagons.get(1);
//        AbstractWagon wagon1 = wagons.get(2);
//        AbstractWagon wagon2 = wagons.get(3);
//        List<AbstractWagon> addedWagons = new ArrayList<AbstractWagon>();
//        addedWagons.add(wagon);
//        addedWagons.add(wagon1);
//        addedWagons.add(wagon2);
//        Train train1 = new Train(new Locomotive(10));
//        train1.addWagons(addedWagons);
//        List<AbstractWagon> actual = train1.getWagons();
//
//        assertNotEquals(2,actual.size());
//    }
}