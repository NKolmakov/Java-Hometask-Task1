package wagons;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class CompartmentWagon extends Wagon {
    private final static Logger logger = Logger.getLogger(CompartmentWagon.class);

    public CompartmentWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException {
        super(luggageCapacity,amountOfLuggage,amountOfSeats,amountOfPassengers);
        this.type = "compartment";
        this.convenience = 3;
        logger.info("Created compartment wagon");
    }


}
