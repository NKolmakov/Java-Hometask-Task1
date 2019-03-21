package wagonFactory;

import interfaces.*;
import wagons.*;


public class ReservedSeatWagonFactory implements WagonFactory {

    public Wagon createWagon( int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new ReservedSeatWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
