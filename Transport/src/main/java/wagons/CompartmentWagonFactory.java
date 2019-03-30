package wagons;

class CompartmentWagonFactory extends RandomWagonFactory {

    public Wagon createWagon(int luggageCapacity,int amountOfLuggage,int amountOfSeats,int amountOfPassengers) throws IllegalAccessException {
        return new CompartmentWagon(luggageCapacity,amountOfLuggage,amountOfSeats,amountOfPassengers);
    }
}
