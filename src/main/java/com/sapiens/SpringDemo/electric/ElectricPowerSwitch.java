package com.sapiens.SpringDemo.electric;

public class ElectricPowerSwitch implements Switch{
    public boolean on;
    public Switchable client;

    public ElectricPowerSwitch( Switchable client) {
        this.on = false;
        this.client = client;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if(checkOn){
            client.turnOff();
            this.on = false;
        }else{
            client.turnOn();
            this.on = true;
        }
    }

    public static void main(String[] args) {
        System.out.println("---------- TV Switch ----------");
        Switchable switchableTV = new TV();
        Switch tvPowerSwitch = new ElectricPowerSwitch(switchableTV);
        tvPowerSwitch.press();
        tvPowerSwitch.press();

        System.out.println("\n---------- Refrigerator Switch ----------");
        Switchable switchableRefrigerator = new Refrigerator();
        Switch refrigeratorPowerSwitch = new ElectricPowerSwitch(switchableRefrigerator);
        refrigeratorPowerSwitch.press();
        refrigeratorPowerSwitch.press();

        System.out.println("\n---------- Cooler Switch ----------");
        Switchable switchableCooler = new Cooler();
        Switch coolerPowerSwitch = new ElectricPowerSwitch(switchableCooler);
        coolerPowerSwitch.press();
        coolerPowerSwitch.press();

        System.out.println("\n---------- AC Switch ----------");
        Switchable switchableAC = new AC();
        Switch acPowerSwitch = new ElectricPowerSwitch(switchableAC);
        acPowerSwitch.press();
        acPowerSwitch.press();

        System.out.println("\n---------- Light Switch ----------");
        Switchable switchableLight = new Light();
        Switch lightPowerSwitch = new ElectricPowerSwitch(switchableLight);
        lightPowerSwitch.press();
        lightPowerSwitch.press();

    }
}
