package train;

import interfaces.Wagon;

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

    public static void addWagon(Wagon wagon,List<Wagon> wagons,Locomotive locomotive) {
        if (wagons.size() + 1 <= locomotive.getTractionPower()) {
            wagons.add(wagon);
        } else {
            throw new RuntimeException("Can't add wagon! Locomotive traction power allows contain" + locomotive.getTractionPower() + "wagons");
        }
    }

    public static void removeWagon(List<Wagon> wagons,Wagon wagon) {
        if (wagons.size() > 0) {
            wagons.remove(wagon);
        } else {
            throw new RuntimeException("train doesn't contain any wagons!");
        }
    }
}
