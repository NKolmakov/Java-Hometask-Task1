import interfaces.*;
import train.*;
import wagonFactory.ReservedSeatWagonFactory;

import static train.TrainHelper.*;

public class Main {
    public static void main(String[] args) {
        WagonFactory wagonFactory = new ReservedSeatWagonFactory();
        Wagon wagon = wagonFactory.createWagon(1,10,20,40,50);
        Train train = new Train(new Locomotive(10));
        addWagon(wagon,train.setWagons(wagon));
    }
}
