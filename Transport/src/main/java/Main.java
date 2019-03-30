import train.*;
import wagons.*;
import wagons.Wagon;

import static train.TrainHelper.*;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(new Locomotive(10));
        WagonFactory wagonFactory = new WagonFactory();
        List<Wagon> wagons = new ArrayList<Wagon>();

        List<Wagon> list4findedwagons = new ArrayList<Wagon>();

        for (int i = 0; i < 10; i++) {
            wagons.add(wagonFactory.generateWagon()); //-----------here-------------
        }

        train.addWagons(wagons);
        System.out.println("BEFORE REMOVE: \n" + train.toString());
        train.removeWagon(wagons.get(1));
        System.out.println("AFTER REMOVE: \n" + train.toString());

        //return exception version and complete logger
        //TODO: create packages with wagons
        //todo: check in all methods on null
    }
}
