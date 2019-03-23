package wagonFactory;

import interfaces.*;
import wagons.CompartmentWagon;


class CompartmentWagonFactory implements WagonFactory {

    public Wagon createWagon(int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new CompartmentWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
