package interfaces;

public interface WagonFactory {
    Wagon createWagon(int luggageCapacity, int amountOfSeats,int amountOfLuggage, int amountOfPassengers);
}
