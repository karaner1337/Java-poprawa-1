package com.company;

import com.company.devices.car;

public class Main {

    public static void main(String[] args) {

        animal animal = new animal("dog") ;
        animal.feed();
        animal.feed();
        animal.walk();
        animal.walk();
        animal.walk();
        animal.walk();
        animal.walk();
        animal.walk();
        animal.walk();

        human human = new human();

        human.name = " Grzegorz";
        animal.name = " max";

        car audi = new car();
        audi.model = "q5";
        audi.producer = "audi";
        audi.colour ="black";
        audi.price = 1000.0;

        car renault = new car();
        renault.model = "clio";
        renault.producer = "renault";
        renault.colour ="red";
        renault.price = 600.0;


        human.addMyCar(audi);

        human.setNewCar(audi);

        System.out.println(human.toString());
        System.out.println(audi.toString());
        System.out.println(animal.toString());

    }

}
