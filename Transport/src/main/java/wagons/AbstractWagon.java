package wagons;

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
}
