package wagons;


class ReservedSeatWagonFactory extends RandomWagonFactory {

    public Wagon createWagon(int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        return new ReservedSeatWagon(amountOfSeats,amountOfPassengers,amountOfLuggage,luggageCapacity);
    }
}
