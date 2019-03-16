package wagons;

import interfaces.Wagon;

public class CompartmentWagon extends AbstractWagon implements Wagon {
    final static String TYPE = "Compartment";
    final static int CONVENIENCE = 3;

    public CompartmentWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        super(number, amountOfSeats, amountOfPassengers, amountOfLuggage, luggageCapacity);
    }

    @Override
    public void addPassenger(int passengers) {

    }

    @Override
    public void removePassenger(int passengers) {

    }

    @Override
    public void addLuggage(int luggage) {

    }

    @Override
    public void removeLuggage(int luggage) {

    }


}
