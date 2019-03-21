package train;

import interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Train implements PassengerTrain {
    private int lastWagonNumber = 1;
    private Locomotive locomotive;
    private List<Wagon> wagons = new ArrayList<Wagon>();

    public Train(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void addWagon(Wagon wagon) {
        if (wagons.size() + 1 <= locomotive.getTractionPower()) {
            if (!wagons.contains(wagon.getNumber())) {
                wagon.setNumber(lastWagonNumber);
                wagons.add(wagon);
                lastWagonNumber++;
            }else throw new IllegalArgumentException("Wagon with same number already exists!");
        } else throw new StackOverflowError("Train's traction power doesn't allow to add anymore wagons");
    }


    public void addWagons(Wagon ... wagons){
        if (this.wagons.size() + wagons.length <= locomotive.getTractionPower()) {
            for(Wagon wagon:wagons){
                if (!this.wagons.contains(wagon.getNumber())) {
                    this.wagons.add(wagon);
            }else throw new IllegalArgumentException("Wagon with same number already exists!");
            }
        } else throw new StackOverflowError("Train's traction power doesn't allow to add anymore wagons");
    }

    public void removeWagon(Wagon wagon) {
        if (this.wagons.size() > 0 ) {
            if (wagons.contains(wagon)) {
                wagons.remove(wagon);
            } else {
                throw new RuntimeException("Train doesn't contain this wagon");
            }
        } else {
            throw new RuntimeException("train doesn't contain any wagons!");
        }
    }

    public void removaWagons(Wagon ... wagons){
        if (this.wagons.size() > 0 ) {
            for (Wagon wagon:wagons) {
                if (this.wagons.contains(wagon)) {
                    this.wagons.remove(wagon);
                } else {
                    throw new RuntimeException("Train doesn't contain this wagon");
                }
            }
        } else {
            throw new RuntimeException("train doesn't contain any wagons!");
        }
    }

}
