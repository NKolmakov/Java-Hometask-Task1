package wagons;

final class CompartmentWagonFactory extends WagonFactory {

    public Wagon createWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException {
        logger.debug("Called "+getClass());
        return new CompartmentWagon(luggageCapacity, amountOfLuggage, amountOfSeats, amountOfPassengers);
    }
}
