package com.sapiens.SpringDemo.setterDI;

public class UniqueMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Unique message Service");
    }
}
