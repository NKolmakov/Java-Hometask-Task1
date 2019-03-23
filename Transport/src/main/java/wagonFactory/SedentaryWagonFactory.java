package wagonFactory;

class SedentaryWagonFactory extends AbstractRandomWagonFactory {

    public AbstractWagon createWagon(int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new SedentaryWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);

    }
}
