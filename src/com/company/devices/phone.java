package com.company.devices;

public class phone extends device  {
    @Override
    public boolean turnOn() {
        System.out.println("Włącz");
        return true;
    }
}
