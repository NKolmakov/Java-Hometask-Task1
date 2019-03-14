package main.java.wagonTypes;

import main.java.interfaces.Wagon;

public class SedentaryWagon implements Wagon {
    final static String TYPE ="Sedentary";
    final static int CONVENIENCE = 1;
    private int number;
    private int amountOfSeats;
    private int amountOfPassengers;
    private int amountOfLuggage;
    private int luggageCapacity;


    public SedentaryWagon(int number,int amountOfSeats,int amountOfPassengers,int amountOfLuggage,int luggageCapacity){
        this.number = number;
        this.amountOfSeats = amountOfSeats;
        this.amountOfPassengers = amountOfPassengers;
        this.amountOfLuggage = amountOfLuggage;
        this.luggageCapacity = luggageCapacity;
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
        return CONVENIENCE;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public String getType() {
        return TYPE;
    }

//    public void setNumber(int number) {
//        this.number = number;
//    }


//    public void setAmountOfLuggage(int amountOfLuggage) {
//        this.amountOfLuggage = amountOfLuggage;
//    }
//
//    public void setAmountOfPassengers(int amountOfPassengers) {
//        this.amountOfPassengers = amountOfPassengers;
//    }
//
//    public void setAmountOfSeats(int amountOfSeats) {
//        this.amountOfSeats = amountOfSeats;
//    }

    public void addPassenger(int passengers) {
        if (amountOfPassengers + passengers <= amountOfSeats) { //check for passenger capacity
            amountOfPassengers += passengers;
        } else {
            System.out.println("Can't add a passenger! There are no seats for this quantity of passengers!");
        }
    }

    public void removePassenger(int passenger) {
        if (amountOfPassengers - passenger >= 0) {
            amountOfPassengers -= passenger;
        } else {
            System.out.println("Error! Can't remove passenger. Check amount of passengers");
        }
    }

    public void addLuggage(int luggage) {
        if ((amountOfLuggage + luggage) <= luggageCapacity) {
            amountOfLuggage += luggage;
        } else {
            System.out.println("Can't add a luggage!");
        }
    }

    public void removeLuggage(int luggage) {
        if (amountOfLuggage - luggage >= 0) {
            amountOfLuggage -= luggage;
        } else {
            System.out.println("Error!Can't remove luggage! Check amount of luggage");
        }
    }

}
