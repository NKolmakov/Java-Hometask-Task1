package wagons;

import interfaces.Wagon;

public class WagonHelper {

    public static void addPassenger(Wagon wagon,int amountOfPassengers){
        if (amountOfPassengers > 0){
            wagon.setAmountOfPassengers(wagon.getAmountOfPassengers()+amountOfPassengers);
        }else throw new IllegalArgumentException("Amount of passengers must be greater than 0");
    }

    public static void removePassenger(Wagon wagon,int amountOfPassenger){
        if (amountOfPassenger > 0) {
            wagon.setAmountOfPassengers(wagon.getAmountOfPassengers()-amountOfPassenger);
        } else {
            throw new IllegalArgumentException("Amount of passengers must be greater than 0");
        }
    }

    public static void addLuggage(Wagon wagon, int amountOfLuggage){
        if (amountOfLuggage > 0 ){
            wagon.setAmountOfLuggage(wagon.getAmountOfLuggage()+amountOfLuggage);
        }
        else throw new IllegalArgumentException("Luggage amount must be greater then 0");
    }

    public static void removeLuggage(Wagon wagon,int amountOfLuggage){
        if (amountOfLuggage > 0 ){
            wagon.setAmountOfLuggage(wagon.getAmountOfLuggage()-amountOfLuggage);
        }
        else throw new IllegalArgumentException("Luggage amount must be greater then 0");

    }
}
