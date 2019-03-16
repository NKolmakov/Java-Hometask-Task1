package wagonFactory;

import interfaces.*;
import wagons.CompartmentWagon;


public class CompartmentWagonFactory implements WagonFactory {

    public Wagon createWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new CompartmentWagon(number,amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
