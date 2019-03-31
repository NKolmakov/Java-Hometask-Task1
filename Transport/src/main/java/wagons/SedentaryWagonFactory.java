package wagons;

final class SedentaryWagonFactory extends WagonFactory {

    public Wagon createWagon(int luggageCapacity,int amountOfLuggage,int amountOfSeats,int amountOfPassengers) throws IllegalAccessException{
        logger.debug("Called "+getClass());
        return new SedentaryWagon(luggageCapacity, amountOfLuggage, amountOfSeats,amountOfPassengers);

    }
}
