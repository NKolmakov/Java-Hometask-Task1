package wagonFactory;

import interfaces.*;
import interfaces.Wagon;
import wagons.*;


public class ReservedSeatWagonFactory implements WagonFactory {

    public Wagon createWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return (Wagon) new ReservedSeatWagon(number,amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
