package wagonFactory;

public class RandomWagonFactory extends AbstractRandomWagonFactory {

    public AbstractWagon createWagon(int luggageCapacity, int amountOfSeats, int amountOfLuggage, int amountOfPassengers) {
        return generateWagon();
    }
}
