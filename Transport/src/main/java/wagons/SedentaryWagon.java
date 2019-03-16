package wagons;

import interfaces.Wagon;

public class SedentaryWagon extends AbstractWagon implements Wagon {

    public SedentaryWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        super();
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

    @Override
    public int getLuggageCapacity() {
        return 0;
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getAmountOfSeats() {
        return 0;
    }

    @Override
    public int getAmountOfPassengers() {
        return 0;
    }

    @Override
    public int getAmountOfLuggage() {
        return 0;
    }

    @Override
    public int getConvenience() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
}
