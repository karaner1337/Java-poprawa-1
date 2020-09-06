package com.company.devices;

public class car extends device {
      public String model;
      public String producer;
      public String colour;
      public Double price;

      public String toString() {
        return producer + " " + model + " " + colour + " " + price;
      }
      @Override
      public boolean turnOn() {
            System.out.println("Włącz");
            return true;
      }



}
