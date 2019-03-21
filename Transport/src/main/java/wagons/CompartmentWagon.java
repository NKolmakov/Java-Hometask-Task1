package wagons;

import interfaces.Wagon;

public class CompartmentWagon extends AbstractWagon implements Wagon {

    public CompartmentWagon(int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
           super(amountOfSeats, amountOfPassengers, amountOfLuggage, luggageCapacity);
           this.type = "compartment";
           this.convenience = 3;
    }


}
