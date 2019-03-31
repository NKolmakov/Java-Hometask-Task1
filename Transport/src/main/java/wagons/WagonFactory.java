package wagons;

import org.apache.log4j.Logger;

public abstract class WagonFactory {
    public static final Logger logger = Logger.getLogger(WagonFactory.class);

    protected abstract Wagon createWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException;

}
