import interfaces.*;
import train.*;
import wagonFactory.CompartmentWagonFactory;
import wagonFactory.PassengerWagonFactory;
import wagonFactory.ReservedSeatWagonFactory;

import static train.TrainHelper.*;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(new Locomotive(10));
        PassengerWagonFactory wagonFactory = new PassengerWagonFactory();
        Wagon wagon = wagonFactory.createWagon();
        Wagon wagon1 = wagonFactory.createWagon();
        train.addWagon(wagon);
        train.addWagon(wagon1);
        System.out.println("wagon1 number is:"+wagon.getNumber());
        System.out.println("wagon2 number is:"+wagon1.getNumber());

    }
}
