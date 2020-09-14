package com.company.devices;

import com.company.Salleable;
import com.company.creatures.human;

public class car extends device {
      public String colour;
      public Double price;

      public String toString() {
            return producer + " " + model + " " + colour + " " + price;
      }
      @Override
      public boolean turnOn() {
            System.out.println("wlacz");
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



}