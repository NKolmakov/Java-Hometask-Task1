import interfaces.Wagon;
import interfaces.WagonFactory;
import wagonFactory.ReservedSeatWagonFactory;

public class Main {
    public static void main(String[] args) {
        WagonFactory wagonFactory = new ReservedSeatWagonFactory();
        Wagon wagon = wagonFactory.createWagon(1,10,5,15,30);
        System.out.println("wagon: "+wagon.getNumber());
    }
}
