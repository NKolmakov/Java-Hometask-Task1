package train;

import wagons.Wagon;

import static train.TrainHelper.*;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Train {
    private int lastWagonNumber = 1; //helps to store information about last wagon number in the list
    private Locomotive locomotive;
    private List<Wagon> wagons = new ArrayList<Wagon>();

    public Train(Locomotive locomotive) throws IllegalArgumentException {
        this.locomotive = locomotive;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    @Override
    public String toString() {
        StringBuffer trainInfo = new StringBuffer();
        trainInfo.append("\nTrain:\n");
        if (wagons.size() > 0) {
            for (Wagon wagon : wagons) {
                trainInfo.append(wagon.toString() + "\n");
            }
        } else trainInfo.append("No wagons");

        return trainInfo.toString();
    }

    public void addWagon(Wagon wagon) throws IllegalArgumentException, StackOverflowError {
        if (wagons.size() + 1 <= locomotive.getTractionPower()) {
            if (!isContains(wagons, wagon)) {
                wagon.setNumber(lastWagonNumber);
                wagons.add(wagon);
                lastWagonNumber++;
            } else {
                logger.error("Wagon" + wagon.getNumber() + "already exists");
                throw new IllegalArgumentException("Wagon " + wagon.getNumber() + "already exists");
            }
        } else {
            logger.error("Locomotive traction power doesn't allow to add more wagons");
            throw new StackOverflowError("Locomotive traction power doesn't allow to add more wagons");
        }
    }

    public void addWagons(List<Wagon> wagons) {
        if (this.wagons.size() + wagons.size() <= locomotive.getTractionPower()) {
            for (Wagon wagon : wagons) {
                if (!isContains(this.wagons, wagon)) {
                    wagon.setNumber(lastWagonNumber);
                    this.wagons.add(wagon);
                    lastWagonNumber++;
                } else {
                    logger.error("Wagon" + wagon.getNumber() + "already exists");
                    throw new IllegalArgumentException("Wagon " + wagon.getNumber() + "already exists");
                }
            }
        } else {
            logger.error("Locomotive traction power doesn't allow to add more wagons");
            throw new StackOverflowError("Locomotive traction power doesn't allow to add more wagons");
        }
    }

    public void removeWagon(Wagon wagon) {
        if (this.wagons.size() > 0) {
            if (isContains(wagons, wagon)) {
                wagons.remove(wagon);
            } else {
                logger.error("wagon " + wagon.getNumber() + " not exists!");
                throw new NullPointerException("Wagon not exists!");
            }
        } else {
            logger.error("Can't delete wagon from empty list");
            throw new EmptyStackException();
        }
    }

    public void removeWagons(List<Wagon> wagons) {
        if (this.wagons.size() > 0) {
            for (Wagon wagon : wagons) {
                if (isContains(this.wagons, wagon)) {
                    this.wagons.remove(wagon);
                } else {
                    logger.error("wagon " + wagon.getNumber() + " not exists!");
                    throw new NullPointerException("Can't find wagon " + wagon.getNumber() + " in train ");
                }
            }
        } else {
            logger.error("Can't delete wagon from empty list");
            throw new EmptyStackException();
        }
    }

}
