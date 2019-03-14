package main.java.train;

public class Locomotive {
    private int tractionPower; // necessary for calculating amount of wagons in the train

    public Locomotive(int tractionPower){
        this.tractionPower = tractionPower;
    }

    public int getTractionPower(){
        return tractionPower;
    }
}
