package train;

import interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train implements PassengerTrain {
    public Locomotive locomotive;
    List<Wagon> wagons = new ArrayList<Wagon>();
    private int commonPassengerAmount;
    private int commonLuggageAmount;


    public Train(Locomotive locomotive) {
        this.locomotive = locomotive;
    }


    public static void createPassengerTrain() {

    }



    public List<Wagon> getWagons() {
        return wagons;
    }

    public List<Wagon> findByPassengerAmount(int minRange, int maxRange, List<Wagon> list4FendedWagons) {

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
}
