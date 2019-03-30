package wagons;

public class WagonFactory extends RandomWagonFactory {

    public Wagon createWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) {
        return generateWagon();
    }

    //todo: find out what a fuck
}
