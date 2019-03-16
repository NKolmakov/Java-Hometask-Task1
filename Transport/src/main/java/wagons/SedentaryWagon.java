package wagons;

import interfaces.Wagon;

public class SedentaryWagon extends AbstractWagon implements Wagon {

    public SedentaryWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        super(number, amountOfSeats, amountOfPassengers, amountOfLuggage, luggageCapacity);
        this.type = "sedentary";
        this.convenience = 1;
    }


}
