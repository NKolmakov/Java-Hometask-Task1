package wagons;

class CompartmentWagonFactory extends RandomWagonFactory {

    public Wagon createWagon(int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new CompartmentWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
