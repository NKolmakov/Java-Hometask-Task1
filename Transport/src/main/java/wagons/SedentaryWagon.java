package wagons;

class SedentaryWagon extends Wagon {

    public SedentaryWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException {
        super(luggageCapacity,amountOfLuggage,amountOfSeats,amountOfPassengers);
        this.type = "sedentary";
        this.convenience = 1;
    }


}
