package train;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import wagons.Wagon;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import static org.junit.Assert.*;
import static wagons.RandomWagonFactory.generateWagon;

public class TrainTest {
    Train train;
    List<Wagon> wagons;

    @Before
    public void setUp() throws Exception {
        train = new Train(new Locomotive(10));
        wagons = new ArrayList<Wagon>();

        for (int i = 0; i < 10; i++) {
            wagons.add(generateWagon());
        }

        train.addWagons(wagons);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void trainConstructor() {
        Locomotive expected = new Locomotive(5);
        Train train1 = new Train(expected);
        Locomotive actual = train1.getLocomotive();
        assertEquals(expected, actual);

    }

    @Test
    public void removeWagon_contains_wagon() {
        wagons.remove(5);
        List<Wagon> expected = wagons;
        train.removeWagon(train.getWagons().get(5));
        List<Wagon> actual = train.getWagons();
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void removeWagon_notContainWagons_getNullPointerException() {
        Wagon wagon = generateWagon();
        train.removeWagon(wagon);
    }

    @Test(expected = EmptyStackException.class)
    public void removeWagon_fromEmptyList_getEmptyStackException() {
        Train train1 = new Train(new Locomotive(10));
        train1.removeWagon(wagons.get(1));
    }

    @Test
    public void removeWagons_containWagons_passed() {
        List<Wagon> list4Delete = new ArrayList<Wagon>();
        list4Delete.add(train.getWagons().get(1));
        list4Delete.add(train.getWagons().get(5));
        wagons.remove(list4Delete.get(0));
        wagons.remove(list4Delete.get(1));
        List<Wagon> expected = wagons;
        train.removeWagons(list4Delete);
        List<Wagon> actual = train.getWagons();
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void removeWagons_notContainWagons_getNullPointerException() {
        List<Wagon> list4Delete = new ArrayList<Wagon>();
        Wagon wagon = generateWagon();
        Wagon wagon1 = generateWagon();
        list4Delete.add(wagon);
        list4Delete.add(wagon1);
        train.removeWagons(list4Delete);

    }

    @Test(expected = EmptyStackException.class)
    public void removeWagons_fromEmptyList_getEmptyStackException() {
        Train train1 = new Train(new Locomotive(10));
        train1.removeWagons(wagons);

    }

    @Test
    public void getWagons() {
        assertEquals(wagons, train.getWagons());
    }

    @Test
    public void getWagons_NOT_NULL() {
        Train train = new Train(new Locomotive(10));
        List<Wagon> actual = new ArrayList<Wagon>();
        actual = train.getWagons();
        assertNotNull(actual);
    }

    @Test
    public void addWagon_noTrainOverflow() {
        Wagon wagon = wagons.get(1);
        Train train1 = new Train(new Locomotive(10));
        train1.addWagon(wagon);
        List<Wagon> expected = new ArrayList<Wagon>();
        expected.add(wagon);
        List<Wagon> actual = train1.getWagons();

        assertEquals(expected, actual);
    }

    @Test(expected = StackOverflowError.class)
    public void addWagon_trainOverflow_getStackOverflowError() {
        Wagon wagon = generateWagon();
        train.addWagon(wagon);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addWagon_containsWagon_getIllegalArgumentException() {
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
        Wagon wagon = generateWagon();
        Wagon wagon1 = generateWagon();
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

    @Test
    public void toString_containWagons() {
        String expected = train.toString();
        String actual;

        StringBuffer trainInfo = new StringBuffer();
        trainInfo.append("\nTrain:\n");
            for (Wagon wagon : wagons) {
                trainInfo.append(wagon.toString() + "\n");
            }

        actual = trainInfo.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void toString_notContainWagons() {
        Train train1 = new Train(new Locomotive(1));
        String expected = train1.toString();
        String actual = "\nTrain:\nNo wagons";

        assertEquals(expected, actual);
    }
}
