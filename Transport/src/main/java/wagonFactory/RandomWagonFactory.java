package wagonFactory;

import interfaces.Wagon;
import interfaces.WagonFactory;

public class RandomWagonFactory extends AbstractRandomWagonFactory {

    public Wagon createWagon() {
        return generateWagon();
    }
}
