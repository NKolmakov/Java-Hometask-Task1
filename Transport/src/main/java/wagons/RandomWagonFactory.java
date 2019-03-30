package wagons;
import org.apache.log4j.Logger;

import java.util.Random;

public abstract class RandomWagonFactory {
    private static final Logger logger = Logger.getLogger(RandomWagonFactory.class);
    private int getRandomNumberInRange(int min,int max){
        if (min >= max){
            logger.error("Input values not equals requirements");
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random random = new Random();
        return random.nextInt((max-min)+1)+min;
    }

    private RandomWagonFactory generateWagonFactory(){
        int randomWagonFactoryIndex = getRandomNumberInRange(1,3);
        switch (randomWagonFactoryIndex){
            case 1: return new SedentaryWagonFactory();
            case 2: return new ReservedSeatWagonFactory();
            case 3: return new CompartmentWagonFactory();
            default:return null;
        }

    }

    public Wagon generateWagon(){
        RandomWagonFactory wagonFactory = generateWagonFactory();
        Wagon wagon;

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

        try {
            wagon = wagonFactory.createWagon(randomLuggageCapacity,randomAmountOfLuggage,randomAmountOfSeats,randomAmountOfPassengers);
            return wagon;
        }catch (IllegalAccessException ex){
            logger.error(ex.getMessage());
            return null;
        }


    }

    protected abstract Wagon createWagon(int luggageCapacity, int amountOfLuggage, int amountOfSeats, int amountOfPassengers) throws IllegalAccessException;

}
