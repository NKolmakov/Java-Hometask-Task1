package wagonFactory;

import main.java.interfaces.Wagon;
import main.java.interfaces.WagonFactory;
import main.java.wagonTypes.ReservedSeatWagon;

public class ReservedSeatWagonFactory implements WagonFactory {

    public Wagon createWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new ReservedSeatWagon(number,amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
