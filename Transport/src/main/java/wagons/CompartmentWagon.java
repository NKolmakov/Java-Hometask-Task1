package wagons;

public class CompartmentWagon extends Wagon{
    final static String TYPE = "Compartment";
    final static int CONVENIENCE = 3;
    public CompartmentWagon(int number, int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        this.number = number;
    }
}
