import interfaces.*;
import org.apache.log4j.PropertyConfigurator;
import train.*;
import wagonFactory.*;
import static train.TrainHelper.*;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Train train = new Train("Голубой вагон", new Locomotive(10));
        RandomWagonFactory wagonFactory = new RandomWagonFactory();
        List<Wagon> wagons = new ArrayList<Wagon>();

        List<Wagon> list4findedwagons = new ArrayList<Wagon>();

        for (int i = 0; i < 10; i++) {
            wagons.add(wagonFactory.createWagon()); //-----------here-------------
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

        WagonFactory wagonFactory1 = new ReservedSeatWagonFactory();
        Wagon wagon = wagonFactory1.createWagon(10,20,40,30);
        train.addWagon(wagon);
        System.out.println(train.toString());
    }
    //return exception version and complete logger
}
