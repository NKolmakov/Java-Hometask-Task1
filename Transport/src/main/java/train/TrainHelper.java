package train;

import interfaces.Wagon;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrainHelper {

    public static int getCommonPassengerAmount(List<Wagon> wagons) {
        int passengerAmount = 0;
        for (Wagon wagon : wagons) {
            passengerAmount += wagon.getAmountOfPassengers();
        }
        return passengerAmount;
    }

    public static int getCommonLuggageAmount(List<Wagon> wagons) {
        int luggageAmount = 0;
        for (Wagon wagon : wagons) {
            luggageAmount += wagon.getAmountOfLuggage();
        }
        return luggageAmount;
    }

    public static void addWagon(Train train,Wagon wagon) {
        train.addWagon(wagon);
    }

    public static void removeWagon(List<Wagon> wagons,Wagon wagon) {
        if (wagons.size() > 0) {
            wagons.remove(wagon);
        } else {
            throw new RuntimeException("train doesn't contain any wagons!");
        }
    }

    public List<Wagon> findByPassengerAmount(int minRange, int maxRange, List<Wagon> list4FendedWagons,List<Wagon> wagons) {

        if (minRange >= 0 && maxRange >= 1) {
            for (Wagon wagon : wagons) {
                if (wagon.getAmountOfPassengers() >= minRange && wagon.getAmountOfPassengers() <= maxRange) {
                    list4FendedWagons.add(wagon);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal type of values! Range must be at least from 0 to 1");
        }

        return list4FendedWagons;

    }

    public static void sortWagonsByConvenience(List<Wagon> wagons) {
        Collections.sort(wagons, new Comparator<Wagon>() {

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
