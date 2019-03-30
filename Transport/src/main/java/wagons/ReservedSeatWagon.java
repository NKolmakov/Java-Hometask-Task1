package wagons;

class ReservedSeatWagon extends Wagon {
    public ReservedSeatWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException {
        super(luggageCapacity,amountOfLuggage,amountOfSeats,amountOfPassengers);
        this.type = "ReservedSeat";
        this.convenience = 2;
    }


}
