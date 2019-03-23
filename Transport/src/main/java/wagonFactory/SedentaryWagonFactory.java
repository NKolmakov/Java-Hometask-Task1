package wagonFactory;

import interfaces.*;
import wagons.SedentaryWagon;

class SedentaryWagonFactory implements WagonFactory {

    public Wagon createWagon( int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new SedentaryWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);

    }
}
