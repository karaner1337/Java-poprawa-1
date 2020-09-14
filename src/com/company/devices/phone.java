package com.company.devices;

import com.company.Salleable;
import com.company.creatures.human;

import java.net.URL;
import java.util.List;

public class phone extends device  {

    public String model;
    public static final String appName = "gra";
    public static final String version = "1.0";
    public static final String serverAddress = "12345";
    public List<String> appList;
    public URL url;





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

    public String installAnnApp(String appName) {

        return appName;
    }

    public String installAnnApp(String appName, String version) {

        return appName + version;
    }

    public String installAnnApp(String appName, String version, String serverAddress) {

        return appName + version + serverAddress;
    }

    public String installAnnApp(List<String> appList) {

        return appList.toString();
    }

    public String installAnnApp(URL url) {

        return url.toString();
    }

}