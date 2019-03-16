package train;

import interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train implements PassengerTrain {
   public Locomotive locomotive;
   List<Wagon> wagons = new ArrayList<Wagon>();
    private int commonPassengerAmount;
    private int commonLuggageAmount;


    public Train(Locomotive locomotive){
        this.locomotive = locomotive;
    }


    public static void createPassengerTrain(){

    }

    public int getCommonPassengerAmount() {
        int passengerAmount = 0;
        for(Wagon wagon:wagons){
            passengerAmount+=wagon.getAmountOfPassengers();
        }
        return passengerAmount;
    }

    public int getCommonLuggageAmount() {
        int luggageAmount = 0;
        for(Wagon wagon:wagons){
            luggageAmount+=wagon.getAmountOfLuggage();
        }
        return luggageAmount;
    }

    public void sortWagonsByConvenience() {
        Collections.sort(wagons, new Comparator<Wagon>() {

            public int compare(Wagon o1, Wagon o2) {
                int var1 = o1.getConvenience();
                int var2 = o2.getConvenience();
                if (var1 < var2){
                    return 1;
                }
                else if (var1 > var2){
                    return -1;
                }
                else return 0;
            }
        });
    }

    public void addWagon(Wagon wagon){
        if (wagons.size()+1 <= locomotive.getTractionPower()) {
            wagons.add(wagon);
        }else{
            throw new RuntimeException("Can't add wagon! Locomotive traction power allows contain"+locomotive.getTractionPower()+"wagons");
        }
    }

    public void removeWagon(Wagon wagon){
        if (wagons.size() > 0) {
            wagons.remove(wagon);
        } else {
            throw new RuntimeException("train doesn't contain any wagons!");
        }
    }

    public void getWagons(){
        for(Wagon wagon:wagons){
            System.out.println("wagon number: "+wagon.getNumber()+" wagon convenience: "+wagon.getConvenience());
        }
    }

    public List<Wagon> findByPassengerAmount(int minRange, int maxRange, List<Wagon> list4FindedWagons){

        if (minRange >=0 && maxRange>=1) {
            for(Wagon wagon:wagons){
                if(wagon.getAmountOfPassengers()>=minRange && wagon.getAmountOfPassengers()<=maxRange){
                    list4FindedWagons.add(wagon);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal type of values! Range must be at least from 0 to 1");
        }

        return list4FindedWagons;

    }
}
