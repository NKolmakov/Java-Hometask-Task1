package wagons;

final class SedentaryWagonFactory extends AbstractWagonFactory {

    public Wagon createWagon(int luggageCapacity,int amountOfLuggage,int amountOfSeats,int amountOfPassengers) throws IllegalAccessException{
        return new SedentaryWagon(luggageCapacity, amountOfLuggage, amountOfSeats,amountOfPassengers);

    }
}
