package main.java.train;

public class Locomotive {
    private int tractionPower; // necessary for calculating amount of wagons in the train

    public Locomotive(int tractionPower){
        if (tractionPower > 0) {
            this.tractionPower = tractionPower;
        } else {
            throw new IllegalArgumentException("Power must be greater then 0");
        }
    }

    public int getTractionPower(){
        return tractionPower;
    }
}
