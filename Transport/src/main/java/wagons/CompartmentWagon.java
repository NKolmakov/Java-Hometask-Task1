package wagons;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class CompartmentWagon extends Wagon {
    private final static Logger logger = Logger.getLogger(CompartmentWagon.class);

    public CompartmentWagon(int amountOfSeats, int amountOfPassengers, int amountOfLuggage, int luggageCapacity) {
        super(amountOfSeats, amountOfPassengers, amountOfLuggage, luggageCapacity);
        PropertyConfigurator.configure("log4j.properties");
        this.type = "compartment";
        this.convenience = 3;
        logger.info("Created compartment wagon");
    }


}
