package wagonFactory;


class ReservedSeatWagonFactory extends AbstractRandomWagonFactory {

    public AbstractWagon createWagon( int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new ReservedSeatWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
