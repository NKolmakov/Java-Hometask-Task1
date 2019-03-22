package train;

import interfaces.Wagon;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.*;


public class TrainHelper {
    public static final Logger logger = Logger.getLogger(TrainHelper.class.toString());

    public static int getCommonPassengerAmount(Train train) {
        PropertyConfigurator.configure("log4j.properties");
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


    public static List<Wagon> findByPassengerAmount(int minRange, int maxRange,Train train) {

        List<Wagon> list4FendedWagons = new ArrayList<Wagon>();
        if (minRange < maxRange) {
            if (minRange >= 0 && maxRange >= 1) {
                for (Wagon wagon : train.getWagons()) {
                    if (wagon.getAmountOfPassengers() >= minRange && wagon.getAmountOfPassengers() <= maxRange) {
                        list4FendedWagons.add(wagon);
                    }
                }
            } else {
                System.out.println("Minimal range must not less than 0 and maximal range must be not less than 1 ");
            }
        } else {
            System.out.println("Minimal range can't be greater than maximal");
        }

        return list4FendedWagons;

    }

    public static void sortWagonsByConvenience(Train train) {
        Collections.sort(train.getWagons(), new Comparator<Wagon>() {

            public int compare(Wagon o1, Wagon o2) {
                int var1 = o1.getConvenience();
                int var2 = o2.getConvenience();
                if (var1 < var2){
                    return 1;
                }
                else if (var1 > var2){
                    return -1;
                }
                else return 0;
            }
        });
    }

}
