import interfaces.*;
import org.apache.log4j.PropertyConfigurator;
import train.*;
import wagonFactory.RandomWagonFactory;

import static train.TrainHelper.*;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.toString());
        PropertyConfigurator.configure("log4j.properties");
        Train train = new Train("Голубой вагон", new Locomotive(10));
        logger.info("Created train: " + train.getName());
        RandomWagonFactory wagonFactory = new RandomWagonFactory();
        List<Wagon> wagons = new ArrayList<Wagon>();

        List<Wagon> list4findedwagons = new ArrayList<Wagon>();

        for (int i = 0; i < 10; i++) {
            wagons.add(wagonFactory.createWagon());
        }

        train.addWagons(wagons);
        System.out.println("BEFORE REMOVE: \n" + train.toString());
        train.removeWagon(wagons.get(1));
        logger.info("Wagons have removed");
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
    }
    // find out why doesn't logger write to file and logger levels
    //create a test
}
