package com.company.devices;

import com.company.Salleable;
import com.company.human;

public class phone extends device  {
    @Override
    public boolean turnOn() {
        System.out.println("Włącz");
        return true;
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
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}