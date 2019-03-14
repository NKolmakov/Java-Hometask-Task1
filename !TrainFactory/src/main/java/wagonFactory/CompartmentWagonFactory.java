package main.java.wagonFactory;

import main.java.interfaces.Wagon;
import main.java.interfaces.WagonFactory;
import main.java.wagonTypes.CompartmentWagon;


public class CompartmentWagonFactory implements WagonFactory {
    @Override
    public Wagon createWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new CompartmentWagon(number,amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
