package wagons;

class CompartmentWagon extends Wagon {

    public CompartmentWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException {
        super(luggageCapacity, amountOfLuggage, amountOfSeats, amountOfPassengers);
        this.type = "compartment";
        this.convenience = 3;
        logger.debug("Created compartment wagon");
    }


}
