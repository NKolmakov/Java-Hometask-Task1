package wagons;

import interfaces.Wagon;

public class ReservedSeatWagon extends AbstractWagon implements Wagon {
    public ReservedSeatWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
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

    @Override
    public int getLuggageCapacity() {
        return 0;
    }

    @Override
    public int getNumber() {
        return number;
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

    @Override
    public void setNumber(int number) {

    }

    @Override
    public void setAmountOfLuggage(int amountOfLuggage) {

    }

    @Override
    public void setAmountOfPassengers(int amountOfPassengers) {

    }

    @Override
    public void setAmountOfSeats(int amountOfSeats) {

    }
}
