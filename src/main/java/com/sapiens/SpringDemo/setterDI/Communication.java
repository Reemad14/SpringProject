package com.sapiens.SpringDemo.setterDI;

public class Communication {
    private Messaging messaging;

    public Messaging getMessaging() {
        return messaging;
    }

    //DI Via Setter
    public void setMessaging(Messaging messaging) {
        this.messaging = messaging;
    }
    public void communication(){
        messaging.sendMessage();
    }

}
