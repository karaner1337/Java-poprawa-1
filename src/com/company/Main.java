package com.company;

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

        car audi = new car();
        audi.model = "q5";
        audi.producer = "audi";
        audi.colour ="black";
        audi.price = 1000.0;


        human.addMyCar(audi);

        human.setNewCar(audi);



    }

}
