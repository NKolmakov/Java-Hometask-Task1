package wagons;

final class ReservedSeatWagonFactory extends WagonFactory {

    public Wagon createWagon(int luggageCapacity,int amountOfLuggage,int amountOfSeats,int amountOfPassengers) throws IllegalAccessException {
        logger.debug("Called "+getClass());
        return new ReservedSeatWagon(luggageCapacity,amountOfLuggage,amountOfSeats,amountOfPassengers);

    }
}
