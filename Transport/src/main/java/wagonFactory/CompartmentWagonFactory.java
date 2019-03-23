package wagonFactory;

class CompartmentWagonFactory extends AbstractRandomWagonFactory {

    public AbstractWagon createWagon(int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new CompartmentWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
