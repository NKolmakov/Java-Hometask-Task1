package train;

import interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train implements PassengerTrain {
    private Locomotive locomotive;
    private List<Wagon> wagons = new ArrayList<Wagon>();
    private int commonPassengerAmount;
    private int commonLuggageAmount;


    public Train(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }
}
