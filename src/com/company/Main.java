package com.company;


import com.company.creatures.human;
import com.company.devices.car;
import com.company.devices.phone;
import com.company.creatures.animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.creatures.Feedable;
public class Main {

    public static void main(String[] args) {

        animal animal = new animal() {
            @Override
            public void feed(Double foodWeight) {



            }

        };

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

        phone phone = new phone();
        phone.setModel("Iphone");

        human seller = new human();
        seller.setPhone(phone);
        seller.setPet(animal);
        seller.addMyCar(audi);
        seller.setSalary(0.0);

        human buyer = new human();
        buyer.setSalary(0.0);
        buyer.setCash(8000);

        System.out.println("siano sprzedawcy przed sprzedaza " + seller.getCash());
        System.out.println("siano nabywcy przed kupnem  " + buyer.getCash());

        animal.salleable.sell(seller, buyer, 3000.0);
        audi.salleable.sell(seller, buyer, 2000.0);
        phone.salleable.sell(seller, buyer, 7000.0);

        System.out.println("siano sprzedawcy przed sprzedaza " + seller.getCash());
        System.out.println("siano nabywcy przed kupnem  " + buyer.getCash());

    }

}