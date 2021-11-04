package com.sapiens.SpringDemo.setterDI;

public class StaticMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Static message Service");
    }
}
