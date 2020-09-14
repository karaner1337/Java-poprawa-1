package com.company.creatures;

import com.company.Salleable;

public abstract class animal implements Feedable {
    public Double DEFAULT_WEIGHT_DOG =4.0;
    public String species;
    public String name;
    public Double weight;


    public animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }
    public animal() {
        this.weight = 20.0;
    }





    public String toString() {
        return species + " " + name + " " + weight;
    }

    public void feed(){
        weight++;
        if(weight>=100) {
            System.out.println("zdechlem( przejedzenie");
        }else if (weight<=0){
            System.out.println("zdechlem nie nakarmisz mnie");
        }else
            System.out.println("thx for food, my weight is now" + weight);
    }
    public void walk(){
        weight--;
        if(weight>=100) {
            System.out.println("zdechlem( przejedzenie nie wyprowadzisz mnie");
        }else if (weight<=0){
            System.out.println("zdechlem z przemeczenia");
        }else
            System.out.println("thx for walk, my weight is now" + weight);
    }
    public Salleable salleable = new Salleable() {
        @Override
        public void sell(human seller, human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("brak zwierzat");
                } else {
                    System.out.println("zwierzeta dostepne");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }

                if (seller.getCar() == null) {
                    System.out.println("brak auta");
                } else {
                    System.out.println("auto dostepne");
                }

                if (seller.getPhone() == null) {
                    System.out.println("brak telefonu");
                } else {
                    System.out.println("telefon dystepny");
                }
            }else {
                System.out.println("brak siana");
            }


        }

    };

}