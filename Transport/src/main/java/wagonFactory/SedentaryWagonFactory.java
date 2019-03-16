package wagonFactory;

import interfaces.*;
import wagons.SedentaryWagon;

public class SedentaryWagonFactory implements WagonFactory {

    public Wagon createWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return (Wagon) new SedentaryWagon(number,amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
