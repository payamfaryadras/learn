package com.payam.learn.designpatterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class MessageDelivery {

    private Map<String,SenderReceiver> receiverMap = new HashMap<>();


    public void registerClient(SenderReceiver senderReceiver) {
        receiverMap.put(senderReceiver.getName(),senderReceiver);
    }

    public void broadcast(SenderReceiver sender, String receiverName, String message) {
        if(receiverMap.get(receiverName)!=null){
           SenderReceiver receiver = receiverMap.get(receiverName);
           receiver.receiveMessage(sender,message);
        }
    }
}
