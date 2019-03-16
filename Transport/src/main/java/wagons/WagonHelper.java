package wagons;

import interfaces.Wagon;

public class WagonHelper {
    public static void addPassenger(Wagon wagon,int amountOfPassengers){
        if (wagon.getAmountOfPassengers()+amountOfPassengers <= wagon.getAmountOfSeats()){
            wagon.setAmountOfPassengers(amountOfPassengers);
        }else throw new RuntimeException("Passenger quantity can't be greater than seats quantity");
    }

    public static void removePassenger(Wagon wagon,int amountOfPassenger){
        if (wagon.getAmountOfPassengers()-amountOfPassenger >=0){
            wagon.setAmountOfPassengers(amountOfPassenger);
        }
        else{
            throw new RuntimeException("Passenger quantity can't be less than 0");
        }
    }
}
