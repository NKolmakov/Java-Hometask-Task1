package wagons;

import interfaces.Wagon;

public abstract class AbstractWagon {
    int number;
    int amountOfSeats;
    int amountOfPassengers;
    int amountOfLuggage;
    int luggageCapacity;

    public AbstractWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity){
        this.number = number;
        this.amountOfPassengers = amountOfPassengers;
        this.amountOfLuggage = amountOfLuggage;
        this.amountOfSeats = amountOfSeats;
        this.luggageCapacity = luggageCapacity;
    }

    public int getLuggageCapacity() {
        return 0;
    }


    public int getNumber() {
        return number;
    }


    public int getAmountOfSeats() {
        return 0;
    }


    public int getAmountOfPassengers() {
        return 0;
    }


    public int getAmountOfLuggage() {
        return 0;
    }


    public int getConvenience() {
        return 0;
    }


    public String getType() {
        return null;
    }


    public void setNumber(int number) {

    }


    public void setAmountOfLuggage(int amountOfLuggage) {
        if (amountOfLuggage >= 0){
            this.amountOfLuggage = amountOfLuggage;
        } else throw new IllegalArgumentException("");
    }


    public void setAmountOfPassengers(int amountOfPassengers) {
        if (amountOfPassengers>0  && this.amountOfPassengers+amountOfPassengers >= amountOfSeats){
            this.amountOfPassengers = amountOfPassengers;
        }else throw new RuntimeException("Passenger quantity can't be greater than seats quantity");
    }


}
