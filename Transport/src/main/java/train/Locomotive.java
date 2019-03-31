package train;
import org.apache.log4j.*;

public class Locomotive {
    private static final Logger logger = Logger.getLogger(Locomotive.class);
    private int tractionPower; // sets quantity of wagons in one train

    public Locomotive(int tractionPower) throws IllegalArgumentException{
        if (tractionPower > 0) {
            this.tractionPower = tractionPower;
        } else {
            logger.error("Illegal traction power: "+tractionPower);
            throw new IllegalArgumentException("Power must be greater then 0");
        }
    }

    public int getTractionPower(){
        return tractionPower;
    }
}
