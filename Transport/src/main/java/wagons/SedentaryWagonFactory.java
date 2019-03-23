package wagons;

class SedentaryWagonFactory extends RandomWagonFactory {

    public Wagon createWagon(int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new SedentaryWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);

    }
}
