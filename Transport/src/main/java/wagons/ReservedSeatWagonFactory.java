package wagons;

final class ReservedSeatWagonFactory extends AbstractWagonFactory {

    public Wagon createWagon(int luggageCapacity,int amountOfLuggage,int amountOfSeats,int amountOfPassengers) throws IllegalAccessException {
        return new ReservedSeatWagon(luggageCapacity,amountOfLuggage,amountOfSeats,amountOfPassengers);
    }
}
