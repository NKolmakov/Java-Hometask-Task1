package train;

import wagonFactory.AbstractWagon;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private String name;
    private int lastWagonNumber = 1; //helps to store information about last wagon number in the list
    private Locomotive locomotive;
    private List<AbstractWagon> wagons = new ArrayList<AbstractWagon>();

    public Train(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public Train(String name, Locomotive locomotive) {
        this.name = name;
        this.locomotive = locomotive;

    }

    public List<AbstractWagon> getWagons() {
        return wagons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWagon(AbstractWagon wagon) {
        if (wagons.size() + 1 <= locomotive.getTractionPower()) {
            if (!wagons.contains(wagon.getNumber()) && wagon.getNumber()!=-1) {
                wagon.setNumber(lastWagonNumber);
                wagons.add(wagon);
                lastWagonNumber++;
            } else System.out.println("AbstractWagon " + wagon.getNumber() + "already exists! New wagon won't be added");
        } else System.out.println("Maximum wagons quantity is reached!");
    }

    public void addWagons(List<AbstractWagon> wagons) {
        if (this.wagons.size() + wagons.size() <= locomotive.getTractionPower()) {
            for (AbstractWagon wagon : wagons) {
                if (!this.wagons.contains(wagon.getNumber())) {
                    wagon.setNumber(lastWagonNumber);
                    this.wagons.add(wagon);
                    lastWagonNumber++;
                } else System.out.println("AbstractWagon " + wagon.getNumber() + "already exists! New wagon won't be added");
            }
        } else System.out.println("Maximum wagons quantity is reached!");
    }

    public void removeWagon(AbstractWagon wagon) {
        if (this.wagons.size() > 0) {
            if (wagons.contains(wagon)) {
                wagons.remove(wagon);
            } else {
                System.out.println("Can't find wagon " + wagon.getNumber() + " in train " + name);
            }
        } else {
            System.out.println("Train doesn't contain any wagons!");
        }
    }

    public void removeWagons(List<AbstractWagon> wagons) {
        if (this.wagons.size() > 0) {
            for (AbstractWagon wagon : wagons) {
                if (this.wagons.contains(wagon)) {
                    this.wagons.remove(wagon);
                } else {
                    System.out.println("Can't find wagon " + wagon.getNumber() + " in train " + name);
                }
            }
        } else {
            System.out.println("Train doesn't contain any wagons!");
        }
    }
        @Override
        public String toString () {
            String trainInfo = "\nTrain: " + name + "\n";
            if (wagons.size() > 0) {
                for (AbstractWagon wagon : wagons) {
                    trainInfo += wagon.toString() + "\n";
                }
            } else trainInfo += "No wagons";


            return trainInfo;
        }

    }
