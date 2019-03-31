package wagons;

public abstract class AbstractWagonFactory {

    protected abstract Wagon createWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException;

}
