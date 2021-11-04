package com.sapiens.SpringDemo.electric;

public class Refrigerator implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is turned off");
    }
}
