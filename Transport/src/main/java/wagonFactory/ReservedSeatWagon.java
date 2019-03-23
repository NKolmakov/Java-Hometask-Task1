package wagonFactory;

class ReservedSeatWagon extends AbstractWagon{
    public ReservedSeatWagon( int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        super(amountOfSeats, amountOfPassengers, amountOfLuggage, luggageCapacity);
        this.type = "ReservedSeat";
        this.convenience = 2;
    }


}
