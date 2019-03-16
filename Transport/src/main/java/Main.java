import interfaces.Wagon;
import interfaces.WagonFactory;
import wagonFactory.*;

public class Main {
    public static void main(String[] args) {
        WagonFactory wagonFactory = new CompartmentWagonFactory();
        Wagon wagon = wagonFactory.createWagon(1,10,5,30,50);
        System.out.println("wagon1: "+wagon.getNumber());

    }
}
