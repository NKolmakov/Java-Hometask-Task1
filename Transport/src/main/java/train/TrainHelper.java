package train;

import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.*;
import wagons.Wagon;


public class TrainHelper {
    public static final Logger logger = Logger.getLogger(TrainHelper.class.toString());

    public static int getCommonPassengerAmount(Train train) {
        int passengerAmount = 0;
        for (Wagon wagon : train.getWagons()) {
            passengerAmount += wagon.getAmountOfPassengers();
        }
        logger.info("Calculated passenger amount");
        return passengerAmount;
    }

    public static int getCommonLuggageAmount(Train train) {
        int luggageAmount = 0;
        for (Wagon wagon : train.getWagons()) {
            luggageAmount += wagon.getAmountOfLuggage();
        }
        return luggageAmount;
    }


    public static List<Wagon> findByPassengerAmount(int minRange, int maxRange, Train train) {

        List<Wagon> list4FendedWagons = new ArrayList<Wagon>();
        if (minRange < maxRange && minRange >= 0 && maxRange >= 1) {
            for (Wagon wagon : train.getWagons()) {
                if (wagon.getAmountOfPassengers() >= minRange && wagon.getAmountOfPassengers() <= maxRange) {
                    list4FendedWagons.add(wagon);
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid range!");
        }
        return list4FendedWagons;

    }


    public static void sortWagonsByConvenience(Train train) {
        Collections.sort(train.getWagons(), new Comparator<Wagon>() {

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
    }

    public static boolean isContains(List<Wagon> wagons, Wagon wagon) {
        for (Wagon wagon1 : wagons) {
            if (wagon1.getNumber() == wagon.getNumber()) {
                return true;
            }
        }
        return false;
    }

}
