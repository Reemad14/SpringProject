package com.sapiens.SpringDemo.setterDI;

public class ActiveMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending message Service");
    }
}
