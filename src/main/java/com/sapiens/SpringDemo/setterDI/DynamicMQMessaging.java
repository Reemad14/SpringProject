package com.sapiens.SpringDemo.setterDI;

public class DynamicMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Dynamic message Service");
    }
}
