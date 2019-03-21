package train;

public class Locomotive {
    private int tractionPower; // sets quantity of wagons in one train

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
