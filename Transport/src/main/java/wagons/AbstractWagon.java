package wagons;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public abstract class AbstractWagon {
    private int number;
    protected String type;
    protected int convenience;
    private int amountOfSeats;
    private int amountOfPassengers;
    private int amountOfLuggage;
    private int luggageCapacity;

    private static final Logger logger = Logger.getLogger(AbstractWagon.class);
    public AbstractWagon(int luggageCapacity, int amountOfSeats, int amountOfLuggage, int amountOfPassengers) {
        PropertyConfigurator.configure("log4j.properties");
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


    public void setAmountOfLuggage(int amountOfLuggage) {
        if (amountOfLuggage >= 0 && this.amountOfLuggage + amountOfLuggage <= luggageCapacity) {
            this.amountOfLuggage = amountOfLuggage;
        } else throw new IllegalArgumentException("Luggage amount must be greater than 0");
    }


    public void setAmountOfPassengers(int amountOfPassengers) {
        if (amountOfPassengers > 0 && this.amountOfPassengers + amountOfPassengers <= amountOfSeats) {
            this.amountOfPassengers = amountOfPassengers;
        } else throw new RuntimeException("Passenger quantity can't be greater than seats quantity");
    }

    public void setNumber(int number) {
        if (number > 0)
        this.number = number;
        else {
            System.out.println("Wagon number can't be less than 1");
        }

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
