package train;

import interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Train implements PassengerTrain {
    private Locomotive locomotive;
    private List<Wagon> wagons = new ArrayList<Wagon>();

    public Train(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void addWagon(Wagon wagon){
        if (wagons.size()+1 <= locomotive.getTractionPower()){
            wagons.add(wagon);
        } else throw new StackOverflowError("Train's traction power doesn't allow to add anymore wagons");
    }
}
