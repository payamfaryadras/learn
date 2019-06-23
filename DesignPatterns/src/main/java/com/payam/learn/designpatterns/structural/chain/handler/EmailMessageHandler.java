package com.payam.learn.designpatterns.structural.chain.handler;


import com.payam.learn.designpatterns.structural.chain.DestinationType;
import com.payam.learn.designpatterns.structural.chain.Message;

public class EmailMessageHandler extends AbstractMessageHandler {
    public EmailMessageHandler(AbstractMessageHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void send(Message message) {
        System.out.println(message.getValue()+" sent via Email to :"+message.getDist().get(DestinationType.EMAIL));


    }
}
