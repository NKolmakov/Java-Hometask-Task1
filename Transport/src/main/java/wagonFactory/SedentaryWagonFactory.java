package wagonFactory;

import main.java.interfaces.Wagon;
import main.java.interfaces.WagonFactory;
import main.java.wagonTypes.SedentaryWagon;

public class SedentaryWagonFactory implements WagonFactory {

    public Wagon createWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new SedentaryWagon(number,amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
