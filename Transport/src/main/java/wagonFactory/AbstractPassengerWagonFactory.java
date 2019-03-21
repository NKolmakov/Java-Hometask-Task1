package wagonFactory;
import interfaces.Wagon;
import interfaces.WagonFactory;

import java.util.Random;

public abstract class AbstractPassengerWagonFactory {

    private int getRandomNumberInRange(int min,int max){
        if (min >= max) throw new IllegalArgumentException("Max must be greater than min");

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
        int randomAmountOfSeats = getRandomNumberInRange(1,50);
        int randomAmountOfPassengers = getRandomNumberInRange(1,50);
        int ramdomAmountOfLuggage = getRandomNumberInRange(1,100);
        int randomLuggageCapacity = getRandomNumberInRange(1,100);

        return wagonFactory.createWagon(randomLuggageCapacity,randomAmountOfSeats,ramdomAmountOfLuggage,randomAmountOfPassengers);
    }

}
