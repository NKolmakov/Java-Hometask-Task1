package wagons;

import interfaces.Wagon;

public class WagonHelper {
    public static void addPassenger(Wagon wagon,int passengerAmount){
        if (wagon.getAmountOfPassengers()+passengerAmount <= wagon.getAmountOfSeats()){
            wagon.setAmountOfPassengers(passengerAmount);
        }
    }
}
