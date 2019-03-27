package wagons;

import org.apache.log4j.Logger;

public abstract class Wagon {
    private int number;
    protected String type;
    protected int convenience;
    private int amountOfSeats;
    private int amountOfPassengers;
    private int amountOfLuggage;
    private int luggageCapacity;

    public static final Logger logger = Logger.getLogger(Wagon.class);
    public Wagon(int luggageCapacity, int amountOfSeats, int amountOfLuggage, int amountOfPassengers) {
        try {
            if (amountOfLuggage > luggageCapacity || amountOfPassengers > amountOfSeats){
                throw new IllegalArgumentException("Amount of luggage can't be greater than luggage capacity &" +
                        "\namount of passengers can't be greater than amount of seats\n" +
                        "\tamount of luggage: " + amountOfLuggage + "\n" +
                        "\tluggage capacity: " + luggageCapacity + "\n" +
                        "\tamount of passengers: " + amountOfPassengers + "\n" +
                        "\tamount of seats: " + amountOfSeats);
            }
            else {
                this.luggageCapacity = luggageCapacity;
                this.amountOfSeats = amountOfSeats;
                this.amountOfPassengers = amountOfPassengers;
                this.amountOfLuggage = amountOfLuggage;
            }
        } catch (IllegalArgumentException exception) {
            logger.error("Uncorrect capacity!",exception);
            this.number = -1;

        }
    }


    public int getLuggageCapacity() {
        return luggageCapacity;
    }


    public int getNumber() {
        return number;
    }


    public int getAmountOfSeats() {
        return amountOfSeats;
    }


    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }


    public int getAmountOfLuggage() {
        return amountOfLuggage;
    }


    public int getConvenience() {
        return convenience;
    }


    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString(){
        String info = "\nWagon "+number+"\n"+
                "\ttype: "+type+"\n"+
                "\tConvenience: "+convenience+"\n"+
                "\tAmount of seats: "+amountOfSeats+"\n" +
                "\tAmount of passengers: "+amountOfPassengers+"\n" +
                "\tAmount of luggage: "+amountOfLuggage +"\n" +
                "\tLuggage capacity: "+luggageCapacity;
       return info;
    }


}
