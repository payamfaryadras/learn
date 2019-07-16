package com.payam.learn.designpatterns.behavioral.mediator;

import java.util.Date;

public abstract class SenderReceiver {

    protected MessageDelivery messageDelivery;
    private String name;

    public SenderReceiver(MessageDelivery messageDelivery, String name) {
        this.messageDelivery = messageDelivery;
        this.name = name;
        messageDelivery.registerClient(this);
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(SenderReceiver senderReceiver, String message) {
        System.out.println("------------------------------------------");
        System.out.println(getName());
        System.out.println(String.format("<%s><%s> : <%s>", senderReceiver.getName(), new Date().toString(), message));
    }

    public abstract void sendMessage(String userName, String message);
}
