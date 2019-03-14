package main;

import main.java.interfaces.*;
import main.java.train.Locomotive;
import main.java.train.*;
import main.java.wagonFactory.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        WagonFactory wagonFactory = createWagonByType("compartment");
        Wagon wagon = wagonFactory.createWagon(1,30,15,30,60);
        Wagon wagon1 = wagonFactory.createWagon(2,20,20,20,50);
        wagonFactory = createWagonByType("sedentary");
        Wagon wagon2 = wagonFactory.createWagon(3,40,20,20,50);
        Wagon wagon3 = wagonFactory.createWagon(3,40,40,20,50);

       // System.out.println("wagon luggage: "+wagon.getLuggageCapacity());
        Locomotive locomotive = new Locomotive(5);
        Train train = new Train(locomotive);
        train.addWagon(wagon);
        train.addWagon(wagon1);
        train.addWagon(wagon2);
        train.addWagon(wagon3);
        System.out.println("quantity of pass:"+train.getCommonPassengerAmount());
        System.out.println("quantity of lugg:"+train.getCommonLuggageAmount());

        train.getWagons();
        System.out.println("remove wagon number 1");
        train.removeWagon(wagon);
        train.getWagons();

        System.out.println("try to find wagons by passengers:");

        List<Wagon> list = new ArrayList<>();

        train.findByPassengerAmount(15,20,list);

        for(Wagon wagon4:list){
            System.out.println(wagon4.getNumber()+" "+wagon4.getType());
        }

    }

        static WagonFactory createWagonByType (String type){
            switch (type.toLowerCase()) {
                case "compartment":
                    new CompartmentWagonFactory();
                case "reservedseat":
                    return new ReservedSeatWagonFactory();
                case "sedentary":
                    return new SedentaryWagonFactory();
                default:
                    throw new RuntimeException(type + ": unknown wagon type");

            }
        }

}

