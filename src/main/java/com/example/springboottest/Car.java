package com.example.springboottest;

public class Car {

    private String name;
    private int wheels;
    private boolean mot;



    public void nameOfManufactorer(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isMot() {
        return mot;
    }


    public void quantityOfWheels(int wheels){
        this.wheels = wheels;
    }
    public void hasMot(boolean mot){
        this.mot = mot;
    }
}
