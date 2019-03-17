package wagonFactory;

import interfaces.*;
import wagons.*;


public class ReservedSeatWagonFactory implements WagonFactory {

    public Wagon createWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new ReservedSeatWagon(number,amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
