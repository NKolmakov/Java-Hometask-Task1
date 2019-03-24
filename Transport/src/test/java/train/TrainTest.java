package train;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import wagons.Wagon;
import wagons.WagonFactory;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TrainTest {
    Train train;
    List<Wagon> wagons;
    WagonFactory wagonFactory;
    public static final Logger logger = Logger.getLogger(TrainTest.class);

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
    public void removeWagon() {
        wagons.remove(5);
        List<Wagon> expected = wagons;
        train.removeWagon(train.getWagons().get(5));
        List<Wagon> actual = train.getWagons();
        assertEquals(expected, actual);
    }

    @Test
    public void removeWagons() {
        List<Wagon> lis4Delete = new ArrayList<Wagon>();
        lis4Delete.add(train.getWagons().get(1));
        lis4Delete.add(train.getWagons().get(5));
        wagons.remove(lis4Delete.get(0));
        wagons.remove(lis4Delete.get(1));
        List<Wagon> expected = wagons;
        train.removeWagons(lis4Delete);
        List<Wagon> actual = train.getWagons();
        assertEquals(expected, actual);
    }

    @Test
    public void getWagons() {
        List<Wagon> expected = new ArrayList<Wagon>();
        List<Wagon> actual = new ArrayList<Wagon>();

        expected = wagons;
        actual = train.getWagons();

        assertEquals(expected, actual);
    }

    @Test
    public void addWagon_NO_TRAIN_OVERFLOW() {
        Wagon wagon = wagons.get(1);
        Train train1 = new Train(new Locomotive(10));
        train1.addWagon(wagon);
        List<Wagon> expected = new ArrayList<Wagon>();
        expected.add(wagon);
        List<Wagon> actual = train1.getWagons();

        assertEquals(expected, actual);
    }

    @Test(expected = StackOverflowError.class)
    public void addWagon_TRAIN_OVERFLOW() {
        Wagon wagon = wagonFactory.generateWagon();
        train.addWagon(wagon);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addWagon_CONTAINS_SAME() {
        Wagon wagon = wagons.get(1);
        Wagon wagon1 = wagons.get(1);
        Train train1 = new Train(new Locomotive(10));
        train1.addWagon(wagon);
        train1.addWagon(wagon1);
    }

    @Test()
    public void addWagons_NOT_CONTAINS_SAME() {
        Wagon wagon = wagons.get(1);
        Wagon wagon1 = wagons.get(2);
        Wagon wagon2 = wagons.get(3);
        List<Wagon> addedWagons = new ArrayList<Wagon>();
        addedWagons.add(wagon);
        addedWagons.add(wagon1);
        addedWagons.add(wagon2);
        Train train1 = new Train(new Locomotive(10));
        train1.addWagons(addedWagons);
        List<Wagon> expected = new ArrayList<Wagon>();
        expected.add(wagon);
        expected.add(wagon1);
        expected.add(wagon2);
        List<Wagon> actual = train1.getWagons();

        assertEquals(expected, actual);
    }

    @Test(expected = StackOverflowError.class)
    public void addWagons_TRAIN_OVERFLOW() {
        List<Wagon> wagonList = new ArrayList<Wagon>();
        Wagon wagon = wagonFactory.generateWagon();
        Wagon wagon1 = wagonFactory.generateWagon();
        wagonList.add(wagon);
        wagonList.add(wagon1);
        train.addWagons(wagonList);
    }

    @Test
    public void addWagons_NO_TRAIN_OVERFLOW() {
        List<Wagon> expected = wagons;
        Train train1 = new Train(new Locomotive(10));
        train1.addWagons(wagons);
        List<Wagon> actual = train1.getWagons();
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addWagons_CONTAINS_SAME() {
        Wagon wagon = wagons.get(1);
        Wagon wagon1 = wagons.get(2);
        List<Wagon> wagonList = new ArrayList<Wagon>();
        wagonList.add(wagon);
        wagonList.add(wagon1);
        Train train1 = new Train(new Locomotive(10));
        train1.addWagon(wagon);
        train1.addWagon(wagon1);
        train1.addWagons(wagonList);

    }

}
