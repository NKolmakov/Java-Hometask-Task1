package interfaces;

public interface WagonFactory {
    Wagon createWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity);
}
