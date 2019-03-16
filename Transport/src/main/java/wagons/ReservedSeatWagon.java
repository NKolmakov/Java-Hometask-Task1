package wagons;

import interfaces.Wagon;

public class ReservedSeatWagon extends AbstractWagon implements Wagon {
    public ReservedSeatWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        super(number, amountOfSeats, amountOfPassengers, amountOfLuggage, luggageCapacity);
        this.type = "ReservedSeat";
        this.convenience = 2;
    }


}
