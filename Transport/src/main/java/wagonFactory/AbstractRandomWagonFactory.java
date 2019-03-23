package wagonFactory;
import interfaces.Wagon;
import interfaces.WagonFactory;
import org.apache.log4j.Logger;

import java.util.Random;

public abstract class AbstractRandomWagonFactory {
    private static final Logger logger = Logger.getLogger(AbstractRandomWagonFactory.class);
    private int getRandomNumberInRange(int min,int max){
        if (min >= max){
            logger.error("Input values not equals requirements");
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random random = new Random();
        return random.nextInt((max-min)+1)+min;
    }

    private WagonFactory generateWagonFactory(){
        int randomWagonFactoryIndex = getRandomNumberInRange(1,3);
        switch (randomWagonFactoryIndex){
            case 1: return new SedentaryWagonFactory();
            case 2: return new ReservedSeatWagonFactory();
            case 3: return new CompartmentWagonFactory();
            default:return null;
        }

    }

    protected Wagon generateWagon(){
        WagonFactory wagonFactory = generateWagonFactory();

        int randomAmountOfSeats = getRandomNumberInRange(10,50);
        int randomLuggageCapacity = getRandomNumberInRange(10,100);
        int randomAmountOfPassengers;
        int randomAmountOfLuggage;

        while (true){
            randomAmountOfPassengers = getRandomNumberInRange(0,50);
            if (randomAmountOfPassengers <= randomAmountOfSeats){
                break;
            }
        }

        while (true){
            randomAmountOfLuggage = getRandomNumberInRange(0,100);
            if (randomAmountOfLuggage <= randomLuggageCapacity){
                break;
            }
        }


        return wagonFactory.createWagon(randomLuggageCapacity,randomAmountOfSeats,randomAmountOfLuggage,randomAmountOfPassengers);
    }

}
