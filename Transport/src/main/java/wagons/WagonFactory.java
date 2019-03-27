package wagons;

public class WagonFactory extends RandomWagonFactory {

    public Wagon createWagon(int luggageCapacity, int amountOfSeats, int amountOfLuggage, int amountOfPassengers) {
        return generateWagon();
    }

    //todo: find out what a fuck
}
