package main.java.train;

import main.java.interfaces.PassengerTrain;
import main.java.interfaces.Wagon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train implements PassengerTrain {
   public Locomotive locomotive;
   List<Wagon> wagons;
    private int commonPassengerAmount;
    private int commonLuggageAmount;


    public Train(){
        this.locomotive = new Locomotive(100);
        wagons = new ArrayList<>(locomotive.getTractionPower()); //wagons
    }


    public static void createPassengerTrain(){

    }


    @Override
    public int getCommonPassengerAmount() {
        int passengerAmount = 0;
        for(Wagon wagon:wagons){
            passengerAmount+=wagon.getAmountOfPassengers();
        }
        return passengerAmount;
    }

    @Override
    public int getCommonLuggageAmount() {
        int luggageAmount = 0;
        for(Wagon wagon:wagons){
            luggageAmount+=wagon.getAmountOfLuggage();
        }
        return luggageAmount;
    }

    @Override
    public void sortWagonsByConvenience() {
        Collections.sort(wagons, new Comparator<Wagon>() {
            @Override
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
        wagons.add(wagon);
    }

    public void removeWagon(Wagon wagon){
        wagons.remove(wagon);
    }

    public void getWagons(){
        for(Wagon wagon:wagons){
            System.out.println("wagon number: "+wagon.getNumber()+" wagon convenience: "+wagon.getConvenience());
        }
    }

    public List<Wagon> findByPassengerAmount(int minRange, int maxRange, java.awt.List list){
        List<Wagon> findedWagons = new ArrayList<Wagon>();

        if (minRange >=0 && maxRange>=1) {
            for(Wagon wagon:wagons){
                if(wagon.getAmountOfPassengers()>=minRange && wagon.getAmountOfPassengers()<=maxRange){
                    findedWagons.add(wagon);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal type of values! Range must be at least from 0 to 1");
        }

        return findedWagons;

    }
}
