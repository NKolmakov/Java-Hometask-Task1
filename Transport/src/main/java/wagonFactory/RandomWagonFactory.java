package wagonFactory;

import interfaces.Wagon;

public class RandomWagonFactory extends AbstractRandomWagonFactory {
    public Wagon createWagon(){
       return generateWagon();
    }
}
