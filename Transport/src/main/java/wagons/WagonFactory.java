package wagons;

public class WagonFactory extends RandomWagonFactory {

    protected Wagon createWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException {
        return generateWagon();
    }

}
