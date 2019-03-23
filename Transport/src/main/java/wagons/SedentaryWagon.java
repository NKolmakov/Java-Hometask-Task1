package wagons;

class SedentaryWagon extends Wagon {

    public SedentaryWagon( int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        super(amountOfSeats, amountOfPassengers, amountOfLuggage, luggageCapacity);
        this.type = "sedentary";
        this.convenience = 1;
    }


}
