import train.*;
import wagons.*;
import wagons.Wagon;

import static train.TrainHelper.*;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Train train = new Train("До Хогвартса", new Locomotive(10));
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
        System.out.println("SORTING: \n");
        sortWagonsByConvenience(train);
        System.out.println("ATER SORTING: \n" + train.toString());
        System.out.println("Common passenger amount: " + getCommonPassengerAmount(train) + "\n");
        System.out.println("Common luggage amount: " + getCommonLuggageAmount(train) + "\n");
        list4findedwagons.addAll(findByPassengerAmount(50, 40, train));
        System.out.println("FIND WAGONS: \n");
        if (list4findedwagons.size() > 0) {
            for (Wagon list : list4findedwagons) {
                System.out.println(list.toString());

            }
        } else {
            System.out.println("No finded wagons");
        }

        System.out.println("CHECKING WAGON FACTORY, USED IN ABSTRACT CLASS");
        RandomWagonFactory randomWagonFactory = new WagonFactory();
        Wagon wagon = randomWagonFactory.generateWagon();
        Train train1 = new Train(new Locomotive(10));
        train1.addWagon(wagon);
    }
    //return exception version and complete logger
    //TODO: create packages with wagons
}
