package com.payam.learn.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Group extends SenderReceiver {
    private List<Client> clientList = new ArrayList<>();

    public List<Client> getClientList() {
        return clientList;
    }

    public Group(MessageDelivery messageDelivery, String name) {
        super(messageDelivery, name);
    }

    @Override
    public void sendMessage(String userName, String message) {
         clientList.forEach(c -> messageDelivery.broadcast(this,c.getName(),message));
    }
}
