package wagonFactory;

import interfaces.Wagon;

public class PassengerWagonFactory extends AbstractPassengerWagonFactory {
    public Wagon createWagon(){
       return generateWagon();
    }
}
