package wagonFactory;

class SedentaryWagon extends AbstractWagon {

    public SedentaryWagon( int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        super(amountOfSeats, amountOfPassengers, amountOfLuggage, luggageCapacity);
        this.type = "sedentary";
        this.convenience = 1;
    }


}
