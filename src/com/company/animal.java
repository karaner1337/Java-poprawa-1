package com.company;

public class animal {
    final static Double DEFAULT_WEIGHT_DOG =4.0;
    final String species;
    String name;
    private Double weight;


    public animal(String species) {
        this.species = species;

        if(this.species == "dog"){
            weight= DEFAULT_WEIGHT_DOG;

        }


    }
    public String toString() {
        return species + " " + name + " " + weight;
    }

    void feed(){
        weight++;
        if(weight>=100) {
            System.out.println("zdechlem( przejedzenie");
        }else if (weight<=0){
            System.out.println("zdechlem nie nakarmisz mnie");
        }else
            System.out.println("thx for food, my weight is now" + weight);
    }
    void walk(){
        weight--;
        if(weight>=100) {
            System.out.println("zdechlem( przejedzenie nie wyprowadzisz mnie");
        }else if (weight<=0){
            System.out.println("zdechlem z przemeczenia");
        }else
            System.out.println("thx for walk, my weight is now" + weight);
    }

}
