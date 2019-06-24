package com.payam.learn.designpatterns.behavioral.chain.handler;

import com.payam.learn.designpatterns.behavioral.chain.DestinationType;
import com.payam.learn.designpatterns.behavioral.chain.Message;

public class SMSMessageHandler extends AbstractMessageHandler {
    public SMSMessageHandler(AbstractMessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void send(Message message) {
        System.out.println(message.getValue()+" sent via SMS to :"+message.getDist().get(DestinationType.SMS));

    }


}
