package com.sapiens.SpringDemo.electric;

public class TV implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off");
    }
}
